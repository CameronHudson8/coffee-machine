package io.pivotal.coffeemachine.Drinks;

import java.util.Map;

public abstract class Drink {

	/**
	 * Name of the drink.
	 */
	private String name;

	/**
	 * Cost for the drink.
	 */
	private Double cost;

	/**
	 * Map containing ingredients required for making the drink along with the quantity.
	 */
	private Map<String, Integer> ingredients;

    public Drink() {
        this.name = this.getName();
        this.cost = this.getCost();
        this.ingredients = this.getIngredients();
    }

    public abstract String getName();

    public abstract Double getCost();

    public abstract Map<String, Integer> getIngredients();

}
