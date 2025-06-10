package examen;
public class instrumento {

    //atributos usados
    protected String nombre;
    protected String instru;
    protected String material;
    protected double peso;
    protected boolean afinado;

    public instrumento (String nombre, String instru, String material, double peso, boolean afinado ) {
        this.nombre = nombre;
        this.instru = instru;
        this.material = material;
        this.peso = peso;
        this.afinado = afinado;
    }

    public String getNombre() {
        return nombre;
    }

    public void afinar() {
        if (!afinado) {
            System.out.println("Afinando el instrumento musical " + nombre);
            afinado = true;
        }
    }

    public void tocar() {
        System.out.println("Tocando el instrumento musical " + nombre);
    }

    //clase de los instrumentos de cuerda
    static class Cuerda extends instrumento{

        public Cuerda(String nombre, String instru, String material, double peso, boolean afinado) {
            super(nombre, instru, material, peso, afinado);
        }



    }

    //clase de los instrumentos de viento
    static class Viento extends instrumento{

        public Viento(String nombre, String instru, String material, double peso, boolean afinado) {
            super(nombre, instru, material, peso, afinado);
        }




    }

    //clase de los instrumentos de percusion
    static class Percusion extends instrumento{

        public Percusion(String nombre, String instru, String material, double peso, boolean afinado) {
            super(nombre, instru, material, peso, afinado);
        }



    }



}
