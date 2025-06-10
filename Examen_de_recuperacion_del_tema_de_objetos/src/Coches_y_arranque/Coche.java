package Coches_y_arranque;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private Motor motor;
    private Cambios cambios;
    private Bateria bateria;
    private Gasolina gasolina;

    public Coche(String marca, String modelo, String color,
                 Motor motor, Cambios cambios, Bateria bateria, Gasolina gasolina) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.cambios = cambios;
        this.bateria = bateria;
        this.gasolina = gasolina;
    }

    public void arranque() {
        if (cambios.funciona()) {
            if (motor.nivelAceiteValido() && motor.nivelAguaValido() &&
                    motor.temperaturaValida() && bateria.suficienteCarga() &&
                    bateria.voltajeCorrecto() && gasolina.poseePresion() &&
                    gasolina.TieneCombustible()) {
                System.out.println("El coche " + marca + " " + modelo + " ha arrancado");
            } else {
                System.out.println("El coche " + marca + " " + modelo + " no ha podido arrancar");
            }
        } else {
            System.out.println("El coche " + marca + " " + modelo + " no ha podido arrancar");
        }
    }

    public void mostrar() {
        System.out.println("\n== Información del coche ==");
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color);
        motor.mostrar();
        cambios.mostrar();
        bateria.mostrar();
        gasolina.mostrar();
    }
}

