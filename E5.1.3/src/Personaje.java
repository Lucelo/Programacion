import ROL.TipoRaza;

public class Personaje {

    private static final int FUERZA_MAX = 20;
    private static final int FUERZA_MIN = 0;
    private static final int INTELIGENCIA_MAX = 20;
    private static final int INTELIGENCIA_MIN = 0;
    private String nombre;
    private TipoRaza raza;
    private int fuerza;
    private int inteligencia;
    private int vida;

    public void setFuerza( int fuerza) {
        this.fuerza=fuerza;
    }
    public void setInteligencia( int inteligencia) {
        this.inteligencia=inteligencia;
    }
    public void setVida( int vida) {
        this.vida=vida;
    }
    


}
