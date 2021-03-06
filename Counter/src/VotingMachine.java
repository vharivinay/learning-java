 import javax.swing.*; // Required library
import java.awt.*; // Required library
import java.awt.event.*; // Required library
public class VotingMachine extends JFrame {
  // Declare components as instance variables
  private JTextField passwordField = new JTextField(""); // Create the text field
  private JButton candidate1 = new JButton("Chocolate"); // Create the first candidate's button
  private JButton candidate2 = new JButton("IceCream"); // Create the second candidate's button
  private JButton candidate3 = new JButton("RoundChocolate"); // Create the third candidate's button
  private JButton loginbutton = new JButton("Click for administrator login"); // Create the login button
// Constructor
  public VotingMachine() {
// Set up the frame
	setLayout(new GridLayout(6, 1, 10, 10)); // Define layout as a grid
	add(candidate1); // Make button 1 appear in window
	add(candidate2); // Make button 2 appear in window
	add(candidate3); // Make button 3 appear in window
	add(passwordField); // Add the password text field to the frame
	add(loginbutton); // Make login button appear in window
	
// Event handler
	loginbutton.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
		
		String password = passwordField.getText(); // Get the input password in the Password Field
		String success = ("Count of Votes for Each Candidate");
		String fail = ("ERROR: Incorrect password.");
		if (password.equals("votes")) // Hard code the password to be "votes"
		  passwordField.setText(success); // Set the result for a valid password
		else
		  passwordField.setText(fail); // Set the text for an invalid password
	  }});}

  	
  
// Main method
  public static void main(String[] args) {
	VotingMachine myFrame = new VotingMachine(); // Declare and create an instance of VotingMachine
	myFrame.setVisible(true); // Make the window visible on the screen
	myFrame.setTitle("Voting Machine");
	myFrame.setSize(400, 400);}}
