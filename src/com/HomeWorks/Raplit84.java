package com.HomeWorks;

public class Raplit84 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program that prints the total number of elements that are negative AND odd
Output:

3
		 */
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
	    int sum=1;
	   for(int x=0; x<a.length; x+=3){
	     for(int y=0; y<a[x].length; y+=3){
	       sum = sum+a[x][y];
	     }
	   }		
	   System.out.println(sum);
	}

}
