package edu.pitt.is17.mdh75_menumanager;

public class MenuItem {

	private String name;
	private String description;
	private int calories;
	private double price;

	public MenuItem(String name, String desc, int cal, double price) {
		
		this.name = name;
		this.description = desc;
		this.calories = cal;
		this.price = price;

	}
	
	public MenuItem() {
		this.name = "N/A";
		this.description = "N/A";
		this.calories = 0;
		this.price = 0.0;
	}
	
	@Override
	public String toString(){
		
		return name;
		
	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getDescription() {

		return description;

	}

	public void setDescription(String description) {

		this.description = description;

	}

	public int getCalories() {

		return calories;

	}

	public void setCalories(int calories) {

		this.calories = calories;

	}
	
	public double getPrice() {
		
		return price;
		
	}
	
	public void setPrice(double price) {
		
		this.price = price;
		
	}

}
