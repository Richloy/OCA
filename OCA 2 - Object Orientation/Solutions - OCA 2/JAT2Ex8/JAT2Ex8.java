/*
SuperClass
Abstract class Car(accelerate() method) 

Subclasses (override the accelerate() method - polymorphism).

Ferrari (2 standard cars)

SquadCar (activateSiren(), useWalkieTalkie())

AstonMartin (transformToSubmarine())

Story: 
James Bond is chasing two villains driving Ferraris.
Bond himself is being chased by a cop in squad car.

A bridge is looming in the distance. It is starting to raise.

>>>All cars should accelerate.

>>>The cop activates his siren and gets on his walkie-talkie. 
He asks for back-up. "Cut him off once he crosses the bridge..I've got you now, boy!".

>>>Half way across the bridge, Bond steers the car towards the water and
   activates submarine transformation functionality.

Main Class
*/

import java.util.ArrayList;

public class JAT2Ex8{

   public static void main(String[] args){
     // Create an arraylist to store Car objects
	 ArrayList<Car> cars = new ArrayList<Car>();
   
     // Populate the arraylist with object references
	 cars.add(new Ferrari());
	 cars.add(new Ferrari());
	 cars.add(new SquadCar());
	 cars.add(new AstonMartin());
	 
	 
	 for(Car car:cars){
	   if(car instanceof SquadCar){
	      System.out.println(car.accelerate()); // polymorphism
		  System.out.println(((SquadCar)car).activateSiren());
		  System.out.println(((SquadCar)car).useWalkieTalkie());
	   }else if(car instanceof AstonMartin){
	      System.out.println(car.accelerate()); // polymorphism
		   System.out.println(((AstonMartin)car).transformToSubmarine());
	   }else{ // for the Ferrari's
	   System.out.println(car.accelerate());
	   }
	 }
   
   }// main

}// class