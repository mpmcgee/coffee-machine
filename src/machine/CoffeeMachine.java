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

    public static void setQuantities() {
        // quantities = new int[4]
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:\n");
        int waterInMachine = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:\n");
        int milkInMachine = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:\n");
        int beansInMachine = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:\n");
        int cupsNeeded = scanner.nextInt();

        int [] cupsAvailable = new int[3];

        cupsAvailable[0] = waterInMachine / 200;
        cupsAvailable[1] = milkInMachine / 50;
        cupsAvailable[2] = beansInMachine / 15;

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

        int cupsRemaining = cupsAvailable[0] - cupsNeeded;


        if (cupsNeeded <= cupsAvailable[0]) {
            if (cupsRemaining >= 1) {
                System.out.println("Yes, I can make that amount of coffee (and even " + cupsRemaining + " more than that)");
            } else {
                System.out.println("Yes, I can make that amount of coffee");
            }
        } else {
            System.out.println("No, I can make only " + cupsAvailable[0] + "cup(s) of coffee");
        }


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
        setQuantities();
    }

}
