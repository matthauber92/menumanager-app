package edu.pitt.is17.mdh75_menumanager;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * Class FileManager
 * @author : Matt Hauber
 * @created: 11/8/2017
 */


public class FileManager {
	/**
	 * Create methods with type ArrayList
	 * @param for each method as String type for txt file
	 * Use try/catch to search directory for txt file found/not found
	 *Initialize FileReader and BufferedReader methods for txt files
	 *Create empty String type for BufferedReader method when not null
	 *Store each line in String array type with split method
	 *Use length method to read array length
	 *Create new obj for dish type to store each String of array
	 *@param a + b Array for String of line at positions 0 && 1
	 *@param c at Array position 2 convert String to int type for constructor of obj
	 *Add new obj to ArrayList
	 *Close reader methods
	 *Use catch if file not found
	 *@Return ArrayList with new obj
     */
	public static ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<MenuItem> item = new ArrayList<MenuItem>();
		try {
			FileReader fr = new FileReader("data/dishes.txt"); 
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
					if(temp.length == 5 && temp[1].equals("Entree")) {
						MenuItem entre = new Entree(temp[0], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]));
						item.add(entre);
					}
					else if(temp.length == 5 && temp[1].equals("Side")) {
						MenuItem side = new Side(temp[0], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]));
						item.add(side);
					}
					else if(temp.length == 5 && temp[1].equals("Salad")) {
						MenuItem salad = new Salad(temp[0], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]));
						item.add(salad);
					}
					else if(temp.length == 5 && temp[1].equals("Dessert")) {
						MenuItem dess = new Dessert(temp[0], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]));
						item.add(dess);
				}
			}
			br.close();
			fr.close();
			/**Exception for file not found*/
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		/**Return ArrayList*/
		return item;
	}
	
	public static void writeMenu(String fileName, ArrayList<Menu> menus) {
		try{
			ArrayList<Menu> menu = new ArrayList<Menu>();
			FileWriter fw = new FileWriter("data/dishes.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(Menu menuArr : menu) {
				for(int i=0; i< menu.size(); i++){
					Menu menu1 = menu.get(i);
					menu.add(menu1);
					bw.newLine();
				}
				System.out.println(menuArr);
			}
			bw.close();
			fw.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> entr = new ArrayList<Entree>();
		try {
			FileReader fr = new FileReader("data/entrees.txt"); 
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length == 3) {
					Entree entree = new Entree(temp[0], temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]));
					entr.add(entree);
				}
			}
			br.close();
			fr.close();
			/**Exception for file not found*/
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return entr;
	}

	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> side = new ArrayList<Side>();
		try {
			FileReader fr = new FileReader("data/sides.txt"); 
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length == 3) {
					Side sid = new Side(temp[0], temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]));
					side.add(sid);
				}
			}
			br.close();
			fr.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return side;
	}

	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> salad = new ArrayList<Salad>();
		try {
			FileReader fr = new FileReader("data/salads.txt"); 
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length == 3) {
					Salad sal = new Salad(temp[0], temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]));
					salad.add(sal);
				}
			}
			br.close();
			fr.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return salad;
	}

	public static ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> dessert = new ArrayList<Dessert>();
		try {
			FileReader fr = new FileReader("data/desserts.txt"); 
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length == 3) {
					Dessert dess = new Dessert(temp[0], temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]));
					dessert.add(dess);
				}
			}
			br.close();
			fr.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return dessert;
	}
	

}





