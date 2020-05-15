package edu.pitt.is17.mdh75_menumanager;
import java.util.ArrayList;
import java.util.Random;

public class MenuManager {

	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;

	public MenuManager(String dishesFile) {

		ArrayList<MenuItem> menu = FileManager.readItems(dishesFile);
		
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
	    salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();

		for(MenuItem menuArr : menu) {
			if(menuArr instanceof Entree) {
				entrees.add(new Entree(menuArr.getName(), menuArr.getDescription(), menuArr.getCalories(), menuArr.getPrice()));
			}
			else if(menuArr instanceof Side) {
				sides.add(new Side(menuArr.getName(), menuArr.getDescription(), menuArr.getCalories(), menuArr.getPrice()));
			}
			else if(menuArr instanceof Salad) {
				salads.add(new Salad(menuArr.getName(), menuArr.getDescription(), menuArr.getCalories(), menuArr.getPrice()));
			}
			else if(menuArr instanceof Dessert) {
				desserts.add(new Dessert(menuArr.getName(), menuArr.getDescription(), menuArr.getCalories(), menuArr.getPrice()));
			}

		}

	}
	
	public Menu randomMenu (String name) {
		/**
		 * Create randomMenu method integrated with class Random
		 * Return index of ArrayList and convert to int
		 * Randomize index with random and nextInt methods
		 * Return index from random position with get method
		 * Create new Menu obj with params of dish indexes
		 * @Return menu obj
		 */
		Random rdIndex = new Random();
		int indexEntrees=(int) entrees.size();
		int rdEntree = rdIndex.nextInt(indexEntrees);
		Entree randomEntree = entrees.get(rdEntree);

		int indexDess = (int) desserts.size();
		int rdDess = rdIndex.nextInt(indexDess);
		Dessert randomDessert = desserts.get(rdDess);

		int indexSalad=(int) salads.size();
		int rdSal = rdIndex.nextInt(indexSalad);
		Salad randomSalad = salads.get(rdSal);

		int indexSide=(int) sides.size();
		int rdSide = rdIndex.nextInt(indexSide);
		Side randomSide = sides.get(rdSide);
		Menu menu = new Menu("Menu", randomEntree, randomSide, randomSalad, randomDessert);

		return menu;

	}

	public ArrayList<Entree> getEntrees() {

		return entrees;

	}
	public void setEntrees(ArrayList<Entree> entree) {

		this.entrees = entree;

	}
	public ArrayList<Side> getSides() {

		return sides;

	}
	public void setSides (ArrayList<Side> side) {

		this.sides = side;

	}
	public ArrayList<Salad> getSalads() {

		return salads;

	}
	public void setSalads(ArrayList<Salad> salad) {

		this.salads = salad;

	}
	public ArrayList<Dessert> getDesserts() {

		return desserts;

	}
	public void setDesserts(ArrayList<Dessert> dessert) {

		this.desserts = dessert;

	}

}
