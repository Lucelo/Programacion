import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ecuación de segundo grado");

        Scanner sc= new Scanner(System.in);

        System.out.println("Primer valor!");
        int A = sc.nextInt();

        System.out.println("Segundo valor!");
        int B = sc.nextInt();

        System.out.println("Tercer valor");
        int C = sc.nextInt();

        double discriminante = Math.pow(B, 2) - 4 * A * C;

        if (discriminante > 0) {
            // Dos soluciones reales
            double solucion1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double solucion2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("La ecuación tiene dos soluciones reales: " +
                    "x1 = " + solucion1 + " x2 = " + solucion2);
        } else if (discriminante == 0) {
            // Una solución real (soluciones coincidentes)
            double solucionUnica = -B / (2 * A);
            System.out.println("La ecuación tiene una única solución real: x = " + solucionUnica);
        } else {
            // No hay soluciones reales (discriminante < 0)
            System.out.println("La ecuación no tiene soluciones reales.");
        }

    }
}