package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Runners.NastySurpriseRunner;

public class ChuckleClicker implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton one = new JButton("Joke");
	JButton two = new JButton("Punchline");
	
public static void main(String[] args) {
	 new ChuckleClicker().createUI();
}
void createUI(){
	frame.add(panel);
	panel.add(one);
	panel.add(two);
	one.addActionListener(this);
	two.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()== one) {
		JOptionPane.showMessageDialog(null,"Hi");
		JOptionPane.showMessageDialog(null, "When you thought you passed your test but you failed so hard your grades's a G");
	}
	else if(e.getSource()==two) {
		JOptionPane.showMessageDialog(null, "Hi");
		showPictureFromTheInternet("https://i.kym-cdn.com/entries/icons/mobile/000/024/062/jerry.jpg");
	}
}
}
