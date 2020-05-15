package edu.pitt.is17.mdh75_menumanager;

/**
 * Class Menu
 * author : Matt Hauber
 * created: 10/13/2017
 */

public class Menu {

	//Create Class Variables
	public String name;
	private Entree entree;
	private Side side;
	private Salad salad;
	private Dessert dessert;

	//Constructor that sets 1 object of the class
	public Menu(String name) {

		this.name = name;
		this.entree = null;
		this.side = null;
		this.salad = null;
		this.dessert = null;


	}

	//Constructor that sets 3 objects of classes
	public Menu(String name, Entree entree, Side side) {

		this.name = name;

		//If statements to check if object is null
		if(entree == null) {

			entree = new Entree();
			this.entree = entree;

		}
		else
			this.entree = entree;

		if(side == null) {

			side = new Side();
			this.side = side;

		}
		else
			this.side = side;

	}

	//Create constructor that sets four objects of each class
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {

		this.name = name;

		//Check if object is null
		if(entree == null) {

			entree=new Entree();
			this.entree = entree;

		}
		else
			this.entree = entree;

		if(side == null) {

			side = new Side();
			this.side = side;

		}
		else
			this.side = side;

		if(salad == null) {

			salad = new Salad();
			this.salad = salad;

		}
		else
			this.salad = salad;

		if(dessert == null) {

			dessert = new Dessert();
			this.dessert = dessert;

		}
		else
			this.dessert = dessert;

	}
	
	@Override
	public String toString(){
		return name;
	}

	//Returns the total calories of all class objects
	public double totalCalories() {
		//set initial value for method if object is null
		int totalCal = 0;

		//call getCalories method to set value
		if(entree != null) {
			totalCal += entree.getCalories();
		}
		if(side != null) {
			totalCal += side.getCalories();
		}
		if(salad != null) {
			totalCal += salad.getCalories();
		}
		if(dessert != null) {
			totalCal += dessert.getCalories();
		}

		return totalCal;

	}


	//Returns the description of class objects
	public String description() {

		String menuName = null;
		String entreeDescription = null;
		String sideDescription = null;
		String saladDescription = null;
		String dessertDescription = null;


		//Return name, description, and calories if object is not null
		menuName = name + "\n";
		if(entree != null) {
			entreeDescription = "Entree: "+ entree.getName().concat(entree.getDescription()).concat(" "+ entree.getCalories()) + "\n";
		}
		else
			entreeDescription="Entree: N/A "+"\n";
		if(side != null) {
			sideDescription = "Side: " + side.getName().concat(side.getDescription()).concat(" "+ side.getCalories()) + "\n";
		}
		else
			sideDescription="Side: N/A "+"\n";
		if(salad != null) {
			saladDescription = "Salad: " + salad.getName().concat(salad.getDescription()).concat(" " + salad.getCalories()) + "\n";
		}
		else
			saladDescription="Salad: N/A "+"\n";
		if(dessert != null) {
			dessertDescription = "Dessert: " + dessert.getName().concat(dessert.getDescription()).concat(" " + dessert.getCalories());
		}
		else
			dessertDescription="Dessert: N/A "+"\n";

		return menuName + entreeDescription + sideDescription + saladDescription + dessertDescription;
	}


}