package io.pivotal.coffeemachine.Drinks;

import java.util.HashMap;
import java.util.Map;

public class CaffeMocha extends Drink {

    public static final String NAME = "caffe mocha";
    public static final Double COST = 3.90;

    // TODO After upgrading to Java version 9+, refactor this to Map.ofEntries().
    public static final Map<String, Integer> INGREDIENTS;
    static {
        INGREDIENTS = new HashMap<>();
        INGREDIENTS.put("coffee", 1);
        INGREDIENTS.put("sugar", 1);
        INGREDIENTS.put("cream", 1);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Double getCost() {
        return COST;
    }

    @Override
    public Map<String, Integer> getIngredients() {
        return INGREDIENTS;
    }

}
