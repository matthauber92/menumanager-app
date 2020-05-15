package edu.pitt.is17.mdh75_menumanager;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class MenuRandomize
 * @author : Matt Hauber
 * @created: 11/8/2017
 */

public class MenuRandomize {
	/**
	 * Initialize ArrayList properties
     */
	private ArrayList<Entree> entrees;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	private ArrayList<Side> sides;


	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		/**
		 * Create constructor the passes corresponding txt files
		 * @param a-d String type
		 * Reference FileManager to implement methods for constructor params for each ArrayList
		 */
		entrees = FileManager.readEntrees(entreeFile);
		desserts = FileManager.readDesserts(dessertFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);

	}

	public Menu randomMenu () {
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
}
