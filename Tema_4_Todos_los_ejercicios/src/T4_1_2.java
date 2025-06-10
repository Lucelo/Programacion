import java.util.Scanner;

public class T4_1_2 {

    // Clase que representa una cuenta bancaria sencilla
    class Cuenta {
        private double saldo;            // Dinero disponible en la cuenta
        private int ingresos;           // Número de ingresos realizados
        private int reintegros;         // Número de reintegros realizados

        // Constructor: recibe el saldo inicial y lo asigna
        public Cuenta(double saldoInicial) {
            this.saldo = saldoInicial;
            this.ingresos = 0;
            this.reintegros = 0;
        }

        // Método para ingresar dinero
        public void ingresar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                ingresos++; // Aumentamos el contador de ingresos
                System.out.println("Ingreso realizado correctamente.");
            } else {
                System.out.println("Error: La cantidad debe ser mayor que 0.");
            }
        }

        // Método para retirar dinero
        public void retirar(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                reintegros++; // Aumentamos el contador de reintegros
                System.out.println("Reintegro realizado correctamente.");
            } else if (cantidad > saldo) {
                System.out.println("Error: Saldo insuficiente.");
            } else {
                System.out.println("Error: La cantidad debe ser mayor que 0.");
            }
        }

        // Método para consultar el saldo actual
        public double consultarSaldo() {
            return saldo;
        }

        // Método para mostrar el número de operaciones
        public void consultarOperaciones() {
            System.out.println("Número de ingresos: " + ingresos);
            System.out.println("Número de reintegros: " + reintegros);
        }
    }

    // Clase principal donde interactuamos con el usuario
    public class Principal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedimos el saldo inicial
            System.out.print("Introduce el saldo inicial de la cuenta: ");
            double saldoInicial = scanner.nextDouble();

            // Creamos una nueva cuenta con el saldo introducido
            Cuenta cuenta = new Cuenta(saldoInicial);

            int opcion;
            do {
                // Mostramos el menú de opciones
                System.out.println("\n--- MENÚ DE OPERACIONES ---");
                System.out.println("1. Hacer un reintegro");
                System.out.println("2. Hacer un ingreso");
                System.out.println("3. Consultar saldo y operaciones");
                System.out.println("4. Finalizar operaciones");
                System.out.print("Elige una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        // Opción para retirar dinero
                        System.out.print("Introduce la cantidad a retirar: ");
                        double cantidadRetiro = scanner.nextDouble();
                        cuenta.retirar(cantidadRetiro);
                        break;
                    case 2:
                        // Opción para ingresar dinero
                        System.out.print("Introduce la cantidad a ingresar: ");
                        double cantidadIngreso = scanner.nextDouble();
                        cuenta.ingresar(cantidadIngreso);
                        break;
                    case 3:
                        // Mostramos el saldo y operaciones realizadas
                        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
                        cuenta.consultarOperaciones();
                        break;
                    case 4:
                        // Confirmación para salir
                        System.out.print("¿Estás seguro de que quieres salir? (s/n): ");
                        char confirmar = scanner.next().toLowerCase().charAt(0);
                        if (confirmar == 's') {
                            System.out.println("Operaciones finalizadas. Saldo final: " + cuenta.consultarSaldo());
                            break;
                        } else {
                            opcion = 0; // Volver al menú
                        }
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (opcion != 4); // Repetimos mientras no se confirme la salida

            scanner.close(); // Cerramos el escáner
        }

    }

}
