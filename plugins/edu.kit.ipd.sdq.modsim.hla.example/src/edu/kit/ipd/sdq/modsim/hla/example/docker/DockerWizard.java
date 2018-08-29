package edu.kit.ipd.sdq.modsim.hla.example.docker;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import org.eclipse.emf.common.ui.CommonUIPlugin;
import org.eclipse.emf.common.ui.wizard.ExampleInstallerWizard;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.ProgressBar;

public class DockerWizard extends ExampleInstallerWizard {
	
	
	
	public class DockerProjectPage extends ProjectPage {
		
		protected Button localRTIRadioButton;
		protected Button dockerRTIRadioButton;
		protected Button installDockerButton;
		protected ProgressBar dockerDownloadProgressBar;
		protected MessageBox linuxProceedMessageBox;
		private String hostOS = System.getProperty("os.name").toLowerCase();
		private String dockerButtonText = "Docker Portico container RTI engine";
		private String linuxInstallCommand = "sudo apt-get remove docker docker-engine docker-ce docker.io;"
				+ "sudo apt-get update;"
				+ "sudo apt-get install apt-transport-https ca-certificates curl software-properties-common;"
				+ "curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -;"
				+ "sudo apt-key fingerprint 0EBFCD88;"
				+ "sudo add-apt-repository \"deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable\";"
				+ "sudo apt-get update;"
				+ "sudo apt-get install docker-ce;"
				+ "sudo docker run hello-world;";
		

		public DockerProjectPage(String pageName, String title, ImageDescriptor titleImage) {
			super(pageName, title, titleImage);
			setPageComplete(false);
		}
		
		@Override
		public void createControl(Composite parent) {
			super.createControl(parent);
			
			Composite composite = (Composite)getControl();
			
			Group dockerGroup = new Group(composite, SWT.NONE);
			dockerGroup.setLayout(new GridLayout(2, false));
			dockerGroup.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL, true, false));
			dockerGroup.setText("Choose Portico RTI engine");
			
