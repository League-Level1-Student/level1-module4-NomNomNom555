package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JButton one = new JButton("joke");
	JButton two = new JButton("punchline");
	public void makeButtons(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(one);
		panel.add(two);
		one.addActionListener(this);
		two.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
public static void main(String[] args) {
	
	ChuckleClicker hehe = new ChuckleClicker();	
	hehe.makeButtons();
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()== one) {
		JOptionPane.showMessageDialog(null,"Hi");
	}
	else if(e.getSource()==two) {
		JOptionPane.showMessageDialog(null, "Hi");
	}
}
}
