package Recetario;

public class Ingrediente {

    class Ingrediente {
        private String nombre;
        private double cantidad;

        public Ingrediente(String nombre, double cantidad) {
            this.nombre = nombre;
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public double getCantidad() {
            return cantidad;
        }

        public void sumarCantidad(double cantidad) {
            this.cantidad += cantidad;
        }
    }

}
