package edu.pitt.is17.mdh75_menumanager;

/**
 * Class Salad
	 * author : Matt Hauber
 * created: 10/13/2017
 */

public class Salad extends MenuItem {

   //Create constructor for name, description, and calories
   public Salad(String name, String description, int calories, double price) {

	   super(name, description, calories, price);
	   
   }
   
   //Create default contructor to set initial values
   public Salad() {
		   
	   super("N/A", "N/A", 0, 0.0);
	   
   }
   
  
}

