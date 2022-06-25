package com.HomeWorks;

public class Raplit85 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program that sums all numbers that are on even index and on even row.
Expected Output:
-4
		 */
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
			int sum=0;
	    for(int x=0; x<a.length; x+=2){
	      for(int y=0; y<a[x].length; y+=2){
	        sum = sum +a[x][y];
	      }
	    }		
	    System.out.println(sum);

	}

}
