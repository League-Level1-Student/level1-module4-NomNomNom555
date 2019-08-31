package Runners;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class IWhackMoles implements ActionListener {
	JFrame frame = new JFrame("The Whacker Smacker");
	JPanel panel = new JPanel();
	JButton mole = new JButton("MOLE");
	static int buttonPressed = 0;
	static int buttonMissed= 0;
	static Date timeAtStart= new Date();

	public static void main(String[] args) {
		Random sandy = new Random();
		new IWhackMoles().drawbuttons(sandy.nextInt(23));
		if(buttonMissed==5) {
			JOptionPane.showMessageDialog(null, "You have lost!");
			System.exit(0);
		}
	}
void drawbuttons(int location){
	frame.add(panel);
for(int i=0; i<23; i++) {
JButton b= new JButton();
b.addActionListener(this);
b.setPreferredSize(new Dimension(100,45));
panel.add(b);
if(i==location) {
	mole.setPreferredSize(new Dimension(100,45));
	mole.addActionListener(this);
	panel.add(mole);
}
}
frame.setVisible(true);
frame.setSize(700, 250);
}


void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
         + " moles per second.");
}


@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==mole) {
		Random sandy = new Random();
		new IWhackMoles().drawbuttons(sandy.nextInt(23));
		buttonPressed++;
		System.out.println(buttonPressed);
		if(buttonPressed==10) {
			endGame(timeAtStart,0);
			System.exit(0);
		}
	}
	else {
		speak("Missed!");
		buttonMissed++;
	}
}
}
