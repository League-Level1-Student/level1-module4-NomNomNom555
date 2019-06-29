package Runners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslatorRunner implements ActionListener{
JFrame frame = new JFrame("Pig Latin Translator");
JPanel panel= new JPanel();
JTextField textbox1= new JTextField(35);
JButton button = new JButton("Translate");
JTextField textbox2= new JTextField(35);

void createUI(){
	frame.add(panel);
	panel.add(textbox1);
	panel.add(button);
	panel.add(textbox2);
	button.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
}
public static void main(String[] args) {
	new PigLatinTranslatorRunner().createUI();
}
 
   
    private static boolean isLetter(char c) {
         return ( (c >= 'A' && c <= 'Z') || (c >='a' && c <= 'z') );
    }

    
    private static String pigWord(String word) {
         int split = firstVowel(word);
         return word.substring(split)+"-"+word.substring(0, split)+"ay";
    }

    
    public String translate(String s) {
         String latin = "";
         int i = 0;
         while (i < s.length()) {

    // Take care of punctuation and spaces
         while (i < s.length() && !isLetter(s.charAt(i))) {
              latin = latin + s.charAt(i);
              i++;
         }

    // If there aren't any words left, stop.
         if (i>=s.length()) break;

    // Otherwise we're at the beginning of a word.
         int begin = i;
         while (i < s.length() && isLetter(s.charAt(i))) {
              i++;
         }
    // Now we're at the end of a word, so translate it.
         int end = i;
         latin = latin + pigWord(s.substring(begin, end));
         }
         return latin;
    }

    
    	private static int firstVowel(String word) {
         word = word.toLowerCase();
         for (int i=0; i < word.length(); i++)
              if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
                   word.charAt(i)=='i' || word.charAt(i)=='o' ||
                   word.charAt(i)=='u')
                   return i;
              return 0;
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			String english= textbox1.getText();
			String newer =translate(english);
			textbox2.setText(newer);
		}
		
	}
}