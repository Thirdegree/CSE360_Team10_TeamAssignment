package menus;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import car.Car;
import car.Tires;
import player.Player;

public class UpgradeCar  {
	
	Car newCar;
	Player player;
	JPanel formPanel;
	
	public UpgradeCar(Player player){
		this.player = player;
		newCar = new Car(player.getCurrentCar());
		formPanel = new JPanel(new GridBagLayout());
	}
	
	public JPanel getFormPanel() {
		setupUpgradeCarWelcomeText();
		setupCarMakeFieldsFields();
		setupCarModelFields();
		setupEngineUpgrateFields();
		setupExhaustUpgrateFields();
		setupSuspensionUpgrateFields();
		setupSubmissionButtons();
		setupChangeTiresFields();
		setupTurboUpgrateFields();
		
		formPanel.validate();
		return formPanel;
	}
	
	private void setupUpgradeCarWelcomeText(){
		GridBagConstraints gbConstr = createGridBagConstriants(0,1,1,1);
		
		JTextArea  welcomeText = new JTextArea();
		welcomeText.setEditable(false);
		welcomeText.setText("Welcome to the Rally Shop!\n\nPlease change your car to your liking.\nTo commit changes click done.\nTo cancel changes click exit");
		welcomeText.setFont(new Font("Serif", Font.BOLD, 20));
		formPanel.add(welcomeText, gbConstr);
	}
	
	private void setupCarMakeFieldsFields(){
		GridBagConstraints gbConstr = createGridBagConstriants(0,2,1,1);
		
		JPanel carMakeFields = new JPanel(new FlowLayout());
		JLabel carMakePrompt = new JLabel("Car Make");
		carMakeFields.add(carMakePrompt);
		JTextField carMake = new JTextField(10);
		carMake.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e) {
		        JTextField textField = (JTextField) e.getSource();
		        String text = textField.getText();
		        newCar.setMake(text.toUpperCase());
		    }
			public void keyTyped(KeyEvent e) {}

