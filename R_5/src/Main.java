import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enunciado
        System.out.println("Dime los grados Farenheit que hay para trasformarlos en Celsius");
        //Valor
        int num1 = sc.nextInt();
        //Calculo
        int num2 = (num1 - 32) * 5/9;
        //Resultado
        System.out.println("El resultado seria " + num2);

    }
}