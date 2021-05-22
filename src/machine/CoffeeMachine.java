package machine;
import java.util.Scanner;

public class CoffeeMachine {

    //     Write how many ml of water the coffee machine has:
    // > 300
    // Write how many ml of milk the coffee machine has:
    // > 65
    // Write how many grams of coffee beans the coffee machine has:
    // > 100
    // Write how many cups of coffee you will need:
    // > 1
    // Yes, I can make that amount of coffee

//    public static void setQuantities(CofMachine Machine) {
//        // quantities = new int[4]
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write how many ml of water the coffee machine has:\n");
//        int waterInMachine = scanner.nextInt();
//        Machine.setWater(waterInMachine);
//
//        System.out.println("Write how many ml of milk the coffee machine has:\n");
//        int milkInMachine = scanner.nextInt();
//        Machine.setMilk(milkInMachine);
//
//        System.out.println("Write how many grams of coffee beans the coffee machine has:\n");
//        int beansInMachine = scanner.nextInt();
//        Machine.setCoffeeBeans(beansInMachine);
//
//
//        System.out.println("Write how many cups of coffee you will need:\n");
//        int cupsNeeded = scanner.nextInt();
//
//        int cupsRemaining = Machine.getQuantityPossible() - cupsNeeded;
//
//
//        if (cupsNeeded <= Machine.getQuantityPossible()) {
//            if (cupsRemaining >= 1) {
//                System.out.println("Yes, I can make that amount of coffee (and even " + cupsRemaining + " more than that)");
//            } else {
//                System.out.println("Yes, I can make that amount of coffee");
//            }
//        } else {
//            System.out.println("No, I can make only " + Machine.getQuantityPossible() + "cup(s) of coffee");
//        }
//
//
//    }

    public static void buy(CofMachine Machine) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            Espresso drink = new Espresso();
            Machine.checkQuantities(drink);
        }
        if (choice.equals("2")) {
            Latte drink = new Latte();
            Machine.checkQuantities(drink);
        }
        if (choice.equals("3")) {
            Cappuccino drink = new Cappuccino();
            Machine.checkQuantities(drink);
        } else{

        }



//        Machine.printDetails();

    }

    public static void fill(CofMachine Machine) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        int water = scanner.nextInt();
        Machine.setWater(Machine.getWater() + water);

        System.out.println("Write how many ml of milk you want to add: ");
        int milk = scanner.nextInt();
        Machine.setMilk(Machine.getMilk() + milk);

        System.out.println("Write how many grams of coffee beans you want to add: ");
        int beans = scanner.nextInt();
        Machine.setCoffeeBeans(Machine.getCoffeeBeans() + beans);

        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int cups = scanner.nextInt();
        Machine.setCups(Machine.getCups() + cups);

        //Machine.printDetails();


    }

    public static void take(CofMachine Machine) {
        System.out.println("I gave you $" + Machine.getMoney() + "\n");
        Machine.setMoney(0);

//        Machine.printDetails();
    }


    public static boolean menu(CofMachine Machine) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println("\n");
        boolean keepGoing = true;



        switch (choice) {

            case "buy":
                buy(Machine);
                break;

            case "fill":
                fill(Machine);
                break;

            case "take":
                take(Machine);
                break;

            case "remaining":
                Machine.printDetails();
                break;

            case "exit":
                keepGoing = false;
                break;

            default:
                System.out.println("no match");


        }

        return keepGoing;

    }


    // public static int calculateIngredients() {
    //     System.out.println("Write how many cups of coffee you will need:\n");
    //     Scanner scanner = new Scanner(System.in);
    //     int cupsNeeded = scanner.nextInt();

    //     System.out.println("For " + cupsNeeded + "cups of coffee you will need:"
    //                         + cupsNeeded * 200 + "ml of water\n"
    //                         + cupsNeeded * 50 + "ml of milk\n"
    //                         + cupsNeeded * 15 + "g of coffee beans");

    // // }
    public static void main(String[] args) {

        //     System.out.println("Starting to make a coffee\n"
        //                         + "Grinding coffee beans\n"
        //                         + "Boiling water\n"
        //                         + "Mixing boiled water with crushed coffee beans\n"
        //                         + "Pouring coffee into the cup\n"
        //                         + "Pouring some milk into the cup\n"
        //                         + "Coffee is ready!");
        // calculateIngredients();
        boolean keepGoing = true;
        CofMachine Machine = new CofMachine(400, 540, 120, 550, 9);
        while (keepGoing) {
            keepGoing = menu(Machine);
        }

    }
}
