package Basic_Syntax_Excercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int age=Integer.parseInt(scanner.nextLine());
        String personType="";

        if (age>=0 && age<=2){
            personType="baby";
        }else if (age>=3 && age <=13){
            personType=("child");
        }else if (age>=14 && age<=19){
            personType=("teenager");
        }else if (age>=20 && age <=65){
            personType=("adult");
        }else if (age>=66){
            personType=("elder");
        }
        System.out.println(personType);
    }
}
