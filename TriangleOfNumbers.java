package Basic_Syntax_Excercise;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        for (int cols = 1; cols <=n ; cols++) {

            for (int rows = 1; rows <=cols ; rows++) {
                System.out.print(cols+" ");
            }
            System.out.println();
        }

    }
}

