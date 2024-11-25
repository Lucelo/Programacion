import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enunciado
        System.out.println("Dime los grados celsius que hay para trasformar en Fahrenheit");
        //Valor
        int num1 = sc.nextInt();
        //Calculo
        int num2 = (num1 * 9/5) + 32;
        //Resultado
        System.out.println("El resultado seria " + num2);

    }
}