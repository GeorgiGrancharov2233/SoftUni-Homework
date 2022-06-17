package Basic_Syntax_CondStatements;

import java.util.Scanner;

public class Passed_or_failed {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double input=Double.parseDouble(scanner.nextLine());

        if (input>=3.0){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }
    }
}
