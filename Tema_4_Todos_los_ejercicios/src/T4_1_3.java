import java.util.Scanner;

public class T4_1_3 {

    class MaquinaCafe {
        private int dosisCafe;
        private int dosisLeche;
        private int vasos;
        private double monedero;

        // Constructor: inicializa depósitos llenos y monedero con saldo inicial
        public void MaquinaCafe(double dineroInicial) {
            this.dosisCafe = 50;
            this.dosisLeche = 50;
            this.vasos = 80;
            this.monedero = dineroInicial;
        }

        // Método para llenar todos los depósitos
        public void llenarDepositos() {
            this.dosisCafe = 50;
            this.dosisLeche = 50;
            this.vasos = 80;
            System.out.println("Los depósitos han sido llenados completamente.");
        }

        // Método para vaciar el monedero
        public void vaciarMonedero() {
            System.out.println("Monedero vaciado. Se han retirado " + monedero + " euros.");
            monedero = 0;
        }

        // Método para consultar el estado de la máquina
        public void consultarEstado() {
            System.out.println("\n--- Estado de la máquina ---");
            System.out.println("Dosis de café: " + dosisCafe);
            System.out.println("Dosis de leche: " + dosisLeche);
            System.out.println("Vasos disponibles: " + vasos);
            System.out.println("Dinero en monedero: " + monedero + " euros");
        }

        // Método genérico para servir un producto
        private void servirProducto(double precio, int cafeNecesario, int lecheNecesaria, double dineroIntroducido) {
            if (dineroIntroducido < precio) {
                System.out.println("Error: Dinero insuficiente.");
                return;
            }

            // Comprobamos existencias
            if (vasos < 1 || dosisCafe < cafeNecesario || dosisLeche < lecheNecesaria) {
                System.out.println("Error: No hay suficientes ingredientes o vasos.");
                return;
            }

            double cambio = dineroIntroducido - precio;

            // Comprobamos si se puede dar el cambio
            if (cambio > monedero) {
                System.out.println("Error: No hay suficiente cambio en la máquina.");
                return;
            }

            // Descontamos ingredientes
            dosisCafe -= cafeNecesario;
            dosisLeche -= lecheNecesaria;
            vasos--;

            // Añadimos el dinero al monedero
            monedero += precio;

            System.out.println("Producto servido correctamente.");
            if (cambio > 0) {
                System.out.printf("Recoge tu cambio de %.2f euros.%n", cambio);
                monedero -= cambio; // Devolvemos cambio
            }
        }

        // Métodos públicos para cada bebida
        public void servirCafeSolo(double dinero) {
            servirProducto(1.0, 1, 0, dinero);
        }

        public void servirLeche(double dinero) {
            servirProducto(0.8, 0, 1, dinero);
        }

        public void servirCafeConLeche(double dinero) {
            servirProducto(1.5, 1, 1, dinero);
        }
    }

    public class Principal {
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Creamos la máquina con dinero inicial
            System.out.print("Introduce el dinero inicial del monedero: ");
            double dineroInicial = scanner.nextDouble();
            MaquinaCafe maquina = new MaquinaCafe(dineroInicial);

            int opcion;
            do {
                System.out.println("\n--- MENÚ MÁQUINA DE CAFÉ ---");
                System.out.println("1. Servir café solo (1.00€)");
                System.out.println("2. Servir leche (0.80€)");
                System.out.println("3. Servir café con leche (1.50€)");
                System.out.println("4. Consultar estado de la máquina");
                System.out.println("5. Apagar y salir");
                System.out.print("Elige una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el dinero: ");
                        maquina.servirCafeSolo(scanner.nextDouble());
                        break;
                    case 2:
                        System.out.print("Introduce el dinero: ");
                        maquina.servirLeche(scanner.nextDouble());
                        break;
                    case 3:
                        System.out.print("Introduce el dinero: ");
                        maquina.servirCafeConLeche(scanner.nextDouble());
                        break;
                    case 4:
                        maquina.consultarEstado();
                        break;
                    case 5:
                        System.out.print("¿Seguro que quieres apagar la máquina? (s/n): ");
                        char confirmar = scanner.next().toLowerCase().charAt(0);
                        if (confirmar == 's') {
                            maquina.consultarEstado();
                            maquina.vaciarMonedero();
                            System.out.println("Máquina apagada. ¡Hasta pronto!");
                        } else {
                            opcion = 0; // Volver al menú
                        }
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (opcion != 5);

            scanner.close();
        }
    }
}
