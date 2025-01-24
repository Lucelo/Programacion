package E411;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




        Rectangulo rectangulo = new Rectangulo(


        );
        try {
            System.out.print("Cuanto desea el largo: ");
            double longitud = sc.nextDouble();
            rectangulo.setLongitud(longitud);

            System.out.print("Cuanto desea el ancho: ");
            double ancho = sc.nextDouble();
            rectangulo.setAncho(ancho);

            System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

            System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        } catch (IllegalArgumentException e) {
            // Capturar valores inválidos
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Capturar otros errores
            System.out.println("Entrada no válida.");
        }


    }

}