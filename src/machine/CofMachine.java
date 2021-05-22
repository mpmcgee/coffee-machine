package machine;

public class CofMachine {
    int water;
    int milk;
    int coffeeBeans;
    int money;
    int cups;

    public CofMachine(int water, int milk, int coffeeBeans, int money, int cups) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.money = money;
        this.cups = cups;
    }


    public int getWater() {
        return this.water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return this.milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return this.coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public void checkQuantities(Coffee drink) {

        if (this.getWater() < drink.getWaterRequired()) {
            System.out.println("Sorry, not enough water!\n");
        } else if (this.getMilk() < drink.getMilkRequired()) {
            System.out.println("Sorry, not enough milk!\n");
        } else if (this.getCoffeeBeans() < drink.getCoffeeBeansRequired()) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else if (this.getCups() < 1) {
            System.out.println("Sorry, not enough cups!\n");
        } else {
            makeCoffee(drink);
            System.out.println("I have enough resources, making you a coffee!\n");
        }


    }

    public void makeCoffee(Coffee drink) {
        this.setWater(this.getWater() - drink.getWaterRequired());
        this.setMilk(this.getMilk() - drink.getMilkRequired());
        this.setCoffeeBeans(this.getCoffeeBeans() - drink.getCoffeeBeansRequired());
        this.setMoney(this.getMoney() + drink.getPrice());
        this.setCups(this.getCups() - 1);
    }

    public void printDetails() {
        System.out.println("The coffee machine has:\n"
                + this.getWater() + " ml of water\n"
                + this.getMilk() + " ml of milk\n"
                + this.getCoffeeBeans() + " g of coffee beans\n"
                + this.getCups() + " disposable cups\n"
                + "$" + this.getMoney() + " of money\n");
    }

}
