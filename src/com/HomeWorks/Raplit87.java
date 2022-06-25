package com.HomeWorks;

public class Raplit87 {
 /*
  * For you to do:
Create a class named 'Main' with specific attributes.
Create two objects of that class in which you will be assigning the following values and then print them.
carColor='Black'
carYear=2019
carMake='BMW'
carColor='White'
carYear=2018
carMake='Toyota'
Expected Output:
Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
  */
	String color;
	 String model;
	 int year;

	  void printCompleteInfo() {
	    System.out.println("Car color is "+color+" and car year is "+year+" and car model is "+model);
	  }
	  public static void main(String[] args) {
		  Raplit87 a=new Raplit87();
	    a.color="Black";
	    a.year=2019;
	    a.model="BMW";
	    a.printCompleteInfo();
	    Raplit87 b=new Raplit87();
	    b.color="White";
	    b.year=2018;
	    b.model="Toyota";
	    b.printCompleteInfo();
	  }

}
