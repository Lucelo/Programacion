package E5_1_2;

public enum TGama {

    Baja(30), Media(40), Alta(50);

    private double precioBase;

    TGama(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

   /* public double getGama (){
        double TGama;
    }*/
}
