import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Este programa te muestra la tabla de multiplicar del 1 al 10");

        System.out.println("Dime un numero que desees");
        int num1= sc.nextInt();

        System.out.println("1 * " + num1 + " = " + num1);

        System.out.println("2 * " + num1 + " = " + num1 * 2);

        System.out.println("3 * " + num1 + " = " + num1 * 3);

        System.out.println("4 * " + num1 + " = " + num1 * 4);

        System.out.println("5 * " + num1 + " = " + num1 * 5);

        System.out.println("6 * " + num1 + " = " + num1 * 6);

        System.out.println("7 * " + num1 + " = " + num1 * 7);

        System.out.println("8 * " + num1 + " = " + num1 * 8);

        System.out.println("9 * " + num1 + " = " + num1 * 9);

        System.out.println("10 * " + num1 + " = " + num1 * 10);


    }
}