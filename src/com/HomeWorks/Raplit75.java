package com.HomeWorks;

public class Raplit75 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Using the following array.
{45, 78, 12, 67, 55, 89, 23, 77, 88}
Create a for loop to extract values from that 
array so your output looks as below:
Expected Output:
78 55 77    
Note: Find out what is the start point an how
much you need to increment to get the result.
		 */
		int[] a={45, 78, 12, 67, 55, 89, 23, 77, 88};
	    for(int j=1; j<a.length; j+=3) {
	      System.out.print(a[j]+" ");
	    }
	}

}
