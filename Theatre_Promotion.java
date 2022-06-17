package Basic_Syntax_CondStatements;

import java.util.Scanner;

public class Theatre_Promotion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String weekDay= scanner.nextLine();

        int age=Integer.parseInt(scanner.nextLine());
        int ticketPrice=0;
        boolean notValid=false;


        switch (weekDay){
            case "Weekday":
            if (age>=0 && age<=18) {
                ticketPrice = 12;
            }
            else if (age>18 && age<=64){
                ticketPrice=18;
            }else if (age>64 && age<=122){
                ticketPrice=12;
            }
            else notValid=true;
                break;
            case "Weekend":
            if (age>=0 && age<=18){
                ticketPrice=15;
            }else if (age >18 && age<=64){
                ticketPrice=20;
            }else if (age >64 && age<=122){
                ticketPrice=15;
            }
            else notValid=true;
                break;
            case "Holiday":
                if (age>=0 && age<=18){
                    ticketPrice=5;
                }else if (age>18 && age<=64){
                    ticketPrice=12;
                }else if (age>64 && age<=122){
                    ticketPrice=10;
                }
                else notValid=true;
                break;
        }
        if (notValid){
            System.out.println("Error!");
        }else
        System.out.printf("%d$",ticketPrice);
    }
}
