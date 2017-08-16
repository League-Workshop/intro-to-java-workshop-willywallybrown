package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String anser = JOptionPane.showInputDialog("hi! can you code? yes or no question.");
		// 2. If they say "yes", tell them they will rule the world.
if(anser.equalsIgnoreCase("Yes")){
	JOptionPane.showMessageDialog(null, "You will do great things!");
}
		// 3. Otherwise, wish them good luck washing dishes.
else {
	JOptionPane.showMessageDialog(null," Have fun being a maid. " );
}
	}
}

