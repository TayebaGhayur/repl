package com.HomeWorks;

public class Raplit62 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Using for loop Print 1 to 10 Numbers except 5 and 6
Expected Output:
1
2
3
4
7
8
9
10
		 */
		int n=1;
		   for (n=1; n<=10; n++) {
		     if (n==5 || n==6) {
		       continue;
		     }
		     System.out.println(n);
		     
		   }

	}

}
