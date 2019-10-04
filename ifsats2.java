/*
Uppgift 4.1
Skapat 2019-10-03
Dev: Isac Hansson
*/
import javax.swing.*;

public class ifsats2	{
	public static void main (String[] args) {
	double score; 
	
	score = Double.parseDouble (JOptionPane.showInputDialog(null, "Hur många poäng fick du på provet?")); 
	
		if (score > 50) {
			JOptionPane.showMessageDialog(null, score + "är ett ogiltigt antal poäng"); 
		} else if (score >= 45){
			JOptionPane.showMessageDialog(null, "Du fick A i betyg");
			} else if (score >= 40){
			JOptionPane.showMessageDialog(null, "Du fick B i betyg");
			} else if (score >= 35){
			JOptionPane.showMessageDialog(null, "Du fick C i betyg");
			} else if (score >= 30){
			JOptionPane.showMessageDialog(null, "Du fick D i betyg");
			} else if (score <= 25){
			JOptionPane.showMessageDialog(null, "Du fick E i betyg");
			} else if (score < 25){
			JOptionPane.showMessageDialog(null, "Du fick F i betyg");
		}
	}
}