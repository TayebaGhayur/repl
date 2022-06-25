package com.HomeWorks;

public class Raplit68 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program to print out the pattern:
Expected output:
$$$$
$  $
$  $
$$$$
		 */
		 for(int m=0; m<4; m++){
		      System.out.print("$");
		    }
		    System.out.println();
		    for(int a=0; a<2; a++){
		      for(int b=0; b<4; b++){
		        if(b==1 || b==2){
		          System.out.print(" ");
		          continue;
		        }
		        System.out.print("$");
		      }
		      System.out.println();
		    }
		    for(int m=0; m<4; m++){
		    System.out.print("$");
		  }
		  System.out.println();
	}

}
