package edu.pitt.is17.mdh75_menumanager;

/**
 * Class Side
 * author : Matt Hauber
 * created: 10/13/2017
 */

public class Side extends MenuItem {

	//Create constructor for name, description, and calories
	public Side(String name, String description, int calories, double price) {

		super(name, description, calories, price);

	}

	//Create default contructor to set initial values
	public Side() {

		super("N/A", "N/A", 0, 0.0);

	}


}

