package Runners;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTycoon implements KeyListener{
JFrame frame= new JFrame("Typing Tycoon!");
JLabel label= new JLabel();

char currentLetter;
TypingTycoon(){
currentLetter = generateRandomLetter();
label.setText(""+ currentLetter);
label.setFont(label.getFont().deriveFont(28.0f));
label.setHorizontalAlignment(JLabel.CENTER);
frame.addKeyListener(this);
frame.add(label);
frame.setVisible(true);
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
frame.pack();
}
char generateRandomLetter() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');
      
}
public static void main(String[] args) {
TypingTycoon tutor=new TypingTycoon();

}
@Override
public void keyTyped(KeyEvent e) {
	
	
}
@Override
public void keyPressed(KeyEvent e) {
	System.out.println("You typed the letter " +e.getKeyChar());
	if(e.getKeyChar()==currentLetter) {
		System.out.println("You typed the correct letter!");
		frame.setBackground(Color.GREEN);
		frame.pack();
	}
	else {
		frame.setBackground(Color.RED);
		frame.pack();
	}
}
@Override
public void keyReleased(KeyEvent e) {
	currentLetter=generateRandomLetter();
	label.setText(""+currentLetter);
	
}
}
