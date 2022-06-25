package com.HomeWorks;

import java.util.Scanner;

public class Raplit28 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program to take values of length and width from the user.
Based on value define whether the shape is a square or rectangle.
Examples:
Please enter the length 18
Please enter the width 16
The shape of your object is rectangle
Please enter the length 16 
Please enter the width 16 
The shape of your object is square
		 */
		
		Scanner input=new Scanner(System.in);
	    int length=input.nextInt();
	    System.out.println("Please enter the length");
	    int width=input.nextInt();
	    System.out.println("Please enter the width");
	    if(length==18){
	      System.out.println("The shape of your object is rectangle");
	    }else if (length==16){
	      System.out.println("The shape of your object is square");
	    }

	}

}
