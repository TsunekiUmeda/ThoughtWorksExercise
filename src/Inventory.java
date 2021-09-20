import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Drink, Integer> mapDrinkTypeToInventories;

    public Inventory() {
        mapDrinkTypeToInventories = new HashMap<>();
    }

    public int getInventory(Drink type) {
        return mapDrinkTypeToInventories.get(type);
    }

    public void setInventory(Drink type, int inventory) {
        this.mapDrinkTypeToInventories.put(type, inventory);
    }

    public void deductInventory(Drink type) {
        if (isInventoryAvailable(type)) {
            mapDrinkTypeToInventories.put(type, mapDrinkTypeToInventories.get(type) - 1);
        }
    }

    public boolean isInventoryAvailable(Drink type) {
        return mapDrinkTypeToInventories.get(type) != 0;
    }

}
