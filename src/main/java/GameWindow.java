

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow {
	
	JFrame frame; 
	Container contentPane;
	
	public GameWindow(){
		frame = new JFrame("CSE 360 Rally");
		
		contentPane = frame.getContentPane();
		
		setInitialWindowSettings();
		setLayout(null);
	}
	
	private void setInitialWindowSettings(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 600, 400);
		frame.setVisible(true);
	}
	
	public void setLayout(LayoutManager layout){
		contentPane.setLayout(layout);
	}


	public void updateWindowContent(JPanel panel) {
		frame.setContentPane(panel);
		frame.validate(); 
		frame.pack();
	}
}
