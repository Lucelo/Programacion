package Coches_y_arranque;

public class Cambios {

    //Clase de Cambios carcula si funciona y se la pasa a arranque y mostrar
        private int velocidades;
        private String estado;

        public Cambios(int velocidades, String estado) {
            this.velocidades = velocidades;
            this.estado = estado;
        }

        public boolean funciona() {
            return estado.equalsIgnoreCase("listo para funcionar");
        }

        public void mostrar() {
            System.out.println("Caja de cambios: Velocidades: " + velocidades + ", Estado: " + estado);
        }

}
