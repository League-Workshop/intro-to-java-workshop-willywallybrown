package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String Unlikeable= JOptionPane.showInputDialog("hello. I am a vurtual person. I have some Questions. Who do you not like?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+ Unlikeable+"! HA HA HA HA HA!");
		// 3. Ask the user for the name of their best friend
String friend= JOptionPane.showInputDialog("who is your best friend?");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, friend +" said they like french fries.");
	} 
}



