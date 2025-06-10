import java.util.*;


public class T4_2_2 {

    // Excepción personalizada para incompatibilidades
    class IncompatibilidadException extends Exception {
        public IncompatibilidadException(String mensaje) {
            super(mensaje);
        }
    }

    // Clase PlacaBase
    class PlacaBase {
        private String marca;
        private String chipset;
        private String socket;

        public PlacaBase(String marca, String chipset, String socket) {
            this.marca = marca;
            this.chipset = chipset;
            this.socket = socket;
        }

        public String getSocket() {
            return socket;
        }

        public boolean esCompatible(Microprocesador cpu) {
            return this.socket.equalsIgnoreCase(cpu.getSocket());
        }

        @Override
        public String toString() {
            return "Placa Base: " + marca + " | Chipset: " + chipset + " | Socket: " + socket;
        }
    }

    // Clase Microprocesador
    class Microprocesador {
        private String marca;
        private String modelo;
        private int nucleos;
        private float velocidadGHz;
        private String socket;

        public Microprocesador(String marca, String modelo, int nucleos, float velocidadGHz, String socket) {
            this.marca = marca;
            this.modelo = modelo;
            this.nucleos = nucleos;
            this.velocidadGHz = velocidadGHz;
            this.socket = socket;
        }

        public String getSocket() {
            return socket;
        }

        public int getNucleos() {
            return nucleos;
        }

        public float getVelocidadGHz() {
            return velocidadGHz;
        }

        @Override
        public String toString() {
            return "CPU: " + marca + " " + modelo + " | Núcleos: " + nucleos + " | Velocidad: " + velocidadGHz + "GHz | Socket: " + socket;
        }
    }

    // Clase DiscoDuro
    class DiscoDuro {
        private String marca;
        private String tipo; // "SSD" o "HD"
        private int capacidadGB;

        public DiscoDuro(String marca, String tipo, int capacidadGB) {
            this.marca = marca;
            this.tipo = tipo;
            this.capacidadGB = capacidadGB;
        }

        public int getCapacidadGB() {
            return capacidadGB;
        }

        @Override
        public String toString() {
            return "Disco Duro: " + marca + " | Tipo: " + tipo + " | Capacidad: " + capacidadGB + "GB";
        }
    }

    // Clase TarjetaGrafica
    class TarjetaGrafica {
        private String marca;
        private String modelo;
        private int nucleosGPU;
        private float velocidadGHz;
        private int memoriaGB;

        public TarjetaGrafica(String marca, String modelo, int nucleosGPU, float velocidadGHz, int memoriaGB) {
            this.marca = marca;
            this.modelo = modelo;
            this.nucleosGPU = nucleosGPU;
            this.velocidadGHz = velocidadGHz;
            this.memoriaGB = memoriaGB;
        }

        public int getNucleosGPU() {
            return nucleosGPU;
        }

        public int getMemoriaGB() {
            return memoriaGB;
        }

        @Override
        public String toString() {
            return "GPU: " + marca + " " + modelo + " | Núcleos: " + nucleosGPU + " | Velocidad: " + velocidadGHz + "GHz | Memoria: " + memoriaGB + "GB";
        }
    }

    // Clase Ordenador
    class Ordenador {
        private PlacaBase placa;
        private Microprocesador cpu;
        private DiscoDuro disco;
        private TarjetaGrafica gpu;

        public Ordenador(PlacaBase placa, Microprocesador cpu, DiscoDuro disco, TarjetaGrafica gpu) throws IncompatibilidadException {
            if (!placa.esCompatible(cpu)) {
                throw new IncompatibilidadException("La CPU no es compatible con la placa base.");
            }
            this.placa = placa;
            this.cpu = cpu;
            this.disco = disco;
            this.gpu = gpu;
        }

        public void imprimirOrdenador() {
            System.out.println("=== Ordenador Montado ===");
            System.out.println(placa);
            System.out.println(cpu);
            System.out.println(disco);
            System.out.println(gpu);
        }
    }

}
