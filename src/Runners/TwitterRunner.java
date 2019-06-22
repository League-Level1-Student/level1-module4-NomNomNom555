package Runners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TwitterRunner implements ActionListener{
JFrame frame = new JFrame("Twitter");
JPanel panel = new JPanel();
JTextField textfield = new JTextField(35);
JButton search = new JButton("Search the Twitterverse");

public static void main(String[] args) {
	new TwitterRunner().createUI();
	
}
void createUI() {
	frame.add(panel);
	panel.add(textfield);
	panel.add(search);
	search.addActionListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.pack();
}

public void actionPerformed(ActionEvent e) {
	if(e.getSource()==search) {
		System.out.println("Tweet Tweet");
	}
	
}
}
