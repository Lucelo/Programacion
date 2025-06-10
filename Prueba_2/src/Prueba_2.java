import java.util.Scanner;

public class Prueba_2 {
    public static void main(String[] args) {
        System.out.println("Hola Alejandro");
        Scanner valores= new Scanner(System.in);
        int dat1=0;
        String dat2;
        String dat3;
        System.out.println("Dime tu edad");
        dat1= valores.nextInt();

        System.out.println("Dime donde vives");
        dat2= valores.next();

        System.out.println("Dime tus apellidos");
        dat3= valores.next();

        System.out.println("Tu edad es "+ dat1);
        System.out.println("Eres de "+ dat2);
        System.out.println("tus apellidos son "+ dat3);

    }
}
