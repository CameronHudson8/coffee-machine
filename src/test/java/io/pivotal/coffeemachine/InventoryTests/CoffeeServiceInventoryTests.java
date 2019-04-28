package io.pivotal.coffeemachine.InventoryTests;

import io.pivotal.coffeemachine.Inventories.CoffeeServiceInventory;
import io.pivotal.coffeemachine.Inventories.Inventory;
import org.junit.Test;

public class CoffeeServiceInventoryTests extends InventoryTests {

    @Override
    protected Inventory getInventory() {
        return new CoffeeServiceInventory();
    }

}
