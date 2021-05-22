package machine;

public class Cappuccino extends Coffee {
    protected final int waterRequired = 200;
    protected final int milkRequired = 100;
    protected final int coffeeBeansRequired = 12;
    protected final int price = 6;

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
