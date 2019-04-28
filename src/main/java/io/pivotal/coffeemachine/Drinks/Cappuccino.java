package io.pivotal.coffeemachine.Drinks;

import java.util.HashMap;
import java.util.Map;

public class Cappuccino extends Drink {

    protected static String name = "cappuccino";
    protected static Double cost = 2.90;

    // TODO After upgrading to Java version 9+, refactor this to Map.ofEntries().
    protected static Map<String, Integer> ingredients;
    static {
        ingredients = new HashMap<>();
        ingredients.put("coffee", 2);
        ingredients.put("sugar", 1);
        ingredients.put("cream", 2);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String newName) {
        name = newName;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public void setCost(Double newCost) {
        cost = newCost;
    }

    @Override
    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    @Override
    public void setIngredients(Map<String, Integer> newIngredients) {
        ingredients = newIngredients;
    }

}
