package machine;

public class CoffeeMachine {
    int water;
    int milk;
    int coffeeBeans;
    int money;
    int cups;


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

    public int getQuantityPossible() {
        int [] cupsAvailable = new int[3];

        cupsAvailable[0] = this.water / 200;
        cupsAvailable[1] = this.milk / 50;
        cupsAvailable[2] = this.coffeeBeans / 15;

        //bubble sort

        int n = cupsAvailable.length;
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j< n-i-1; j++) {
                if (cupsAvailable[j] > cupsAvailable[j+1]) {
                    //swap [j+1] and [j]
                    int temp = cupsAvailable[j];
                    cupsAvailable[j] = cupsAvailable[j+1];
                    cupsAvailable[j+1] = temp;
                }
            }

        }
        return cupsAvailable[0];
    }

    public void printDetails() {
        System.out.println("The coffee machine has:\n"
                + this.getWater() + "ml of water\n"
                + this.getMilk() + "ml of milk\n"
                + this.getCoffeeBeans() + "g of coffee beans\n"
                + this.getCups() + " disposable cups\n"
                + "$" + this.getMoney() + " of money");
    }

}
