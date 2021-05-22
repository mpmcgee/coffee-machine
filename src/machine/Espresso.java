package machine;

public class Espresso extends Coffee {
    protected final int waterRequired = 250;
    protected final int coffeeBeansRequired = 16;
    protected final int milkRequired = 0;
    protected final int price = 4;

    public int getWaterRequired() {
        return waterRequired;
    }

    public int getCoffeeBeansRequired() {
        return coffeeBeansRequired;
    }

    public int getPrice() {
        return price;
    }
}
