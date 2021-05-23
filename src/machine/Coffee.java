package machine;

//abstract parent class for coffee drinks
public abstract class Coffee {

    //ingredients and price
    protected int waterRequired;
    protected int milkRequired;
    protected int coffeeBeansRequired;
    protected int price;

    //get water required to make drink
    public int getWaterRequired() {
        return waterRequired;
    }

    //get milk required to make drink
    public int getMilkRequired() {
        return milkRequired;
    }

    //get coffee beans required to make drink
    public int getCoffeeBeansRequired() {
        return coffeeBeansRequired;
    }

    //get price of drink
    public int getPrice() {
        return price;
    }

}
