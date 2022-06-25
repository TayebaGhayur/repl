package com.HomeWorks;

public class Raplit88 {
/*
 * Create a Class Main
In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
 */
	
	 String breed, name, color;
	   void bark(){
	     System.out.println(name+" can bark");
	   }
	   void run() {
	     System.out.println(name+" can run");
	  }
	  void play() {
	    System.out.println(name+" can play");
	  }
	 public static void main(String[] args) {
	   Raplit88 a=new Raplit88();
	   a.breed="Poodle";
	   a.name="Husky";
	   a.color="Black";
	   Raplit88 b=new Raplit88();
	   b.breed="Feranch Bulldog";
	   b.name="Bulldog";
	   b.color="White";
	   Raplit88 c=new Raplit88();
	   c.breed="Beagle";
	   c.name="Labrador";
	   c.color="Brown";
	   a.bark();
	   a.run();
	   a.play();
	   b.bark();
	   b.run();
	   b.play();
	   c.bark();
	   c.run();
	   c.play();
	 }
}
