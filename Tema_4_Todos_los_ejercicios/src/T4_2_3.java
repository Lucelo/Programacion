public class T4_2_3 {

    // Excepción para indicar que un videojuego no puede ejecutarse
    class RequisitosNoCumplidosException extends Exception {
        public RequisitosNoCumplidosException(String mensaje) {
            super(mensaje);
        }
    }

// Reutilizamos las clases de componentes con nombres diferentes para este ejercicio

    class Microprocesador3 {
        private String modelo;
        private int nucleos;
        private float velocidadGHz;

        public Microprocesador3(String modelo, int nucleos, float velocidadGHz) {
            this.modelo = modelo;
            this.nucleos = nucleos;
            this.velocidadGHz = velocidadGHz;
        }

        public int getNucleos() {
            return nucleos;
        }

        public float getVelocidadGHz() {
            return velocidadGHz;
        }
    }

    class DiscoDuro3 {
        private int capacidadGB;

        public DiscoDuro3(int capacidadGB) {
            this.capacidadGB = capacidadGB;
        }

        public int getCapacidadGB() {
            return capacidadGB;
        }
    }

    class TarjetaGrafica3 {
        private int memoriaGB;

        public TarjetaGrafica3(int memoriaGB) {
            this.memoriaGB = memoriaGB;
        }

        public int getMemoriaGB() {
            return memoriaGB;
        }
    }

    // Clase Ordenador3 (simplificada para este ejercicio)
    class Ordenador3 {
        private Microprocesador3 cpu;
        private DiscoDuro3 disco;
        private TarjetaGrafica3 gpu;

        public Ordenador3(Microprocesador3 cpu, DiscoDuro3 disco, TarjetaGrafica3 gpu) {
            this.cpu = cpu;
            this.disco = disco;
            this.gpu = gpu;
        }

        public boolean puedeEjecutar(Videojuego juego) throws RequisitosNoCumplidosException {
            if (cpu.getNucleos() < juego.getMinNucleos()) {
                throw new RequisitosNoCumplidosException("Núcleos insuficientes.");
            }
            if (cpu.getVelocidadGHz() < juego.getMinVelocidadCPU()) {
                throw new RequisitosNoCumplidosException("Velocidad de CPU insuficiente.");
            }
            if (disco.getCapacidadGB() < juego.getEspacioNecesario()) {
                throw new RequisitosNoCumplidosException("Espacio en disco insuficiente.");
            }
            if (gpu.getMemoriaGB() < juego.getMinMemoriaGPU()) {
                throw new RequisitosNoCumplidosException("Memoria de GPU insuficiente.");
            }
            return true;
        }
    }

    // Clase Videojuego
    class Videojuego {
        private String nombre;
        private int minNucleos;
        private float minVelocidadCPU;
        private int espacioNecesario;
        private int minMemoriaGPU;

        public Videojuego(String nombre, int minNucleos, float minVelocidadCPU, int espacioNecesario, int minMemoriaGPU) {
            this.nombre = nombre;
            this.minNucleos = minNucleos;
            this.minVelocidadCPU = minVelocidadCPU;
            this.espacioNecesario = espacioNecesario;
            this.minMemoriaGPU = minMemoriaGPU;
        }

        public int getMinNucleos() {
            return minNucleos;
        }

        public float getMinVelocidadCPU() {
            return minVelocidadCPU;
        }

        public int getEspacioNecesario() {
            return espacioNecesario;
        }

        public int getMinMemoriaGPU() {
            return minMemoriaGPU;
        }

        @Override
        public String toString() {
            return nombre + " | Núcleos: " + minNucleos + " | CPU: " + minVelocidadCPU + "GHz | Disco: " + espacioNecesario + "GB | GPU: " + minMemoriaGPU + "GB";
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Creamos un videojuego con requisitos moderados
            Videojuego juego = new Videojuego("Shadow Dungeon", 4, 3.0f, 50, 4);

            // Creamos un ordenador que cumple los requisitos
            Microprocesador3 cpu = new Microprocesador3("Intel i5", 6, 3.5f);
            DiscoDuro3 disco = new DiscoDuro3(512);
            TarjetaGrafica3 gpu = new TarjetaGrafica3(6);

            Ordenador3 pc = new Ordenador3(cpu, disco, gpu);

            try {
                if (pc.puedeEjecutar(juego)) {
                    System.out.println("El ordenador puede ejecutar el juego: " + juego);
                }
            } catch (RequisitosNoCumplidosException e) {
                System.out.println("No se puede ejecutar el juego: " + e.getMessage());
            }
        }
    }


}
