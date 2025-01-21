package E5_1_2;

public class Coche extends Vehiculo {
    private TCombustible combustible;

    public Coche(String matricula, TGama gama, TCombustible combustible) {
        super(matricula, gama);
        this.combustible = combustible;
    }

    public TCombustible getCombustible() {
        return combustible;
    }

    @Override
    public double calcularPrecioAlquiler(int numDias) {

        double precioAlquiler = (getGama().getPrecioBase + combustible.getPrecioCombustible) * numDias;
    }

    @Override
    public double calcularAlquiler(int numDias) {
        return super.calcularAlquiler(numDias) + combustible.getPrecioCombustible * numDias;
    }
}
