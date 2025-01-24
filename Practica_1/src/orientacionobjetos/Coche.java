package orientacionobjetos;

public class Coche {

    private final String marca;
    private final String modelo;
    private final int anio;
    private final int litrosEnDeposito;
    private final int velocidad;


    public Coche(String marca, String modelo, int anio, int litrosEnDeposito, int velocidad) {



        this.marca = marca;
        this.modelo = modelo ;
        this.anio = anio ;
        this.litrosEnDeposito = litrosEnDeposito;
        this.velocidad=velocidad;

    }





    public void arrancar(){

        if (litrosEnDeposito > 0){
            System.out.printf("El coche %s %s %d ha arrancado a una velocidad de %s %n", marca, modelo, anio, velocidad);


        } else {
            System.out.printf("El coche %s %s no puede arrancar porque tiene el deposito vacío %n", marca, modelo);

        }


    }

}