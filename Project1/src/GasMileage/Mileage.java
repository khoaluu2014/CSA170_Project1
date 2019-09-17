/*
 * @Khoa Luu 09/17/2019
 * This program is to calculate gas mileage
 * */

package GasMileage;

import java.util.Scanner;
public class Mileage {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			
		//Variables
		double milesDriven = 0; // Driven miles
		double gallonsUsed = 0; // Gallons used
		double mileage = 0;// Mileage
		
		//Print a line indicating this program will calculate mileage
		System.out.println("This program will calculate your mileage: ");
		
		//Prompt user for miles driven
		System.out.println("Please input your driven miles: ");
		milesDriven = in.nextDouble();
		//Read miles driven
		System.out.printf("You have driven: %.2f %n"  ,milesDriven);
		//Prompt user for gallons used
		System.out.println("Please input your gallons used: ");
		gallonsUsed = in.nextDouble();
		//Read gallons used
		System.out.printf("You have used : %.2f %n" ,gallonsUsed);
		//Calculate miles per gallon
		mileage = milesDriven / gallonsUsed;
		//Print miles per gallon 
		System.out.printf("Your mileage is: %.2f miles per gallon %n" ,mileage);
	}
}
