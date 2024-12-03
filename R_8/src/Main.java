import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("De que tamaño quiere el arbol!");

        int altura = sc.nextInt();

        int ancho = 0;

        int espacio = altura;

        for (int x = 0; x < altura; x++) {

            ancho = ancho - 1;

            espacio = espacio - 1;

            for (int v = 0; v < espacio; v++) {
                System.out.print(" ");
            }

            for (int c = ancho; c < 0; c++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

}