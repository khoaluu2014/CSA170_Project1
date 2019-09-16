package NumericTypes;
// TASK #2 Add an import statement for the Scanner class



/**
This program demonstrates how numeric types and operators behave in Java.
*/
import java.util.Scanner;
public class NumericTypes
{
public static void main (String [] args)
{
// TASK #2 Create a Scanner object here

Scanner in = new Scanner(System.in);

// Identifier declarations
final int NUMBER = 2 ;	// Number of scores 
final int SCORE1 = 100;	// First test score 
final int SCORE2 = 95;	// Second test score 
final int BOILING_IN_F = 212; // Boiling temperature 
double fToC;	// Temperature Celsius // fix change to double
double average = 0;	// Arithmetic average
String output;	// Line of output
 

// TASK #2 declare variables used here
String fName;
String lName;
String fullName;
// TASK #3 declare variables used here
char letterFirstName;
String upperCaseFullName;
// TASK #4 declare variables used here
double d = 0;
double r;
double V;

// Find an arithmetic average. 
average = (SCORE1 + SCORE2) / NUMBER; //parenthesis fix
output = SCORE1 + " and " + SCORE2 +
" have an average of " + average;
System.out.println(output);

// Convert Fahrenheit temperature to Celsius. 
fToC = 5.0/9.0 * (BOILING_IN_F - 32); //forcing division with double 
output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius."; 
System.out.println(output);
System.out.println();	// To leave a blank line

// ADD LINES FOR TASK #2 HERE
// Prompt the user for first name
System.out.println("Please enter your first name: ");
fName = in.nextLine();
// Read the user's first name
System.out.println("Your first name is: " + fName);
// Prompt the user for last name
System.out.println("Please enter your last name: ");
lName = in.nextLine();
// Read the user's last name
System.out.println("Your last name is: " + lName);
// Concatenate the user's first and last names
fullName = fName + " " + lName;
// Print out the user's full name
System.out.println("Your full name is: " + fullName);
System.out.println();	// To leave a blank line
// ADD LINES FOR TASK #3 HERE
// Get the first character from the user's first name
// Print out the user's first initial
letterFirstName = fName.charAt(0);
System.out.println("Your first initial is: " + letterFirstName);
// Convert the user's full name to uppercase
upperCaseFullName = fullName.toUpperCase();
// Print out the user's full name in uppercase
System.out.println("Your full name in upper case is: " + upperCaseFullName);
System.out.println();	// To leave a blank line

// ADD LINES FOR TASK #4 HERE
// Prompt the user for a diameter of a sphere
System.out.println("Please enter a diameter of a sphere: ");
d = in.nextDouble();
// Read the diameter
System.out.println("The diameter is: " + d);
// Calculate the radius
r = d/2;
System.out.println("The radius is: " + r);
// Calculate the volume
V = (4.0/3.0) * Math.PI * Math.pow(r, 3);
// Print out the volume
System.out.println("The volume is: " + V);
}
}

