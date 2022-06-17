package Basic_Syntax_CondStatements;

import java.util.Scanner;

public class Back_In_Thirty_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());

        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesPlusThirty=minutes+30;
        if (minutesPlusThirty>60){
            hours=hours+1;
            minutesPlusThirty=minutesPlusThirty%60;
        }
        if (hours > 23) {
            hours=hours%24;
        }

            if (minutesPlusThirty<10){
                System.out.printf("%d:0%d",hours,minutesPlusThirty);
            }else {
                System.out.printf("%d:%d",hours,minutesPlusThirty);
            }
        }
    }
