package E5_1_2;

public class Furgoneta extends Vehiculo {
    public static final double PRECIO_POR_PMA = 0.5;

    public double pesoMaxAutorizado;

    public Furgoneta(String matricula, TGama gama) {
        super(matricula, gama);

    }

    public double getPesoMaxAutorizado() {
        return pesoMaxAutorizado;
    }

    public double calcularPrecioAlquiler(int numDias) {
        return (getGama().getPrecioBase() + pesoMaxAutorizado * PRECIO_POR_PMA) * numDias;
    }


}
