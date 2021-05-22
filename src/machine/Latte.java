package machine;

public class Latte extends Coffee {
    protected final int waterRequired = 350;
    protected final int milkRequired = 75;
    protected final int coffeeBeansRequired = 20;
    protected final int price = 7;

    public int getWaterRequired() {
        return waterRequired;
    }

    public int getMilkRequired() {
        return milkRequired;
    }

    public int getCoffeeBeansRequired() {
        return coffeeBeansRequired;
    }

    public int getPrice() {
        return price;
    }
}
