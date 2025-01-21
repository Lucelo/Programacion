package E5_1_2;

public abstract class Vehiculo {
    private String matricula;
    private TGama gama;

    public Vehiculo(String matricula, TGama gama) {
        this.matricula = matricula;
        this.gama = gama;
    }

    public abstract double calcularPrecioAlquiler(int numDias);

    public double calcularAlquiler(int numDias) {
        return gama.getPrecioBase();
    }

}
