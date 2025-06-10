package Coches_y_arranque;

public class Motor {

    //Clase motor carcula si tiene aceite, la cantidad de agua como su temperatura y se la pasa a arranque y mostrar
        private String marca;
        private String modelo;
        private String serie;
        private double aceite;
        private int kilometros;
        private double agua;
        private double temperatura;

        public Motor(String marca, String modelo, String serie,
                     double aceite, int kilometros, double agua, double temperatura) {
            this.marca = marca;
            this.modelo = modelo;
            this.serie = serie;
            this.aceite = aceite;
            this.kilometros = kilometros;
            this.agua = agua;
            this.temperatura = temperatura;
        }

        public boolean nivelAceiteValido() {
            return aceite >= 0.96 && aceite <= 0.98;
        }

        public boolean nivelAguaValido() {
            return agua >= 0.7;
        }

        public boolean temperaturaValida() {
            return temperatura <= 95;
        }

        public void mostrar() {
            System.out.println("Motor: Marca: " + marca + ", Modelo: " + modelo + ", Serie: " + serie);
            System.out.println("Aceite: " + aceite + ", Agua: " + agua + ", Temp: " + temperatura + "°C");
            System.out.println("Km: " + kilometros);
        }


}