		    public void keyPressed(KeyEvent e) {}
		});
		
		      
		carMakeFields.add(carMake);
		formPanel.add(carMakeFields, gbConstr);
	}
	
	private void setupCarModelFields(){
		GridBagConstraints gbConstr = createGridBagConstriants(0,3,1,1);
		
		JPanel carModelFields = new JPanel(new FlowLayout());
		JLabel carModelPrompt = new JLabel("Car Model");
		carModelFields.add(carModelPrompt);
		JTextField carModel = new JTextField(10);
		carModelFields.add(carModel);
		formPanel.add(carModelFields, gbConstr);
	}
	private void setupEngineUpgrateFields(){
		GridBagConstraints gbConstr = createGridBagConstriants(0,4,1,1);
		
		
		JPanel carEngineFields = new JPanel(new FlowLayout());
		JLabel carEnginePrompt = new JLabel("Car Engine Status: " + newCar.getEngineQuality());
		carEngineFields.add(carEnginePrompt);
		JButton upgradeEngine = new JButton("Upgrade Engine?");
		upgradeEngine.setEnabled(true);
		if (!newCar.canUpgradeEngine()){
			upgradeEngine.setEnabled(false);
		}
		upgradeEngine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCar.upgradeEngine();
				carEnginePrompt.setText("Car Engine Status: " + newCar.getEngineQuality());
			}
		});
		carEngineFields.add(upgradeEngine);
		formPanel.add(carEngineFields, gbConstr);
	}
	
	private void setupExhaustUpgrateFields(){
		GridBagConstraints gbConstr = createGridBagConstriants(0,5,1,1);
		
		JPanel carExhaustFields = new JPanel(new FlowLayout());
		JLabel carExhaustPrompt = new JLabel("Car Exhaust Status: " + newCar.getExhaustQuality());
		carExhaustFields.add(carExhaustPrompt);
		JButton upgradeExhaust = new JButton("Upgrade Exhaust?");
		upgradeExhaust.setEnabled(true);
		if (!newCar.canUpgradeExhaust ()){
			upgradeExhaust.setEnabled(false);
		}
		upgradeExhaust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCar.upgradeExhaust();
				carExhaustPrompt.setText("Car Exhaust Status: " + newCar.getExhaustQuality());
			}
		});
		carExhaustFields.add(upgradeExhaust);
		formPanel.add(carExhaustFields, gbConstr);
	}
	
	
	private void setupSuspensionUpgrateFields(){
		GridBagConstraints gbConstr = createGridBagConstriants(0,6,1,1);
		JPanel carSuspensionFields = new JPanel(new FlowLayout());
		JLabel carSuspensionPrompt = new JLabel("Car Suspension Status: " + newCar.getSuspensionQuality());
		JButton upgradeSuspension = new JButton("Upgrade Suspension?");
		
		upgradeSuspension.setEnabled(true);
		if (!newCar.canUpgradeSuspension()){
			upgradeSuspension.setEnabled(false);
		}
		
		upgradeSuspension.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCar.upgradeSuspension();
				carSuspensionPrompt.setText("Car Suspension Status: " + newCar.getSuspensionQuality());
			}
		});
		
		carSuspensionFields.add(carSuspensionPrompt);
		carSuspensionFields.add(upgradeSuspension);
		
		formPanel.add(carSuspensionFields, gbConstr);
	}
	
	private void setupChangeTiresFields(){
		GridBagConstraints gbConstr = createGridBagConstriants(0,8,1,1);
		GridBagConstraints gbConstrTiresPrompt = createGridBagConstriants(0,1,1,1);
		GridBagConstraints gbConstrTiresButtons = createGridBagConstriants(0,2,1,1);
		JPanel carTiresFields = new JPanel(new GridBagLayout());
		JLabel carTiresPrompt = new JLabel("Please select desired tires: ");
		
		JPanel tireButtonFields = new JPanel(new FlowLayout());
		JButton DurableTires = new JButton("Durable Tires");
		JButton AllPurposeTires = new JButton("All Purpose Tires");
		JButton RacingTires = new JButton("Racing Tires");
		
		
		if (newCar.getTireDurability() == 5 && newCar.getTireSpeed() == 1){
			DurableTires.setEnabled(false);
		} else if(newCar.getTireDurability() == 3 && newCar.getTireSpeed() == 3){
			AllPurposeTires.setEnabled(false);
		} else {
			RacingTires.setEnabled(false);
		}
		
		DurableTires.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tires newTires = new Tires(5,1);
				newCar.changeTires(newTires);
				DurableTires.setEnabled(false);
				AllPurposeTires.setEnabled(true);
				RacingTires.setEnabled(true);
			}
		});
		
		AllPurposeTires.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tires newTires = new Tires(3,3);
				newCar.changeTires(newTires);
				DurableTires.setEnabled(true);
				AllPurposeTires.setEnabled(false);
				RacingTires.setEnabled(true);
			}
		});
		
		RacingTires.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tires newTires = new Tires(1,5);
				newCar.changeTires(newTires);
				DurableTires.setEnabled(true);
				AllPurposeTires.setEnabled(true);
				RacingTires.setEnabled(false);
			}
		});
		
		tireButtonFields.add(DurableTires);
		tireButtonFields.add(AllPurposeTires);
		tireButtonFields.add(RacingTires);
		
		
		carTiresFields.add(carTiresPrompt, gbConstrTiresPrompt);
		carTiresFields.add(tireButtonFields, gbConstrTiresButtons);
		
		formPanel.add(carTiresFields, gbConstr);
	}
	
	private void setupTurboUpgrateFields(){
		GridBagConstraints gbConstr = createGridBagConstriants(0,7,1,1);
		JPanel carTurboFields = new JPanel(new FlowLayout());
		JLabel carTurboPrompt = new JLabel("Car Turbo Status: " + newCar.getTurboQuality());
		JButton upgradeTurbo = new JButton("Upgrade Turbo?");
		
		upgradeTurbo.setEnabled(true);
		if (!newCar.canUpgradeTurbo()){
			upgradeTurbo.setEnabled(false);
		}
		
		upgradeTurbo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCar.upgradeTurbo();
				carTurboPrompt.setText("Car Turbo Status: " + newCar.getTurboQuality());
			}
		});
		
		carTurboFields.add(carTurboPrompt);
		carTurboFields.add(upgradeTurbo);
		
		formPanel.add(carTurboFields, gbConstr);
	}
	
	
	private void setupSubmissionButtons(){
		GridBagConstraints gbConstr = createGridBagConstriants(0,9,1,1);
		
		JPanel submissionButtons = new JPanel(new FlowLayout());
		JButton done = new JButton("Done"); 
		JButton exit = new JButton("Exit"); 
		
		submissionButtons.add(done); 
		submissionButtons.add(exit); 
		
		formPanel.add(submissionButtons, gbConstr);
	}
	
	
	private GridBagConstraints createGridBagConstriants(int gridx, int gridy, int gridwidth, int gridheight){
		GridBagConstraints gbConstr = new GridBagConstraints();
		
		gbConstr.gridx = gridx;
		gbConstr.gridy = gridy;
		gbConstr.gridwidth = gridwidth;
		gbConstr.gridheight = gridheight;
		
		return gbConstr;
		
	}
	
	
	
	
}
