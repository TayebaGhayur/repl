package com.HomeWorks;

import java.util.Scanner;

public class Raplit38 {

	public static void main(String[] args) {
	  /*
	   * For you to do:
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="manual testing"
Otherwise --> subject="Java"
Output:
Today you will be learning ____
	   */
		Scanner input=new Scanner(System.in);
		   System.out.println("It is weekend?");
		    boolean weekend=input.nextBoolean();
		    if(!weekend) {
		      System.out.println("Today you will be learning manual testing");
		    }else {
		      System.out.println("Today you will be learning Java");
		    }

	}

}
