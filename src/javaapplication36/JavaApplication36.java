/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);	// Create new Scanner object.

		// Prompt user to enter the airplane's acceleration a and take-off spead v.
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();

		// Compute the minimum runway length 
		// needed for an airplane to take off.
		double length = Math.pow(speed, 2) / (2 * acceleration);

		// Display result
		System.out.println("The minimum runway length for this" +
								 " airplane is " + length);
    }
    
}
