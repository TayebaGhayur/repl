package com.HomeWorks;

import java.util.Scanner;

public class Raplit78 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Create an integer array of integers with a size of 5 and input values with Scanner.
Don't print prompt questions for a user.
Using loop print out each element of the array that should look like the output below
Example:
Input:
1
2
3
4
5
Output:
10
20
30
40
50
		 */
		Scanner input=new Scanner(System.in);
	    int size=input.nextInt();
	    int[] a=new int[size];
	    for(int i=0; i<size; i++){
	      System.out.println(a);
	    }

	}

}
