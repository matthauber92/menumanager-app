package edu.pitt.is17.mdh75_menumanager;

/**
 * Class MenuTester
 * @author : Matt Hauber
 * @created: 11/8/2017
 */

public class MenuTester {
	/**
	 * Create new obj from MenuRandomize constructor
	 * @params a-d reference txt files
	 * Integrate menuRandom method for each file
	 * @Return randomMenu menu obj results
	 */

	public static void main(String[] args) {
		MenuRandomize randomize = new MenuRandomize("data/entrees.txt","data/sides.txt","data/salads.txt","data/desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description() + "\nTotal calories "+
				myMenu.totalCalories());

	}

}
