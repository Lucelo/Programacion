import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCafetera {

    private Scanner scanner;

    public MenuCafetera() {
        scanner = new Scanner(System.in);
    }

    /**
     * Muestra por pantalla las opciones disponibles.
     */
    public void mostrarMenu() {
        System.out.println("\n=== Máquina de Café ===");
        System.out.println("1. Servir café solo (1,00 €)");
        System.out.println("2. Servir leche (0,80 €)");
        System.out.println("3. Servir café con leche (1,50 €)");
        System.out.println("4. Consultar estado máquina");
        System.out.println("5. Apagar máquina y salir");
        System.out.print("Selecciona una opción [1-5]: ");
    }

    /**
     * Lee la opción elegida por el usuario y la valida.
     *
     * @return un entero entre 1 y 5
     */
    public int leerOpcion() {
        int opcion = -1;
        while (true) {
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // limpiar buffer
                if (esOpcionValida(opcion)) {
                    break;
                } else {
                    System.out.print("Opción inválida. Por favor, introduce un número entre 1 y 5: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Entrada no válida. Debes introducir un número entero: ");
                scanner.nextLine(); // descartar entrada errónea
            }
        }
        return opcion;
    }

    /**
     * Comprueba que la opción está entre 1 y 5.
     *
     * @param opcion la opción leída del usuario
     * @return true si es válida, false en caso contrario
     */
    private boolean esOpcionValida(int opcion) {
        return opcion >= 1 && opcion <= 5;
    }

    /**
     * Punto de entrada de ejemplo que muestra cómo usar la clase de menú.
     * En tu caso, aquí podrías colocar el switch que llame a tus métodos.
     */
    public static void main(String[] args) {
        MenuCafetera menu = new MenuCafetera();
        int opcion;
        do {
            menu.mostrarMenu();
            opcion = menu.leerOpcion();

            // Aquí tú pondrás tu switch para llamar a los métodos de tu Maquina
            // Por ejemplo:
            // switch(opcion)
            System.out.println("Has seleccionado la opción " + opcion + ".");
            // (Sólo para confirmación; elimínalo cuando pongas tu lógica)

        } while (opcion != 5);

        System.out.println("Apagando máquina. ¡Hasta luego!");
    }

}
