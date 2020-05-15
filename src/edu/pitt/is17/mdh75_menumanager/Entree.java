package edu.pitt.is17.mdh75_menumanager;

public class Entree extends MenuItem {
	

   //Create constructor for name, description, and calories
   public Entree(String name, String description, int calories, double price) {
	   
	   super(name, description, calories, price);
       
   }
   
 //Create default constructor to set initial values
   public Entree() {

	   super("N/A", "N/A", 0, 0.0);
	   
   }

  
}

