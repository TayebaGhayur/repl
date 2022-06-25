package com.HomeWorks;

public class Raplit79 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program to print values from a 2D array
Example Output:
1.4 2.0 3.3 2.0 
4.0 1.5 6.1 1.0 
1.2 3.1 4.0 1.6 
		 */
		 double [][] array2D= {
				    {1.4,2.0,3.3,2.0},
				    {4.0,1.5,6.1,1.0},
				    {1.2,3.1,4.0,1.6}};
				    for(int x=0; x<array2D.length; x++){
				      for(int z=0; z<array2D[x].length; z++){
				     System.out.print(array2D[x][z]+" ");
				    }

				    System.out.println();
				    }  

	}

}
