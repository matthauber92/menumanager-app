package edu.pitt.is17.mdh75_menumanager;

/**
 * Class MenuTest
	 * author : Matt Hauber
 * created: 10/13/2017
 */


public class MenuTest
{
   public static void main(String[] args) {
      
       //Create an array of two object for Entree
       Entree[] entree = new Entree[2];
       entree[0] = new Entree("Burger ", "Well Done. ", 522, 6.00);
       entree[1] = new Entree("Chicken", " Grilled and topped with barbeque sauce. ", 213, 5.00);
      
       //Create side class menu object
       Side side = new Side("Fries", " Sea salted flavored.", 800, 10.00);
       
       //Create an array of two object for Salad
       Salad[] salad = new Salad[2];
       salad[0] = new Salad("Caesar Salad ", "Drenched in Caesar dressing and croutons ", 243, 8.00);
       salad[1] = new Salad("Grilled Chicken Salad ", "Got the meats ", 440, 4.00);
      
       //Create an object for Dessert class
       Dessert dessert = new Dessert("Cherry Pie ", "Sweet and topped with whip cream ", 530, 15.00);
      
       //Create two Menu objects
       Menu burgerMenu = new Menu("Menu1", entree[0], side);
       Menu chickenMenu = new Menu("Menu2", entree[1], side, salad[0], dessert);
      
       System.out.println(burgerMenu.description() + "" + "Total Calories : "+ burgerMenu.totalCalories() + "\n");
       System.out.println(chickenMenu.description());
       System.out.println("Total Calories : "+ chickenMenu.totalCalories());
      
      
      
      
   }
}