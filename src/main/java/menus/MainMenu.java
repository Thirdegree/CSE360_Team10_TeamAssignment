package menus;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainMenu {
	
	JPanel formPanel;
	
	public MainMenu(){
		formPanel = new JPanel(new GridBagLayout());
	}
	
	public JPanel getFormPanel() {
		setupMainMenuText();
		setupStartRaceButton();
		setupJoinRaceButton();
		setupUpdateProfileButton();
		setupUpgradeVehicleButton();
		
		return formPanel;
	}
	
	private void setupMainMenuText(){
		GridBagConstraints gbConstr1 = new GridBagConstraints();
		gbConstr1.gridx = 0;
		gbConstr1.gridy = 0;
		gbConstr1.gridwidth = 1;
		gbConstr1.gridheight = 1;
		
		JTextArea  welcomeText = new JTextArea();
		welcomeText.setEditable(false);
		welcomeText.setText("Main Menu!!!\n\nPlease select one of the options below.");
		welcomeText.setFont(new Font("Serif", Font.BOLD, 20));
		formPanel.add(welcomeText, gbConstr1);
	}
	
	private void setupStartRaceButton(){
		GridBagConstraints gbConstr2 = new GridBagConstraints();
		gbConstr2.gridx = 0;
		gbConstr2.gridy = 1;
		gbConstr2.gridwidth = 1;
		gbConstr2.gridheight = 1;
		
		JButton startRace = new JButton("Start Race"); 
		formPanel.add(startRace, gbConstr2);
	}
	
	private void setupJoinRaceButton(){
		GridBagConstraints gbConstr3 = new GridBagConstraints();
		gbConstr3.gridx = 0;
		gbConstr3.gridy = 2;
		gbConstr3.gridwidth = 1;
		gbConstr3.gridheight = 1;
		
		JButton joinRace = new JButton("Join Race"); 
		formPanel.add(joinRace, gbConstr3);
	}
	
	private void setupUpdateProfileButton(){
		GridBagConstraints gbConstr4 = new GridBagConstraints();
		gbConstr4.gridx = 0;
		gbConstr4.gridy = 3;
		gbConstr4.gridwidth = 1;
		gbConstr4.gridheight = 1;
		
		JButton updateProfile = new JButton("Update Profile"); 
		formPanel.add(updateProfile, gbConstr4);
	}
	
	private void setupUpgradeVehicleButton(){
		GridBagConstraints gbConstr5 = new GridBagConstraints();
		gbConstr5.gridx = 0;
		gbConstr5.gridy = 4;
		gbConstr5.gridwidth = 1;
		gbConstr5.gridheight = 1;
		
		JButton upgradeVehicle = new JButton("Upgrade Vehicle"); 
		formPanel.add(upgradeVehicle, gbConstr5);
	}
	
	
}
