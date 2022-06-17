package Basic_Syntax_Excercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());

        int studentsCount=Integer.parseInt(scanner.nextLine());

        double lightSaberPrice=Double.parseDouble(scanner.nextLine());
        double robePrice=Double.parseDouble(scanner.nextLine());
        double beltPrice=Double.parseDouble(scanner.nextLine());

        double lightSaberCost=lightSaberPrice*(Math.ceil(studentsCount+0.1*studentsCount));
        double robeCost=robePrice*studentsCount;
         int freeBeltsCount=studentsCount/6;
        double beltCost=(studentsCount-freeBeltsCount)*beltPrice;

        double totalCost=lightSaberCost+robeCost+beltCost;

        if (totalCost<=budget){
            System.out.printf("The money is enough - it would cost %.2flv.",totalCost);
        }else
            System.out.printf("George Lucas will need %.2flv more.",totalCost-budget);

    }

}

