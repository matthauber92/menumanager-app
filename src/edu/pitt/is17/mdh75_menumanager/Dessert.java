package edu.pitt.is17.mdh75_menumanager;

/**
 * Class Dessert
	 * author : Matt Hauber
 * created: 10/13/2017
 */

public class Dessert extends MenuItem {

   //Create constructor for name, description, and calories
   public Dessert(String name, String description, int calories, double price) {
	   
	   super(name, description, calories, price);
	   
   }
  
   //Create default constructor to set initial values
   public Dessert() {

	   super("N/A", "N/A", 0, 0.0);
       
   }
  
}




