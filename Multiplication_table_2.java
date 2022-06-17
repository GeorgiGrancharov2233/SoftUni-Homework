package Basic_Syntax_CondStatements;

import java.util.Scanner;

public class Multiplication_table_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int multiplier=Integer.parseInt(scanner.nextLine());

            for (int j = multiplier; j <=10 ; j++) {
                System.out.printf("%d X %d = %d%n",n,j,n*j);
            }
            if (multiplier>10){
                System.out.printf("%d X %d = %d",n,multiplier,n*multiplier);
            }
        }
    }






