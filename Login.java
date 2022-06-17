package Basic_Syntax_Excercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String username= scanner.nextLine();
        String currentPassword= scanner.nextLine();
        String password="";
        int passwordCount=0;

        for (int i = username.length()-1; i >=0 ; i--) {
            char currentSymbol=username.charAt(i);
            password=password+currentSymbol;

        }
        while (!currentPassword.equals(password)){
            passwordCount++;
            if (passwordCount>=4){
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            currentPassword= scanner.nextLine();



        }
            if (currentPassword.equals(password)){
                System.out.printf("User %s logged in.",username);
            }
        }

    }

