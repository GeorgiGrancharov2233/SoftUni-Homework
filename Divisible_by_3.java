package Basic_Syntax_CondStatements;

import java.util.Scanner;

public class Divisible_by_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        for (int i = 3; i <=100 ; i+=3) {
            System.out.println(i);
        }
    }
}
