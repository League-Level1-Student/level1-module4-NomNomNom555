package Runners;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IWhackMoles {
void drawbuttons(int buttons){
JFrame frame = new JFrame();
JPanel panel = new JPanel();
for(int i=0; i<= buttons; i++) {
JButton b= new JButton();
}
frame.add(panel);
for(int i=0; i<= buttons; i++) {
panel.add(b);
}

}
void createUI() {
	drawButtons();
}
}
