package com.HomeWorks;

import java.util.Scanner;

public class Raplit33 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Ask the user to enter any number
if a user enters a number and it is even, print "Value is even", otherwise print "Value is odd" and prints Odd value is just right
If the number is even then check if it is greater than 1000 or not.
If the number is greater than 1000, then print "Even value is large", else print "Even value is just right".
Example Output:
Please enter a number
Value is odd
Example Output:
Please enter a number
Value is odd
Odd value is just right
Example Output:
Please enter a number
Value is even
Even value is large
		 */
		Scanner input=new Scanner(System.in);
	    System.out.println("Please enter a number");
	    int n=input.nextInt();
	    if(n%2==0) {
	    System.out.println("Value is even");
	    if(n>1000) {
	      System.out.println("Even value is large");
	    }else {
	      System.out.println("Even value is just right");
	    }
	   }else if (n%2!=0){
	      System.out.println("Value is odd");
	      System.out.println("Odd value is just right");
	       }

	}

}
