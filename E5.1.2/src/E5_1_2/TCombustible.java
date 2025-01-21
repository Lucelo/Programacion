package E5_1_2;

public enum TCombustible {
    GASOLINA(3.5), DIESEL(2);
    private double precioCombustible;

    private TCombustible(double precioCombustible) {
        this.precioCombustible = precioCombustible;
    }
}
