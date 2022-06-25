package com.HomeWorks;

import java.util.Scanner;

public class Raplit44 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * Prompt user with questions: "Please enter your favorite car make"
if user enters BMW --> carOrigin = "german car"
if user enters Toyota --> carOrigin = " japanese car"
if user enters Maserati --> carOrigin = "italian car"
anything else besides those values --> carOrigin = "unknown"
The output of your program should be:
"Your favorite car is ___"
		 */
		Scanner input=new Scanner(System.in);
		   System.out.println("Please enter your favrite car make");
		   String cM=input.next();
		   String cO;
		   switch(cM) {
		   case "BMW":
		   cO="german car";
		   break;
		   case "Toyota":
		   cO="japanese car";
		   break;
		   case "Maserati":
		   cO="italian car";
		   break;
		   default:
		   cO="unknown";
		 }
		   System.out.println("Your favorite car is "+cO);

	}

}
