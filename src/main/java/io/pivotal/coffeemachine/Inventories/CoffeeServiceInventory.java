package io.pivotal.coffeemachine.Inventories;

import java.util.HashMap;
import java.util.Map;

public class CoffeeServiceInventory implements Inventory {

    // TODO After upgrading to Java version 9+, refactor this to Map.ofEntries().
    private static Map<String, Integer> ingredients;
    static {
        ingredients = new HashMap<>();
        ingredients.put("coffee", 10);
        ingredients.put("sugar", 10);
        ingredients.put("cream", 10);
    }

    @Override
    public Map<String, Integer> getIngredients() {
        return this.ingredients;
    }

    /**
     * Deducts the specified amount of a specified ingredient name.
     * Defers to the Ingredients class to prevent duplicate logic in each concrete Inventory class.
     *
     * @param name   the name of the ingredient to reduce
     * @param amount the quantity to reduce by
     */
    @Override
    public void deduct(String name, Integer amount) {

        Integer currentStock = this.ingredients.get(name);
        if (currentStock == null) {

            // TODO Modify the interface method signature to make this throw an exception.
            System.err.println("Ingredient " + name + " does not exist.");
            return;
        }

        if (currentStock - amount < 0) {

            // TODO Modify the interface method signature to make this throw an exception.
            System.err.println("Cannot deduct " + amount + " " + name + "; there are only " + currentStock + " available.");
            return;
        }

        this.ingredients.put(name, currentStock - amount);

    }

}