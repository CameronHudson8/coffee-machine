package io.pivotal.coffeemachine;

import io.pivotal.coffeemachine.Drinks.*;
import io.pivotal.coffeemachine.Inventories.Inventory;

import java.util.HashMap;
import java.util.Map;

public class CoffeeService {

	/**
	 * The types of drinks that can be made by this CoffeeService.
	 */
	private static final Drink[] MENU_OPTIONS = {
			new CaffeMocha(),
			new Cappuccino(),
			new Coffee(),
	};

	private Inventory inventory;

	public CoffeeService(Inventory inventory) {
		this.inventory = inventory;
	}

	/**
	 * Returns the menu for this coffee machine.
	 *
	 * @return a map of drink name to drink cost
	 */
	public Map<String, Double> getMenu() {

		Map<String, Double> menu = new HashMap<>();
		for (Drink drink : MENU_OPTIONS) {
//			if (this.inventory.hasIngredientsFor(drink)) {
				menu.put(drink.getName(), drink.getCost());
//			}
		}
		return menu;

	}

	/**
	 * Make a drink using the given name. Ingredients for the drink are deducted from the inventory.
	 *
	 * @param name the name of the drink
	 * @return the finished drink, or null if the name does not correspond to a class
	 */
	public Drink makeDrink(String name) {

		Drink drink;
		try {
			drink = DrinkFactory.create(name);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

		for (Map.Entry<String, Integer> e : drink.getIngredients().entrySet()) {
			this.inventory.deduct(e.getKey(), e.getValue());
		}

		return drink;
	}

}
