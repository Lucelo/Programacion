package Coches_y_arranque;

public class Bateria {

    //Clase de Bateria carcula la carga y la bateria y se la pase a arranque y mostrar
        private int capacidad;
        private int voltaje;
        private int carga;

        public Bateria(int capacidad, int voltaje, int carga) {
            this.capacidad = capacidad;
            this.voltaje = voltaje;
            this.carga = carga;
        }

        public boolean suficienteCarga() {
            return ((double) carga / capacidad) >= 0.05;
        }

        public boolean voltajeCorrecto() {
            return voltaje == 12;
        }

        public void mostrar() {
            System.out.println("Batería: Capacidad: " + capacidad + "ah, Voltaje: " + voltaje + "V, Carga: " + carga + "ah");
        }


}
