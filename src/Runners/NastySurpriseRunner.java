package Runners;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurpriseRunner implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Trick");
	JButton button2 = new JButton("Treat");
	
public static void main(String[] args) {
	 new NastySurpriseRunner().createUI();
}

void createUI(){
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button1.addActionListener(this);
	button2.addActionListener(this);
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
	if(e.getSource()==button1) {
		showPictureFromTheInternet("https://cdn.kapwing.com/final_5c702376cb41e60013113413_837938.jpg");
	}
	if(e.getSource()==button2) {
		showPictureFromTheInternet("https://thumbs.gfycat.com/SelfassuredWholeJavalina-size_restricted.gif");
	}
	}
private Image getScaledImage(Image srcImg, int w, int h){
    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2 = resizedImg.createGraphics();

    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    g2.drawImage(srcImg, 0, 0, w, h, null);
    g2.dispose();

    return resizedImg;
    getScaledImage((Image)icon, 1400,1000);
}
}


