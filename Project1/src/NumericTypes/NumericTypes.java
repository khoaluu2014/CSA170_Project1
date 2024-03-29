
/*
 * @Khoa Luu 09/17/2019
 * This program is to:
 * 1. Convert boiling point from Farenheit to Celcius
 * 2. Get user's full name, initial, and capitalized everything.
 * 3. Calculate the volume of a sphere.
 * */

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
String firstName; // First name
String lastName; // Last name
String fullName; // Full name 
// TASK #3 declare variables used here
char firstInitial; // First letter of fullname
// TASK #4 declare variables used here
double d = 0; // Diameter
double r; // Radius
double V; // Volume

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
System.out.print("Please enter your first name: ");
firstName = in.nextLine();
// Read the user's first name
System.out.println("Your first name is: " + firstName);
// Prompt the user for last name
System.out.print("Please enter your last name: ");
lastName = in.nextLine();
// Read the user's last name
System.out.println("Your last name is: " + lastName);
// Concatenate the user's first and last names
fullName = firstName + " " + lastName;
// Print out the user's full name
System.out.print("Your full name is: " + fullName);
System.out.println();	// To leave a blank line
// ADD LINES FOR TASK #3 HERE
// Get the first character from the user's first name
// Print out the user's first initial
firstInitial = firstName.charAt(0);
System.out.println("Your first initial is: " + firstInitial);
// Convert the user's full name to uppercase
fullName = fullName.toUpperCase();
// Print out the user's full name in uppercase
System.out.println("Your full name in upper case is: " + fullName);
// Print out the user's full name's length 
System.out.println("There are " + fullName.length() + " characters in your name, including space");
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

