package Runners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
JFrame frame;
JPanel panel;
JTextField textfield1;
JTextField textfield2;
JButton button1;
JButton button2;
JButton button3;
JButton button4;
JLabel label;


Calculator(){
frame= new JFrame("Calculator");
panel= new JPanel();
label= new JLabel();
textfield1= new JTextField(4);
textfield2= new JTextField(4);
button1= new JButton("add");
button2= new JButton("subtract");
button3= new JButton("multiply");
button4= new JButton("divide");
frame.add(panel);
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
panel.add(textfield1);
panel.add(textfield2);
panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(button4);
panel.add(label);
frame.setVisible(true);
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
frame.pack();

}


@Override
public void actionPerformed(ActionEvent e) {
	int x=Integer.parseInt(textfield1.getText());
	int y=Integer.parseInt(textfield2.getText());
	
	if( e.getSource().equals(button1)){
		label.setText(""+add(x,y));
	}
	if(e.getSource().equals(button2)) {
		label.setText(""+sub(x,y));
	}
	if(e.getSource().equals(button3)) {
		label.setText(""+ mult(x,y));
	}
	if(e.getSource().equals(button4)) {
	label.setText(""+div(x,y));
	}
	
	
	
}
int add(int x,int y) {	
	return x+y;
}
int sub(int x,int y) {
	return x-y;
}
int mult(int x, int y) {
	return x*y;
			
}
int div(int x, int y) {
	return x/y;
}
}
