package Basic_Syntax_Excercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int groupNumber=Integer.parseInt(scanner.nextLine());

        String groupType= scanner.nextLine();
        String weekDay= scanner.nextLine();

        double singlePersonPrice=0;

        switch (groupType){
            case "Students":

                if (weekDay.equals("Friday")){
                    singlePersonPrice=8.45;
                }else if (weekDay.equals("Saturday")){
                    singlePersonPrice=9.8;
                }else if (weekDay.equals("Sunday")){
                    singlePersonPrice=10.46;
                }break;
            case "Business":
                if (weekDay.equals("Friday")){
                    singlePersonPrice=10.9;
                }else if (weekDay.equals("Saturday")){
                    singlePersonPrice=15.6;
                }else if (weekDay.equals("Sunday")){
                    singlePersonPrice=16;
                }break;
            case "Regular":
                if (weekDay.equals("Friday")){
                    singlePersonPrice=15;
                }else if (weekDay.equals("Saturday")){
                    singlePersonPrice=20;
                }else if (weekDay.equals("Sunday")){
                    singlePersonPrice=22.5;
                }break;
        }
        double totalPrice=singlePersonPrice*groupNumber;

        if (groupType.equals("Students") && groupNumber>=30){
            totalPrice=totalPrice-(totalPrice*0.15);
        }else if (groupType.equals("Business") && groupNumber>=100){
            totalPrice=totalPrice-10*singlePersonPrice;
        }else if (groupType.equals("Regular")&& groupNumber>=10 && groupNumber<=20){
            totalPrice=totalPrice-totalPrice*0.05;
        }
        System.out.printf("Total price: %.2f",totalPrice);

    }
}
