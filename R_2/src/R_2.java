import javax.management.StringValueExp;
import  java.util.Scanner;
import static java.lang.String.*;

public class R_2 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Dime un numero");

        String num1 = "10010";

        StringBuilder sb = new StringBuilder(num1);

        //String num2 = sb.reverse().toString();

        int resul = 0;

        for (int i = num1.length() - 1 ; i >= 0 ; i--){
            resul += Integer.parseInt(num1.charAt(i) + "") * Math.pow(2, i);
        }
        System.out.println("El resultado es "+ resul);




    }
}