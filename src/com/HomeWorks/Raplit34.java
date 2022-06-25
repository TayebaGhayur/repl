package com.HomeWorks;

import java.util.Scanner;

public class Raplit34 {

	public static void main(String[] args) {
		/*
		 * Write a program to find the largest number among three distinct numbers using nested if condition
Please use Scanner class to take input from users
Expected Output:
Please enter 3 distinct numbers 4 5  and 14
The largest number is 14
		 */
		Scanner input=new Scanner(System.in);
		   System.out.println("Please enter 3 distinct numbers");
		   int m1=input.nextInt();
		   int m2=input.nextInt();
		   int m3=input.nextInt();
		   if(m1>m2) {
		   if(m1>m3){
		   System.out.println("The largest number is "+m1);
		   }else if(m1<m3){
		   System.out.println("The largest number is "+m3);
		}
		   }else if (m1<m2) {
		   if(m2>m3){
		   System.out.println("The largest number is "+m2);
		   }else if (m2<m3){
		     System.out.println("The largest number is "+m3);
		   }
		     
		  }

	}

}
