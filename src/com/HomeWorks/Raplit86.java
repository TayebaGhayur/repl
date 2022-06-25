package com.HomeWorks;

public class Raplit86 {
	/*
	 *Create a class 'Main' (please do not make it public as Repl will give you an error)
Inside class declare a String variable 'name' and integer variable 'roll_no'.
Create an object of the class and assign the value of 2 to roll_no and value of "John" to name
Your program should print the following:
Name is John and roll number is 2 
	 */
	String name="John";
	   int number=2;

	   void printInfo(){
	     System.out.println("Name is "+name+" and roll number is "+number);
	   }

	    public static void main(String[] args) {
	      Raplit86 a=new Raplit86();
	      a.name="John";
	      a.number=2;
	      a.printInfo();
	    }
	}


