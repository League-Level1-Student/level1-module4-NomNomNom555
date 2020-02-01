package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		int randy = new Random().nextInt(4);
		System.out.println(randy);
		String answer8= JOptionPane.showInputDialog("Ask a question, any question");
		if(randy==0) {
			JOptionPane.showMessageDialog(null, "Yes! Absolutly Certain!");
		}
		if(randy==1) {
			JOptionPane.showMessageDialog(null, "Nope, Nah, dido, not a chance and certainly not! Absolutly not going to happen!");
		}
		if(randy==2) {
			Picture tom= new Picture("TomShrug.jpg");
			JOptionPane.showMessageDialog(null, "Dunno");
		}
		if(randy==3) {
			JOptionPane.showMessageDialog(null, "Just turn up the volume and press Ok");
			Video v= new Video("https://www.youtube.com/watch?v=cSDJ5Z88rFY");
		}
		
		
		
	}

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
