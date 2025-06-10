import java.util.Scanner;

// Definimos la clase Rectangulo
public class T4_1_1 {

    public class Rectangulo {

        // Atributos privados: solo se pueden modificar desde los métodos de la clase
        private double longitud;
        private double ancho;

        // Constructor por defecto: establece ambos valores a 1
        public void Rectangulo() {
            this.longitud = 1;
            this.ancho = 1;
        }

        // Método set para la longitud con validación
        public void setLongitud(double longitud) {
            // Verificamos que el valor esté entre 0 y 20 (sin incluir 20)
            if (longitud > 0 && longitud < 20) {
                this.longitud = longitud;
            } else {
                // Si el valor no es válido, se muestra un mensaje de error
                System.out.println("Error: La longitud debe ser mayor que 0 y menor que 20.");
            }
        }

        // Método set para el ancho con validación
        public void setAncho(double ancho) {
            if (ancho > 0 && ancho < 20) {
                this.ancho = ancho;
            } else {
                System.out.println("Error: El ancho debe ser mayor que 0 y menor que 20.");
            }
        }

        // Método get para obtener el valor de longitud
        public double getLongitud() {
            return this.longitud;
        }

        // Método get para obtener el valor de ancho
        public double getAncho() {
            return this.ancho;
        }

        // Método que calcula el perímetro del rectángulo: 2 * (longitud + ancho)
        public double calcularPerimetro() {
            return 2 * (longitud + ancho);
        }

        // Método que calcula el área del rectángulo: longitud * ancho
        public double calcularArea() {
            return longitud * ancho;
        }

        // Método main donde se pide información al usuario y se muestra el resultado
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Objeto para leer datos del usuario

            Rectangulo rect = new Rectangulo(); // Creamos un nuevo rectángulo

            System.out.print("Introduce la longitud del rectángulo: ");
            double longitudInput = scanner.nextDouble();
            rect.setLongitud(longitudInput); // Intentamos establecer la longitud

            System.out.print("Introduce el ancho del rectángulo: ");
            double anchoInput = scanner.nextDouble();
            rect.setAncho(anchoInput); // Intentamos establecer el ancho

            // Mostramos el área y perímetro solo si los valores introducidos son válidos
            System.out.println("Longitud: " + rect.getLongitud());
            System.out.println("Ancho: " + rect.getAncho());

            System.out.println("Área del rectángulo: " + rect.calcularArea());
            System.out.println("Perímetro del rectángulo: " + rect.calcularPerimetro());

            scanner.close(); // Cerramos el escáner para liberar recursos
        }
    }
}
