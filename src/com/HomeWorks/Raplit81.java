package com.HomeWorks;

public class Raplit81 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program that prints the highest value in the array.
Expected Output: input [5,4,8]
8
		 */
		int[] a={5, 4, 8};
	     int l=a[0];
	     for(int m=0; m<a.length; m++){
	       if(l<a[m]){
	         l=a[m];
	       }
	     }  
	       System.out.println(l);

	}

}
