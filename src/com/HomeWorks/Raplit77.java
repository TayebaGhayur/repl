package com.HomeWorks;

import java.util.Scanner;

public class Raplit77 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Create an array of integers that will store 5 elements taken from a user
Don't print any prompt message for the user
Then print out all the elements you have created in the first loop in reverse order.
Example: 
Input: 
1
2
3
4
5
Output:
5
4
3
2
1
		 */
			   Scanner input=new Scanner(System.in);
			   int[] e=new int[5];
			   for(int i=1; i<e.length; i+=1){
			     e[i]=input.nextInt();


			     System.out.println(e[i]);
			   }
	}

}
