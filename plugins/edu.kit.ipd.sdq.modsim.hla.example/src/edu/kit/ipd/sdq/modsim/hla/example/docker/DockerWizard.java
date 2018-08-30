package edu.kit.ipd.sdq.modsim.hla.example.docker;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
		protected Group dockerGroup;
		protected Composite composite;
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
			
			composite = (Composite)getControl();
			
			dockerGroup = new Group(composite, SWT.NONE);
			GridLayout layout = new GridLayout(2, false);
			layout.marginBottom = 5;
			dockerGroup.setLayout(layout);
			dockerGroup.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL, true, true));
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
					if(dockerCLIInstalled()) {
						// check and install portico container
						if(!porticoDockerContainerInstalled()) {
							installPorticoImage();
						}
					} else {
						// docker missing -> install
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
								installDockerButton.setText("Install Portico docker image");
								installDockerButton.setVisible(true);
								installDockerButton.getParent().layout();
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
							if(porticoDockerContainerInstalled()) {
								dockerRTIRadioButton.setText(dockerButtonText + ": \ninstalled!");
								dockerRTIRadioButton.getParent().layout();
							} else {
								installDockerButton.setText("Install Portico docker image");
								installDockerButton.setVisible(true);
								dockerRTIRadioButton.setText(dockerButtonText + ": \ninstalled, but Portico container missing!");
								dockerRTIRadioButton.getParent().layout();
							}
						} else {
							dockerRTIRadioButton.setText(dockerButtonText + ": \nnot installed!");
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
    				            	   installDockerButton.setText("Install Portico docker image");
    				            	   dockerRTIRadioButton.setText(dockerButtonText + ": \ncan be installed now!");
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
		
		private boolean installPorticoImage() {
			ProcessBuilder installPorticoImage;
			Process installPorticoImageP;
			String outputString = "";
			if(hostOS.startsWith("windows")) {
				installPorticoImage = new ProcessBuilder("CMD", "/C", "docker run fboehle/portico:2.0.2");
			} else {
				installPorticoImage = new ProcessBuilder("bash", "-cl", "docker run fboehle/portico:2.0.2");
			}
			try {
				installPorticoImageP = installPorticoImage.start();
				BufferedReader br=new BufferedReader(new InputStreamReader(installPorticoImageP.getErrorStream()));
				String line;
				StringBuilder sb = new StringBuilder();
				while((line=br.readLine())!=null) sb.append(line + "\n");
				outputString = sb.toString();
				if(outputString.contains("command not found")) {
					MessageBox dockerMissingMessageBox = new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
					dockerMissingMessageBox.setText("Docker CLI not found");
					dockerMissingMessageBox.setMessage("The Docker CLI (Command Line Interface) couldn't be found.\n"
            	   		+ "\nPlease verify that Docker is correctly installed and that you can run the docker command in CMD or bash and try again.");
					dockerMissingMessageBox.open();
					return false;
				} else {
					Display.getDefault().asyncExec(new Runnable() {
			               public void run() {
			            	   dockerRTIRadioButton.setText(dockerButtonText + ":\nDocker and Portico image installed!");
			            	   dockerGroup.layout();
			               }
					});
					return true;
				}
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			return false;
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
			Process checkPorticoP;
			if(hostOS.startsWith("windows")) {
				checkPorticoPB = new ProcessBuilder("CMD", "/C", "docker images");
			} else {
				checkPorticoPB = new ProcessBuilder("bash", "-cl", "docker images");
			}
			try {
				checkPorticoPB
					.directory(new File(System.getProperty("user.home")));
				checkPorticoP = checkPorticoPB.start();
				BufferedReader br=new BufferedReader(new InputStreamReader(checkPorticoP.getInputStream()));
				String line;
				StringBuilder sb = new StringBuilder();
				while((line=br.readLine())!=null) sb.append(line + "\n");
				outputString = sb.toString();
				if(outputString.toLowerCase().matches("(?s).*\\bfboehle\\/portico( *)2\\.0\\.2.*")) {
					return true;
				}
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
