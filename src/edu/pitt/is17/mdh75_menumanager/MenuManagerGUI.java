package edu.pitt.is17.mdh75_menumanager;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.swing.*;

public class MenuManagerGUI {

	private JFrame mainframe;
	private JFrame childFrame;
	private JFrame detailsFrame;
	private JLabel lblEntrees;
	private JLabel lblSides;
	private JLabel lblSalads;
	private JLabel lblDesserts;
	private JLabel detEntrees;
	private JLabel detSides;
	private JLabel detSalads;
	private JLabel detDesserts;
	private JLabel detCal;
	private JLabel detPrice;
	private JLabel lblNewMenu;
	private JButton details;
	private JButton delete;
	private JButton saveTo;
	private JComboBox<Entree> cboEntrees;
	private JComboBox<Side> cboSides;
	private JComboBox<Salad> cboSalads;
	private JComboBox<Dessert> cboDesserts;
	private JButton btnRandMenu;
	private JButton btnCreateMenu;
	private JButton btnMinCal;
	private JButton btnMaxCal;
	private JTextField input;
	private MenuManager menuManager;
	private JButton btnMenuInput;
	private JTextArea menuList;
	private JTextArea txtEntrees;
	private JTextArea txtSides;
	private JTextArea txtSalads;
	private JTextArea txtDesserts;
	private JTextArea txtTotCal;
	private JTextArea txtTotPrice;


