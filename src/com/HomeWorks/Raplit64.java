package com.HomeWorks;

import java.util.Scanner;

public class Raplit64 {

	public static void main(String[] args) {
		/*
		 * For you to do:
You should input:
int end;
Write a for loop that will print out a series of numbers starting 
at 0 and ending at the doubled value of end(value must be taken from a user), exclusive.
Each number should be on the same line, separated by a space.
Example Output:
Int: 5
0 1 2 3 4 5 6 7 8 9
Int: 8
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
In: -5
(no output) 
		 */
		 Scanner input=new Scanner(System.in);
		    int end=input.nextInt();
		    int end2=end*2;
		    for (int n=0; n<end2; n++) {
		      System.out.print(n+" ");
		    }

	}

}
