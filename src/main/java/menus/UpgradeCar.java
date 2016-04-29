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

import car.Car;

public class UpgradeCar  {
	
	Car usersCar;
	
	boolean newUser;
	boolean userSubmittedForm;
	
	JPanel formPanel;
	
	public UpgradeCar(Car car){
		usersCar = car;
		
		formPanel = new JPanel(new GridBagLayout());
	}
	
	public JPanel getFormPanel() {
		setupFormWelcomeText();
		setupUserNameFields();
		setupPasswordFields();
		setupLoginButton();
		setupCreateProfileButton();
		
		return formPanel;
	}
	
	private void setupUpgradeCarWelcomeText(){
		GridBagConstraints gbConstr1 = new GridBagConstraints();
		gbConstr1.gridx = 0;
		gbConstr1.gridy = 0;
		gbConstr1.gridwidth = 1;
		gbConstr1.gridheight = 1;
		
		JTextArea  welcomeText = new JTextArea();
		welcomeText.setEditable(false);
		welcomeText.setText("Welcome to the Rally Shop\n\nPlease log in or create a new profile to start a game.");
		welcomeText.setFont(new Font("Serif", Font.BOLD, 20));
		formPanel.add(welcomeText, gbConstr1);
	}
	
	private void setupUserNameFields(){
		GridBagConstraints gbConstr2 = new GridBagConstraints();
		gbConstr2.gridx = 0;
		gbConstr2.gridy = 1;
		gbConstr2.gridwidth = 1;
		gbConstr2.gridheight = 1;
		
		JPanel userNameFields = new JPanel(new FlowLayout());
		JLabel userNamePrompt = new JLabel("username");
		userNameFields.add(userNamePrompt);
		JTextField userName = new JTextField(10);
		userNameFields.add(userName);
		formPanel.add(userNameFields, gbConstr2);
	}
	
	private void setupPasswordFields(){
		GridBagConstraints gbConstr3 = new GridBagConstraints();
		gbConstr3.gridx = 0;
		gbConstr3.gridy = 2;
		gbConstr3.gridwidth = 1;
		gbConstr3.gridheight = 1;
		
		JPanel passwordFields = new JPanel(new FlowLayout());
		JLabel passwordPrompt = new JLabel("password");
		passwordFields.add(passwordPrompt);
		JTextField password = new JTextField(10);
		passwordFields.add(password);
		formPanel.add(passwordFields, gbConstr3);
	}
	private void setupLoginButton(){
		GridBagConstraints gbConstr4 = new GridBagConstraints();
		gbConstr4.gridx = 0;
		gbConstr4.gridy = 3;
		gbConstr4.gridwidth = 1;
		gbConstr4.gridheight = 1;
		
		JButton login = new JButton("Login"); 
		formPanel.add(login, gbConstr4);
	}
	
	private void setupCreateProfileButton(){
		GridBagConstraints gbConstr5 = new GridBagConstraints();
		gbConstr5.gridx = 0;
		gbConstr5.gridy = 4;
		gbConstr5.gridwidth = 1;
		gbConstr5.gridheight = 1;
		
		JButton createProfile = new JButton("Create Profile"); 
		formPanel.add(createProfile, gbConstr5);
	}
}
