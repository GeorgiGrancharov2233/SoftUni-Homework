package Basic_Syntax_Excercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int orders=Integer.parseInt(scanner.nextLine());
        int orderCount=0;
        double totalPrice=0;

        for (int i = orders; i >=1 ; i--) {
            double pricePerCapsule=Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            int capsuleCount=Integer.parseInt(scanner.nextLine());

            double orderPrice=((days*capsuleCount)*pricePerCapsule);
            orderCount++;
            totalPrice=totalPrice+orderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n",orderPrice);
        }

        System.out.printf("Total: $%.2f",totalPrice);
    }
}