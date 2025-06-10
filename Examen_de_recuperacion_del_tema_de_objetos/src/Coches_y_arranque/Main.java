package Coches_y_arranque;

public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Yaris", "Blanco",
                new Motor("Yamaha", "X1", "AB123", 0.97, 50000, 0.75, 90),
                new Cambios(6, "listo para funcionar"),
                new Bateria(100, 12, 95),
                new Gasolina(true, 40, 25));

        Coche coche2 = new Coche("Ford", "Fiesta", "Negro",
                new Motor("Bosch", "Z4", "CD456", 0.90, 60000, 0.60, 100),
                new Cambios(5, "listo para funcionar"),
                new Bateria(100, 12, 60),
                new Gasolina(true, 40, 20));

        Coche coche3 = new Coche("Peugeot", "208", "Amarillo",
                new Motor("Renault", "M3", "EF789", 0.96, 30000, 0.80, 80),
                new Cambios(6, "error"),
                new Bateria(100, 12, 2),
                new Gasolina(false, 40, 0));

        coche1.arranque();
        coche2.arranque();
        coche3.arranque();

        coche1.mostrar();
        coche2.mostrar();
        coche3.mostrar();
    }
}
