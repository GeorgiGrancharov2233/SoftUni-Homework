package Basic_Syntax_Excercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        double insertedCoins = 0;
        boolean isAccepted = true;


        double purchasedProduct = 0;


        while (!input.equals("Start")) {

            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                isAccepted = true;
                insertedCoins = insertedCoins + coins;
            } else {
                isAccepted = false;
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }
            while (!input.equals("End")) {
                switch (input) {
                    case "Nuts":
                        if (insertedCoins >= 2.0) {
                            System.out.printf("Purchased %s%n", input);
                            insertedCoins = insertedCoins - 2.0;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }break;
                    case "Water":
                        if (insertedCoins >= 0.7) {
                            System.out.printf("Purchased %s%n", input);
                            insertedCoins = insertedCoins - 0.7;
                            purchasedProduct=purchasedProduct+0.7;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }break;
                    case "Crisps":
                        if (insertedCoins >= 1.5) {
                            System.out.printf("Purchased %s%n", input);
                            insertedCoins = insertedCoins - 1.5;
                            purchasedProduct=purchasedProduct+1.5;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }break;
                    case "Soda":
                        if (insertedCoins >= 0.8) {
                            System.out.printf("Purchased %s%n", input);
                            insertedCoins = insertedCoins - 0.8;
                            purchasedProduct=purchasedProduct+0.8;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }break;
                    case "Coke":
                        if (insertedCoins >= 1.0) {
                            System.out.printf("Purchased %s%n", input);
                            insertedCoins = insertedCoins - 1.0;
                            purchasedProduct=purchasedProduct+1.0;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }break;
                    default:
                        if (!input.equals("Start")) {
                            System.out.println("Invalid product");
                            break;
                        }
                }

                input = scanner.nextLine();
            }

                System.out.printf("Change: %.2f",insertedCoins);

        }
    }

