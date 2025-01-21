package E5_1_2;

public class Microbus {
    private static final double COSTE_PLAZA = 5;

    private int numPlazas;

    public Microbus(String matricula, TGama gama, int numPlazas) {
        super(matricula, gama);
        this.numPlazas = numPlazas;

    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public double calcularPrecioAlquiler(int numDias) {
        return (getGama().getPrecioBase() + numPlazas * COSTE_PLAZA) * numDias;
    }
}
