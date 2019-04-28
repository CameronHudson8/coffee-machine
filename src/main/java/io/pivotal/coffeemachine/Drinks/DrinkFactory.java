package io.pivotal.coffeemachine.Drinks;

public class DrinkFactory {

    /**
     * Instantiates a concrete Drink class based on the name provided.
     *
     * @param drinkName The name of the drink to create.
     * @return The finished drink.
     * @throws ClassNotFoundException If the name provided does not correspond to a supported class.
     */
    public static Drink create(String drinkName) throws ClassNotFoundException{
        switch (drinkName) {
            case "caffe mocha":
                return new CaffeMocha();
            case "cappuccino":
                return new Cappuccino();
            case "coffee":
                return new Coffee();
            default:
                throw new ClassNotFoundException("DrinkFactory does not support a drink named " + drinkName + ".");
        }
    }

}
