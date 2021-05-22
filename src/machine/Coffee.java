package machine;

public abstract class Coffee {
    protected int waterRequired;
    protected int milkRequired;
    protected int coffeeBeansRequired;
    protected int price;

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
