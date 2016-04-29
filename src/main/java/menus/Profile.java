package menus;

import player.Player;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Profile {
	
	JPanel formPanel;
	String formDescriptionText;
	String username;
	
	
	public Profile(){
		formPanel = new JPanel(new GridBagLayout());
		formDescriptionText = "Welcome to the create a profile page!!!\n\nPlease enter in your desired username and password.";
		username = ""; 
	}
	
	public Profile(Player player){
		formPanel = new JPanel(new GridBagLayout());
		formDescriptionText = "Update profile\n\nPlease enter in your new username and password.";
		username = player.getUsername();
	}
	
	public JPanel getFormPanel() {
		
		setupUpdateProfileText();
		setupUserNameFields();
		setupPasswordFields();
		setupDoneButton();
		
		return formPanel;
	}
	
	private void setupUpdateProfileText(){
		GridBagConstraints gbConstr1 = new GridBagConstraints();
		gbConstr1.gridx = 0;
		gbConstr1.gridy = 0;
		gbConstr1.gridwidth = 1;
		gbConstr1.gridheight = 1;
		
		JTextArea  welcomeText = new JTextArea();
		welcomeText.setEditable(false);
		welcomeText.setText(formDescriptionText);
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
		userName.setText(username);
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
	private void setupDoneButton(){
		GridBagConstraints gbConstr4 = new GridBagConstraints();
		gbConstr4.gridx = 0;
		gbConstr4.gridy = 3;
		gbConstr4.gridwidth = 1;
		gbConstr4.gridheight = 1;
		
		JButton done = new JButton("Done"); 
		formPanel.add(done, gbConstr4);
	}
}
