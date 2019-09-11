import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Credit userMoney = new Credit();
        FuelTank tank = new FuelTank();
        Utils option = new Utils();
        boolean endlessLoop = true;
        Scanner userInput = new Scanner(System.in);
     
        while (endlessLoop) {
            System.out.println("Please chose one of the following options.");
            option.fuelOptions();
            String options = userInput.next();

            switch (options) {
                case "c":
                    System.out.println("Please insert the preferred amount of fuel and money.");

                    while (!userInput.hasNextDouble()) {
                        option.errorMessageFuel();
                        userInput.next();
                    }
                    double fuel = userInput.nextDouble();

                    while (!userInput.hasNextDouble()) {
                        option.errorMessageMoney();
                        userInput.next();
                    }
                    double money = userInput.nextDouble();

                    userMoney.addMoney(money);
                    tank.fueling(fuel);
                    System.out.println(tank);
                    break;
                case "f":

                    System.out.println("Your total is " + tank.costOfRefuel() + " Lej.");
                    boolean eLoop = true;
                    if (tank.getTank() == 0) {
                        option.thanks();
                        eLoop = false;
                        endlessLoop = false;
                    }

                    while (eLoop) {

                        if (userMoney.getMoney() == tank.costOfRefuel()) {
                            System.out.println("The amount of money was equal to the cost.");
                            option.thanks();
                            endlessLoop = false;
                            eLoop = false;
                        } else if (userMoney.getMoney() < tank.costOfRefuel()) {
                            System.out.println("The amount was not enough. The amount you added is " + userMoney.getMoney() + " Lej, the bill is " + tank.costOfRefuel() + " Lej.");
                            System.out.println("Please insert more money!");
                            double money1 = userInput.nextDouble();
                            userMoney.addMoney(money1);
                        } else {
                            System.out.println("You gave more money that necessary, the rest is " + (userMoney.getMoney() - tank.costOfRefuel()) + " Lej.");
                            option.thanks();
                            eLoop = false;
                            endlessLoop = false;
                        }

                    }
                    break;
                default:
                    System.out.println("Your input was not valid. Please only type in the character of the option you want to choose!");
            }


        }


//
//
//        while (endlessLoop) {
//            System.out.println("Please choose one of the following options");
//
//            options.options();
//
//
//            char optionChoose = userInput.next().charAt(0);
//
//            switch (optionChoose) {
//
//                case 'a':
//
//                    System.out.println("PLease input the amount of fuel you want. (1L = 5.50Lej)");
//
//                    while (!userInput.hasNextDouble()) {
//                        System.out.println("Your input was incorrect. Do not add any letters to the amount.");
//                        userInput.next();
//                    }
//                    fuelA = userInput.nextDouble();
//                    tank.fueling(fuelA);
//                    System.out.println(tank);
//                    break;
//
//                case 'b':
//                    options.fuelOptions();
//                    char fuelO = userInput.next().charAt(0);
//
//                    tank.automaticRefuel(fuelO);
//
//
//                    break;
//
//
//                case 'e':
//
//                    endlessLoop = false;
//                    break;
//
//
//            }


    }


}



