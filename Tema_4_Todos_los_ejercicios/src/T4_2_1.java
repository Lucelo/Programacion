import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class T4_2_1 {

    class Persona {
        // Atributos
        private String nombre;
        private LocalDate fechaNacimiento;
        private int dni;
        private char sexo;
        private float altura; // en metros
        private float peso;   // en kilogramos

        // Constructor
        public Persona(String nombre, String fechaNacimientoStr, int dni, char sexo, float altura, float peso) {
            this.nombre = nombre;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);
            this.dni = dni;
            this.sexo = sexo;
            this.altura = altura;
            this.peso = peso;
        }

        // Getters y setters necesarios
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public int getDni() {
            return dni;
        }

        public void setDni(int dni) {
            this.dni = dni;
        }

        public char getSexo() {
            return sexo;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }

        public float getAltura() {
            return altura;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public float getPeso() {
            return peso;
        }

        public void setPeso(float peso) {
            this.peso = peso;
        }

        // Método que devuelve la letra del DNI
        public char getLetraDni() {
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            return letras.charAt(this.dni % 23);
        }

        // Método que devuelve el Índice de Masa Corporal
        public float getIMC() {
            return peso / (altura * altura);
        }

        // Método para mostrar la información de la persona
        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Fecha de nacimiento: " + fechaNacimiento);
            System.out.println("DNI: " + dni + getLetraDni());
            System.out.println("Sexo: " + sexo);
            System.out.println("Altura: " + altura + " m");
            System.out.println("Peso: " + peso + " kg");
            System.out.printf("IMC: %.2f\n", getIMC());
        }

        // Método principal para testear
        public static void main(String[] args) {
            Persona p = new Persona("Carlos López", "15/06/1995", 12345678, 'M', 1.75f, 70.5f);
            p.mostrarInformacion();
        }
    }


}
