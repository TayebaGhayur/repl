package com.HomeWorks;

import java.util.Scanner;

public class Raplit22 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program to take user name, age and mobile number
First Output: "Enter your name"
Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
Third Output: "Enter your age"
Example Output:
Enter your name
Enter your mobile number
Enter your age
Your name is Weqas, your age is 45 and your mobile number is 123-456-7890
		 */
		
		Scanner n=new Scanner(System.in);
		  System.out.println("Enter your name");
		  String m=n.next();
		  System.out.println("Enter your mobile number");
		  String mN=n.next();
		  System.out.println("Enter your age");
		  int age=n.nextInt();
		  System.out.println("Your name is "+m+", your age is "+age+" and your mobile number is "+mN);


	}

}
