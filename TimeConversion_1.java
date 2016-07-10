/** Program: Time Conversion Part 1
* File: TimeConversion_1.java
* Summary: Write a program that will prompt the user to enter an hour in the 24-hour format
* and print it in the 12-hour format. Example, 18 prints 6pm.
* Author: Aaron Fonseca
* Date: July 9, 2016
**/

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion_1 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Get input from scanner
		System.out.print("Enter an hour in the 24-hour format, Example 14:25 or 06:15: ");
		String time = input.nextLine();
		input.close();
		
       try 
	       {       
	           SimpleDateFormat _24Hour = new SimpleDateFormat("HH:mm");
	           SimpleDateFormat _12Hour = new SimpleDateFormat("hh:mm a");
	           Date _24HourTime = _24Hour.parse(time);
	           System.out.println(_12Hour.format(_24HourTime));
	       } 
       catch (Exception e) 
	       {
	           e.printStackTrace();
	       }
	   }
}

