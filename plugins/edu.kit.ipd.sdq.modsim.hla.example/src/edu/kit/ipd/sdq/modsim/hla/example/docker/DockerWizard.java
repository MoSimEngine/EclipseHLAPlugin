package edu.kit.ipd.sdq.modsim.hla.example.docker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import org.eclipse.emf.common.ui.CommonUIPlugin;
import org.eclipse.emf.common.ui.wizard.ExampleInstallerWizard;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public class DockerWizard extends ExampleInstallerWizard {
	
	
	
	public class DockerProjectPage extends ProjectPage {
		
		protected Button localRTIRadioButton;
		protected Button dockerRTIRadioButton;
		protected Button installDockerButton;
		private String hostOS;

		public DockerProjectPage(String pageName, String title, ImageDescriptor titleImage) {
			super(pageName, title, titleImage);
		}
		
		@Override
		public void createControl(Composite parent) {
			super.createControl(parent);
			
			Composite composite = (Composite)getControl();
			
			Group dockerGroup = new Group(composite, SWT.NONE);
			dockerGroup.setLayout(new RowLayout(SWT.VERTICAL));
			dockerGroup.setText("Choose Portico RTI engine");
			
			localRTIRadioButton = new Button(dockerGroup, SWT.RADIO);
			localRTIRadioButton.setText("Local plugin Portico RTI engine");
			localRTIRadioButton.setSelection(true);
			
			dockerRTIRadioButton = new Button(dockerGroup, SWT.RADIO);
			dockerRTIRadioButton.setText("Docker Portico container RTI engine");
			dockerRTIRadioButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					Button source = (Button)e.getSource();
					if(source.getSelection()) {
						if(dockerCLIInstalled()) {
							dockerRTIRadioButton.setText(dockerRTIRadioButton.getText() + ": installed!");
							//dockerRTIRadioButton.setImage(new Image(null, "../image92-check.png"));
							dockerRTIRadioButton.getParent().layout();
						} else {
							dockerRTIRadioButton.setText(dockerRTIRadioButton.getText() + ": not found, please install Docker CLI!");
							//dockerRTIRadioButton.setImage(new Image(null, "../remove.png"));
							installDockerButton.setVisible(true);
							dockerRTIRadioButton.getParent().layout();
							
						}
					}
				}
			});
			
			installDockerButton = new Button(dockerGroup, SWT.PUSH);
			installDockerButton.setText("Install Docker");
			installDockerButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					installDocker();
				}
			});
			installDockerButton.setVisible(false);
			
		}
		
		private boolean dockerCLIInstalled(){
			hostOS = System.getProperty("os.name").toLowerCase();
			ProcessBuilder checkDockerPB;
			
			if(hostOS.startsWith("windows")) {
				checkDockerPB = new ProcessBuilder("CMD", "/C", "docker");
			} else {
				checkDockerPB = new ProcessBuilder("bash", "-cl", "docker");
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
		
		private boolean installDocker() {
	        	new Thread() {
	        		public void run() {
	        			String osTempDir = System.getProperty("java.io.tmpdir");
	        			try {
	        			URL url = new URL("https://download.docker.com/mac/stable/26399/Docker.dmg");
			        	File dockerInstaller = new File(osTempDir + "/dockerInstall.dmg");
			        	ReadableByteChannel rbc = Channels.newChannel(url.openStream());
				        FileOutputStream fos = new FileOutputStream(dockerInstaller);
						fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
						fos.close();
				        rbc.close();
				        System.out.println(dockerInstaller.getAbsolutePath());
	        			} catch (IOException e) {
	        				// TODO Auto-generated catch block
	        				e.printStackTrace();
	        			}
	        		}
	        	}.start();
			
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
