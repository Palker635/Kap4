/*
Uppgift 4.1
Skapat 2019-10-03
Dev: Isac Hansson
*/
import javax.swing.*;

public class ifsats	{
	public static void main (String[] args) {
		double kostnad;
		kostnad = Double.parseDouble (JOptionPane.showInputDialog(null, "Hur mycket kostar ditt abonnemang?")); 
		
		if (kostnad >= 1000) {
			
		kostnad = (kostnad*0.9);
		JOptionPane.showMessageDialog(null, "Du får en rabatt på 10% och ditt abonnemang kostar nu " + kostnad + "kr");
		
		} else {
			
			kostnad = (kostnad*1); 
			JOptionPane.showMessageDialog(null, "Du får ingen rabatt");
		}
	}
}