package E411;

public class Rectangulo {

    private double longitud;
    private double ancho;

    public Rectangulo (){

        this.longitud = 1;
        this.ancho = 1;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0 & longitud < 20){
            this.longitud = longitud;
        } else {
            throw new IllegalArgumentException(" El valor de longitud no es valido");
        }

    }

    public void setAncho(double ancho) {
        if (ancho > 0 && ancho < 20) {
            this.ancho = ancho;
        } else {
            throw new IllegalArgumentException("El valor de ancho no es valido");
        }
    }

    public double getLongitud() {
        return longitud;
    }

    public double getAncho() {
        return ancho;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }

    // Método para calcular el área
    public double calcularArea() {
        return longitud * ancho;
    }


}