			localRTIRadioButton = new Button(dockerGroup, SWT.RADIO);
			localRTIRadioButton.setText("Local plugin Portico RTI engine");
			localRTIRadioButton.setSelection(true);
			localRTIRadioButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					asyncRefresh();
				}
			});
			
			
			installDockerButton = new Button(dockerGroup, SWT.PUSH);
			installDockerButton.setText("Install Docker");
			installDockerButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if(hostOS.startsWith("windows") || hostOS.startsWith("mac")) {
						installDocker(true);
					} else {
						linuxProceedMessageBox = new MessageBox(composite.getShell(), SWT.ICON_QUESTION | SWT.YES | SWT.NO);
						linuxProceedMessageBox.setText("Installation for Linux");
						linuxProceedMessageBox.setMessage("You seem to be running Linux. \n"
								+ "The docker installation process provided by this plugin only works for the following Linux Distributions:\n"
								+ "\n"
								+ "- Ubuntu Bionic 18.04 (LTS)\n"
								+ "- Ubuntu Artful 17.10\n" 
								+ "- Ubuntu Xenial 16.04 (LTS)\n"
								+ "\n"
								+ "If you are running one of those distributions you can continue this process with YES.\n"
								+ "\n"
								+ "If you are running Ubuntu Trusty 14.04 (LTS) or some other Linux distribution please perform the installation as described here:\n"
								+ "https://docs.docker.com/install/#supported-platforms\n"
								+ "(The link will be openened automatically when you click NO)");
						int messageBoxResponse = linuxProceedMessageBox.open();
						if(messageBoxResponse == SWT.YES) {
							installDocker(false);
						} else {
							try {
								Desktop.getDesktop().browse(new URI("https://docs.docker.com/install/#supported-platforms"));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				}
			});
			installDockerButton.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, true, false));
			installDockerButton.setVisible(false);
			
			dockerRTIRadioButton = new Button(dockerGroup, SWT.RADIO);
			dockerRTIRadioButton.setText(dockerButtonText);
			dockerRTIRadioButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					Button source = (Button)e.getSource();
					if(source.getSelection()) {
						if(dockerCLIInstalled()) {
							dockerRTIRadioButton.setText(dockerButtonText + ": installed!");
							dockerRTIRadioButton.getParent().layout();
						} else {
							dockerRTIRadioButton.setText(dockerButtonText + ": not installed!");
							installDockerButton.setVisible(true);
							dockerRTIRadioButton.getParent().layout();
							installDockerButton.getParent().layout();
							dockerGroup.layout();
						}
					} else {
						dockerRTIRadioButton.setText(dockerButtonText);
						installDockerButton.setVisible(false);
						installDockerButton.getParent().layout();
					}
					asyncRefresh();
				}
			});
			
			dockerDownloadProgressBar = new ProgressBar(dockerGroup, SWT.INDETERMINATE);
			dockerDownloadProgressBar.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, true, false));
			dockerDownloadProgressBar.setVisible(false);
			
		}
		
		private boolean dockerCLIInstalled(){
			ProcessBuilder checkDockerPB;
			
			if(hostOS.startsWith("windows")) {
				checkDockerPB = new ProcessBuilder("CMD", "/C", "docker -v");
			} else {
				checkDockerPB = new ProcessBuilder("bash", "-cl", "docker -v");
				//return false;
			}
			try {
				checkDockerPB
					.inheritIO()
					.directory(new File(System.getProperty("user.home")))
					.start();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
		
		private boolean installDocker(boolean macOrWinInstall) {
			dockerDownloadProgressBar.setVisible(true);
			dockerDownloadProgressBar.getParent().layout();
        	Thread downloadThread = new Thread() {
        		public void run() {
        			if(macOrWinInstall) {
        				String osTempDir = System.getProperty("java.io.tmpdir");
            			try {
            				URL url;
            				File dockerInstaller;
            				if(hostOS.startsWith("windows")) {
            					System.out.println("Install Windows");
            					url = new URL("https://download.docker.com/win/stable/19098/Docker%20for%20Windows%20Installer.exe");
            					dockerInstaller = new File(osTempDir + "/dockerInstaller.exe");
            				} else {
            					System.out.println("Install Mac");
            					url = new URL("https://download.docker.com/mac/stable/26399/Docker.dmg");
            					dockerInstaller = new File(osTempDir + "/dockerInstall.dmg");
            				}
    			        	ReadableByteChannel rbc = Channels.newChannel(url.openStream());
    				        FileOutputStream fos = new FileOutputStream(dockerInstaller);
    						fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    						fos.close();
    				        rbc.close();
    				        System.out.println(dockerInstaller.getAbsolutePath());
    				        Desktop.getDesktop().open(dockerInstaller);
    				        Display.getDefault().asyncExec(new Runnable() {
    				               public void run() {
    				            	   dockerDownloadProgressBar.setVisible(false);
    				            	   installDockerButton.setVisible(false);
    				            	   dockerRTIRadioButton.setText(dockerButtonText + ": can be installed now!");
    				            	   dockerDownloadProgressBar.getParent().layout();
    				            	   installDockerButton.getParent().layout();
    				               }
    				            });
            			} catch (IOException e) {
            				// TODO Auto-generated catch block
            				e.printStackTrace();
            			}
        			} else {
        				ProcessBuilder installDockerLinuxPB = new ProcessBuilder("bash", "-cl", linuxInstallCommand);
        				try {
        					installDockerLinuxPB
        						.inheritIO()
        						.directory(new File(System.getProperty("user.home")))
        						.start();
        				} catch (IOException e) {
        					e.printStackTrace();
        				}
        			}
        		}
        	};
        	downloadThread.start();
			
			return true;
		}
		
		/*
		 * Override refresh, because the standard example wizard sets Page to complete on true, as soon as you select a project.
		 * @see org.eclipse.emf.common.ui.wizard.AbstractExampleInstallerWizard.ProjectPage#refresh()
		 */
		@Override
		public void refresh() {
			super.refresh();
			// check if docker engine is selected and if docker cli or portico container are not installed
			if(dockerRTIRadioButton != null) {
				if(dockerRTIRadioButton.getSelection() && (!dockerCLIInstalled() || !porticoDockerContainerInstalled())) {
					setPageComplete(false);
				}
			}
		}
		
		public void asyncRefresh() {
			setPageComplete(false);
			Display.getDefault().asyncExec(new Runnable() {
	            public void run() {
        			refresh();
        		}
			});
		}
		
		public boolean porticoDockerContainerInstalled() {
			String outputString = "";
			ProcessBuilder checkPorticoPB;
			if(hostOS.startsWith("windows")) {
				checkPorticoPB = new ProcessBuilder("CMD", "/C", "docker images");
			} else 
			{
				checkPorticoPB = new ProcessBuilder("bash", "-cl", "docker images");
			}
			try {
				checkPorticoPB
					.inheritIO()
					.directory(new File(System.getProperty("user.home")));
				try(java.util.Scanner scanner = new java.util.Scanner(checkPorticoPB.start().getInputStream())) 
				   { 
				       outputString = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
				   }
				System.out.println(outputString);
				// TODO check output for portico container
			} catch (IOException e) {
				e.printStackTrace();
			}
			return false;
		}
	}
	
	@Override
	public void addPages() {
		projectPage = new DockerProjectPage("projectPage", CommonUIPlugin.INSTANCE.getString("_UI_ProjectPage_title"), null);
	    projectPage.setDescription(CommonUIPlugin.INSTANCE.getString("_UI_ProjectPage_description"));
	    addPage(projectPage);
	}
}
