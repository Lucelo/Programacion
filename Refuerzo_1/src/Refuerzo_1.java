import java.util.Scanner;

public class Refuerzo_1 {
    public static void main(String[] args) {
        System.out.println("Suma de numeros");
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1=0;
        num1=teclado.nextInt();
        System.out.println("Dime otro numero");
        int num2=0;
        num2=teclado.nextInt();
        int suma=num1+num2;
        System.out.println("El resurtado es " +suma);
      }
}