	public MenuManagerGUI() {

		menuManager = new MenuManager("data/dishes.txt");

		ArrayList<Entree> entree = menuManager.getEntrees();
		Entree[] entrees = entree.toArray(new Entree[entree.size()]);

		ArrayList<Side> side = menuManager.getSides();
		Side[] sides = side.toArray(new Side[side.size()]);

		ArrayList<Salad> sal = menuManager.getSalads();
		Salad[] salads = sal.toArray(new Salad[sal.size()]);

		ArrayList<Dessert> dess = menuManager.getDesserts();
		Dessert[] desserts = dess.toArray(new Dessert[dess.size()]);

		ArrayList<Menu> menuArray = new ArrayList<Menu>();
		//Menu[] menuz = menuArray.toArray(new Menu[menuArray.size()]);

		//Map<Object, Menu> userMenu = new HashMap<Object, Menu>();
		Map<Object, Entree> userEntree = new HashMap<Object, Entree>();
		Map<Object, Side> userSide = new HashMap<Object, Side>();
		Map<Object, Salad> userSalad = new HashMap<Object, Salad>();
		Map<Object, Dessert> userDess = new HashMap<Object, Dessert>();
		
		mainframe = new JFrame("Menu Manager");
		mainframe.setBounds(100, 100, 850, 600);
		mainframe.setResizable(false);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setLayout(null);


		lblEntrees = new JLabel("Entrees: ");
		lblEntrees.setBounds(50, 50, 200, 30);

		lblSides = new JLabel("Sides: ");
		lblSides.setBounds(50, 100, 200, 30);

		lblSalads = new JLabel("Salads: ");
		lblSalads.setBounds(50, 150, 200, 30);

		lblDesserts = new JLabel("Desserts: ");
		lblDesserts.setBounds(50, 200, 200, 30);


		cboEntrees = new JComboBox<Entree>(entrees);
		cboEntrees.setBounds(120, 50, 300, 30);

		cboSides = new JComboBox<Side>(sides);
		cboSides.setBounds(120, 100, 300, 30);

		cboSalads = new JComboBox<Salad>(salads);
		cboSalads.setBounds(120, 150, 300, 30);

		cboDesserts = new JComboBox<Dessert>(desserts);
		cboDesserts.setBounds(120, 200, 300, 30);


		btnCreateMenu = new JButton("Create Menu with these Dishes");
		btnCreateMenu.setBounds(40, 250, 390, 30);

		btnRandMenu = new JButton("Generate a Random Menu");
		btnRandMenu.setBounds(40, 360, 390, 30);

		btnMinCal = new JButton("Generate a Minimum Calories Menu");
		btnMinCal.setBounds(40, 430, 390, 30);

		btnMaxCal = new JButton("Generate Maximum Calories Menu");
		btnMaxCal.setBounds(40, 500, 390, 30);

		details = new JButton("Details");
		details.setBounds(490, 500, 100, 30);

		delete = new JButton("Delete all");
		delete.setBounds(600, 500, 100, 30);

		saveTo = new JButton("Save to File");
		saveTo.setBounds(710, 500, 100, 30);

		menuList = new JTextArea(10,25);
		menuList.setBounds(500, 65, 300, 400);
		menuList.setEditable(false);
		menuList.setSelectionColor(Color.LIGHT_GRAY);

		mainframe.add(lblEntrees);
		mainframe.add(lblSides);
		mainframe.add(lblSalads);
		mainframe.add(lblDesserts);
		mainframe.add(cboEntrees);
		mainframe.add(cboSides);
		mainframe.add(cboSalads);
		mainframe.add(cboDesserts);
		mainframe.add(btnCreateMenu);
		mainframe.add(btnRandMenu);
		mainframe.add(btnMinCal);
		mainframe.add(btnMaxCal);
		mainframe.add(menuList);
		mainframe.add(details);
		mainframe.add(delete);
		mainframe.add(saveTo);


		btnCreateMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				childFrame = new JFrame("New Menu");
				childFrame.setBounds(340, 300, 400, 200);
				childFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				childFrame.getContentPane().setLayout(null);
				childFrame.setVisible(true);

				lblNewMenu = new JLabel("Menu Name:");
				lblNewMenu.setBounds(30, 60, 200, 20);
				childFrame.getContentPane().add(lblNewMenu);

				input = new JTextField();
				input.setBounds(lblNewMenu.getX() + 80, lblNewMenu.getY(), 250, 30);
				input.toString();
				childFrame.getContentPane().add(input);


				btnMenuInput = new JButton("Create New Menu");
				btnMenuInput.setBounds(120, 100, 200, 30);
				btnMenuInput.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){	
						if(menuList.getText().length() == 0) {
							menuList.setText(input.getText().toString());
						}
						else menuList.setText(menuList.getText() + "\n" + input.getText());
						childFrame.setVisible(false);

						Entree selectedEntree = (Entree)cboEntrees.getSelectedItem();
						Side selectedSide = (Side)cboSides.getSelectedItem();
						Salad selectedSalad = (Salad)cboSalads.getSelectedItem();
						Dessert selectedDessert = (Dessert)cboDesserts.getSelectedItem();


						//Menu menu = new Menu(menuList.getText(), selectedEntree, selectedSide, selectedSalad, selectedDessert);
						//menuArray.add(menu);

						//userMenu.put(menu, new Menu(menuList.getText(), selectedEntree, selectedSide, selectedSalad, selectedDessert));
						//userMenu.put(menuList.getText(), menu);
						userEntree.put(menuList.getText(), selectedEntree);
						userSide.put("Side", selectedSide);
						userSalad.put("Salad", selectedSalad);
						userDess.put("Dessert", selectedDessert);
					}
				});
				childFrame.getContentPane().add(btnMenuInput);	
			}
		});

		mainframe.setVisible(true);

		details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(Object menuz : userEntree.keySet()) {
					if(menuz.equals(menuList.getSelectedText())) {
						for(Entree newEnt : userEntree.values()) {
							
							String desc = newEnt.getName() + "\n" + newEnt.getDescription();

						detailsFrame = new JFrame("Menu: " + menuList.getText());
						detailsFrame.setBounds(100, 100, 950, 600);
						detailsFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
						detailsFrame.getContentPane().setLayout(null);
						detailsFrame.setVisible(true);

						detEntrees = new JLabel("Entree: ");
						detEntrees.setBounds(30, 30, 200, 20);
						detailsFrame.getContentPane().add(detEntrees);

						detSides = new JLabel("Side: ");
						detSides.setBounds(30, 130, 200, 20);
						detailsFrame.getContentPane().add(detSides);

						detSalads = new JLabel("Salad: ");
						detSalads.setBounds(30, 230, 200, 20);
						detailsFrame.getContentPane().add(detSalads);

						detDesserts = new JLabel("Dessert: ");
						detDesserts.setBounds(30, 330, 200, 20);
						detailsFrame.getContentPane().add(detDesserts);

						detCal = new JLabel("Total Calories: ");
						detCal.setBounds(30, 460, 200, 20);
						detailsFrame.getContentPane().add(detCal);

						detPrice = new JLabel("Total Price: $");
						detPrice.setBounds(30, 510, 200, 20);
						detailsFrame.getContentPane().add(detPrice);

						txtEntrees = new JTextArea(10,25);
						txtEntrees.setBounds(detEntrees.getX() + 100, detEntrees.getY(), 700, 80);
						txtEntrees.setEditable(false);
						txtEntrees.setText(desc);
						detailsFrame.add(txtEntrees);

						txtSides = new JTextArea(10,25);
						txtSides.setBounds(detSides.getX() + 100, detSides.getY(), 700, 80);
						txtSides.setEditable(false);
						detailsFrame.add(txtSides);

						txtSalads = new JTextArea(10,25);
						txtSalads.setBounds(detSalads.getX() + 100, detSalads.getY(), 700, 80);
						txtSalads.setEditable(false);
						detailsFrame.add(txtSalads);

						txtDesserts = new JTextArea(10,25);
						txtDesserts.setBounds(detDesserts.getX() + 100, detDesserts.getY(), 700, 80);
						txtDesserts.setEditable(false);
						detailsFrame.add(txtDesserts);

						txtTotCal = new JTextArea(10,25);
						txtTotCal.setBounds(detCal.getX() + 100, detCal.getY(), 110, 30);
						txtTotCal.setEditable(false);
						detailsFrame.add(txtTotCal);

						txtTotPrice = new JTextArea(10,25);
						txtTotPrice.setBounds(detPrice.getX() + 100, detPrice.getY(), 110, 30);
						txtTotPrice.setEditable(false);
						detailsFrame.add(txtTotPrice);
						
						}	
					}
				}

			}

		});

		details.setVisible(true);

	}

	public static void main(String[] args) {
		MenuManagerGUI test = new MenuManagerGUI();

	}

}
