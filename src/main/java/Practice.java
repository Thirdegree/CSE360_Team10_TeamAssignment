import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class Practice {

	private JFrame frame;
	private JTextField txtFaceValueOf;
	private JTextField txtUpgrade;
	
	private Die die1 = new Die();
	private int roll1 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practice window = new Practice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Practice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(10, 225, 179, 25);
		frame.getContentPane().add(splitPane);
		
		JButton btnMove = new JButton("Move");
		splitPane.setLeftComponent(btnMove);
		
		JButton btnUpgrade = new JButton("Upgrade");
		splitPane.setRightComponent(btnUpgrade);
		
		JButton btnRollDie = new JButton("Roll Die");
		btnRollDie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//die1 = new Die();
				//roll1 = die1.roll();
				roll1 = die1.roll();
				txtFaceValueOf.setText("Face Value of Die: " + roll1);
			}
		});
		btnRollDie.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnRollDie);
		
		JTextArea txtrDisplayCurrentPositions = new JTextArea();
		txtrDisplayCurrentPositions.setText("Display Current Positions Here");
		txtrDisplayCurrentPositions.setBounds(180, 10, 244, 125);
		frame.getContentPane().add(txtrDisplayCurrentPositions);
		
		txtFaceValueOf = new JTextField();
		txtFaceValueOf.setText("Face Value of Die: ");
		txtFaceValueOf.setAlignmentY(-45);
		txtFaceValueOf.setBounds(10, 45, 137, 90);
		frame.getContentPane().add(txtFaceValueOf);
		txtFaceValueOf.setColumns(10);
		
		txtUpgrade = new JTextField();
		txtUpgrade.setText("Upgrade?");
		txtUpgrade.setBounds(263, 146, 86, 20);
		frame.getContentPane().add(txtUpgrade);
		txtUpgrade.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(263, 177, 86, 73);
		frame.getContentPane().add(comboBox);
	}
}
