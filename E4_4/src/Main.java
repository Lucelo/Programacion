import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Datos basicos
        int s1 = 0, m1 = 0, h1 = 0;
        int dias = 0;

        //Establecer datos
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime las horas");

        int h2 = sc.nextInt();

        System.out.println("Dime los minutos");
        int m2 = sc.nextInt();

        System.out.println("Dime los segundos");
        int s2 = sc.nextInt();

        //Calculos
        s1 = (s1 + s2) % 60;

        m1 += (s1 + s2) / 60;

        m1 = (m1 + m2) % 60;

        h1 = (m1 + m2) / 60;

        h1 = (h1 + h2) % 24;

        dias = (dias + h1) % 24;

        //Resultado
        System.out.println("Son " + dias + " Días,  " + h1 + " Horas, "+ m1 + " Minutos, " + s1+ " Segundos" );

    }
}