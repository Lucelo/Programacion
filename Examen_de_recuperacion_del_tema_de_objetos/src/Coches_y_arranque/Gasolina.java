package Coches_y_arranque;

public class Gasolina {

    //Clase Gasolina carcula la presion y el Combustible y se la pase a arranque y mostrar
        private boolean presion;
        private int capacidad;
        private int nivel;

        public Gasolina(boolean presion, int capacidad, int nivel) {
            this.presion = presion;
            this.capacidad = capacidad;
            this.nivel = nivel;
        }

        public boolean poseePresion() {
            return presion;
        }

        public boolean TieneCombustible() {
            return nivel > 0;
        }

        public void mostrar() {
            System.out.println("Gasolina: Presión: " + (presion ? "Correcta" : "Incorrecta") +
                    ", Capacidad: " + capacidad + "L, Nivel: " + nivel + "L");
        }

}
