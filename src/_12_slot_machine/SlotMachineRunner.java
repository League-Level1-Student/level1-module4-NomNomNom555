package _12_slot_machine;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class SlotMachineRunner implements ActionListener {
	JFrame frame = new JFrame("Slot Machine");
	JPanel panel= new JPanel();
	JButton lever= new JButton("Spin");
	
	public void createUI(){
	
	frame.add(panel);
	panel.add(lever);
	lever.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
	
	
	}
	
	
	public static void main(String[] args) {
		new SlotMachineRunner().createUI();
		
		
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}


	@Override
	public void actionPerformed(ActionEvent e) {
		panel.removeAll();
		Random randy = new  Random();
		int choose = randy.nextInt(3);
		int getIt = randy.nextInt(3);
		int grabIt= randy.nextInt(3);
		try {
			
			if(grabIt==0) {
				panel.add(createLabelImage("Dapper Cat.jpg"));
			}
			
			if(getIt ==0) {
				panel.add(createLabelImage("Dapper Cat.jpg"));
			}
			
		if(choose == 0 ) {
			panel.add(createLabelImage("Dapper Cat.jpg"));	
		}
		
		if(choose== getIt && choose== grabIt) {
			
		}
		
		if(choose==1) {
		panel.add(createLabelImage("Ice Nap.jpg"));
		
		}
		
		if(getIt==1) {
			panel.add(createLabelImage("Ice Nap.jpg"));
		}
		
		if(grabIt==1) {
			panel.add(createLabelImage("Ice Nap.jpg"));
		}
		
		 if(choose==2) {
			 panel.add(createLabelImage("Pineapple Terror.jpg"));
		 }
		
		if(getIt==2) {
			panel.add(createLabelImage("Pineapple Terror.jpg"));
		}
		
		if(grabIt==2) {
			panel.add(createLabelImage("Pineapple Terror.jpg"));
		}
		
		
		
		if(choose== 0 && getIt== 0 && grabIt==0) {
			panel.removeAll();
			panel.add(createLabelImage("Ascended Cat.jpg"));
		}
		
		if(choose== 1 && getIt==1 && grabIt==1) {
			panel.removeAll();
			panel.add(createLabelImage("Advanced Ice.jpg"));
		}
		
		if(choose== 2 && getIt==2 && grabIt==2) {
			panel.removeAll();
			panel.add(createLabelImage("Polished.jpg"));
		}
		
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		frame.pack();
	}
}
