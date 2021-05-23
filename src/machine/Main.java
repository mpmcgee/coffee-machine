package machine;


public class Main {

    public static void main(String[] args) {

        //set boolean for while loop
        boolean keepGoing = true;

        //instantiate a coffee machine
        CoffeeMachine Machine = new CoffeeMachine(400, 540, 120, 550, 9);

        //loop through menu until keepGoing is false
        while (keepGoing) {
            keepGoing = Machine.menu();
        }

    }
}
