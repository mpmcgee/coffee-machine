package machine;
import java.util.Scanner;

public class CoffeeMachine {
    int water;  //water in machine
    int milk;   //milk in machine
    int coffeeBeans;    //coffee beans in machine
    int money;  //money in machine
    int cups;   //cups in machine

    //constructor for CoffeeMachine
    public CoffeeMachine(int water, int milk, int coffeeBeans, int money, int cups) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.money = money;
        this.cups = cups;
    }

    //get water in machine
    public int getWater() {
        return this.water;
    }

    //set water in machine
    public void setWater(int water) {
        this.water = water;
    }

    //get milk in machine
    public int getMilk() {
        return this.milk;
    }

    //set milk in machine
    public void setMilk(int milk) {
        this.milk = milk;
    }

    //get coffee beans in machine
    public int getCoffeeBeans() {
        return this.coffeeBeans;
    }

    //set coffee beans in machine
    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    //get money in machine
    public int getMoney() {
        return this.money;
    }

    //set money in machine
    public void setMoney(int money) {
        this.money = money;
    }

    //get cups in machine
    public int getCups() {
        return cups;
    }

    //set cups in machine
    public void setCups(int cups) {
        this.cups = cups;
    }

    //menu for CoffeeMachine functions
    public boolean menu() {
        //list available actions
        System.out.println("Write action (buy, fill, take, remaining, exit):");

        //take user input
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println("\n");
        boolean keepGoing = true;


        //call method that corresponds to user's choice
        switch (choice) {

            case "buy":
                this.buy();
                break;

            case "fill":
                this.fill();
                break;

            case "take":
                this.take();
                break;

            case "remaining":
                this.printDetails();
                break;

            case "exit":
                keepGoing = false;
                break;

            default:
                System.out.println("Not a valid option");


        }

        //return boolean to continue or end Main method
        return keepGoing;

    }


    //fill the CoffeeMachine
    public void fill() {
        Scanner scanner = new Scanner(System.in);

        //prompt user for water to add and update quantity in the machine
        System.out.println("Write how many ml of water you want to add:");
        int water = scanner.nextInt();
        this.setWater(this.getWater() + water);

        //prompt user for milk to add and update quantity in the machine
        System.out.println("Write how many ml of milk you want to add: ");
        int milk = scanner.nextInt();
        this.setMilk(this.getMilk() + milk);

        //prompt user for coffee beans to add and update quantity in the machine
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int beans = scanner.nextInt();
        this.setCoffeeBeans(this.getCoffeeBeans() + beans);

        //prompt user for cups to add and update quantity in the machine
        System.out.println("Write how many disposable cups you want to add: ");
        int cups = scanner.nextInt();
        this.setCups(this.getCups() + cups);

    }

    //take all money out of machine
    public void take() {
        //print quantity taken out of machine
        System.out.println("I gave you $" + this.getMoney() + "\n");

        //set quantity of money in machine equal to 0
        this.setMoney(0);
    }

    //buy an drink
    public void buy() {

        //ask user to choose a drink
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();


        if (choice.equals("1")) {
            //create an Espresso object
            Espresso drink = new Espresso();

            //check to see that there are enough supplies to make selected drink
            this.checkQuantities(drink);
        }
        if (choice.equals("2")) {
            //create a Latte object
            Latte drink = new Latte();

            //check to see that there are enough supplies to make selected drink
            this.checkQuantities(drink);
        }
        if (choice.equals("3")) {
            //create a Cappuccino object
            Cappuccino drink = new Cappuccino();

            //check to see that there are enough supplies to make selected drink
            this.checkQuantities(drink);

        }
    }


    //check to see if there are sufficient supplies in CoffeeMachine to make a drink
    public void checkQuantities(Coffee drink) {

        //check to see if there is not enough water
        if (this.getWater() < drink.getWaterRequired()) {
            //if so, print message
            System.out.println("Sorry, not enough water!\n");

        //check to see if there is not enough milk
        } else if (this.getMilk() < drink.getMilkRequired()) {
            //if so, print message
            System.out.println("Sorry, not enough milk!\n");

        //check to see if there are not enough coffee beans
        } else if (this.getCoffeeBeans() < drink.getCoffeeBeansRequired()) {
            //if so, print message
            System.out.println("Sorry, not enough coffee beans!\n");

        //check to see if there are not enough cups
        } else if (this.getCups() < 1) {
            //if so, print message
            System.out.println("Sorry, not enough cups!\n");

        //otherwise make drink and print confirmation message
        } else {
            makeCoffee(drink);
            System.out.println("I have enough resources, making you a coffee!\n");
        }


    }

    //make a drink
    public void makeCoffee(Coffee drink) {

        //subtract necessary ingredients from CoffeeMachine
        this.setWater(this.getWater() - drink.getWaterRequired());
        this.setMilk(this.getMilk() - drink.getMilkRequired());
        this.setCoffeeBeans(this.getCoffeeBeans() - drink.getCoffeeBeansRequired());

        //add money to CoffeeMachine after sale
        this.setMoney(this.getMoney() + drink.getPrice());

        //subtract 1 from cup quantity in CoffeeMachine
        this.setCups(this.getCups() - 1);
    }

    //print the ingredients, cups, and money in machine
    public void printDetails() {

        System.out.println("The coffee machine has:\n"
                + this.getWater() + " ml of water\n"
                + this.getMilk() + " ml of milk\n"
                + this.getCoffeeBeans() + " g of coffee beans\n"
                + this.getCups() + " disposable cups\n"
                + "$" + this.getMoney() + " of money\n");
    }

}
