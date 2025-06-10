package Recetario;

public class RecetaException {

    class RecetaException extends Exception {
        public RecetaException(String mensaje) {
            super(mensaje);
        }
    }

    class Receta {
        private String nombre;
        private int tiempoPreparacion;
        private HashSet<Ingrediente> ingredientes;
        private LinkedList<String> pasos;

        public Receta(String nombre, int tiempoPreparacion) {
            this.nombre = nombre;
            this.tiempoPreparacion = tiempoPreparacion;
            this.ingredientes = new HashSet<>();
            this.pasos = new LinkedList<>();
        }

        public String getNombre() {
            return nombre;
        }

        public int getTiempoPreparacion() {
            return tiempoPreparacion;
        }

        public boolean necesitaIngrediente(String nombreIngrediente) {
            return ingredientes.stream().anyMatch(i -> i.getNombre().equalsIgnoreCase(nombreIngrediente));
        }

        public void annadirIngrediente(Ingrediente ingredienteNuevo) {
            for (Ingrediente ingrediente : ingredientes) {
                if (ingrediente.getNombre().equalsIgnoreCase(ingredienteNuevo.getNombre())) {
                    ingrediente.sumarCantidad(ingredienteNuevo.getCantidad());
                    return;
                }
            }
            ingredientes.add(ingredienteNuevo);
        }

        public void borrarIngrediente(Ingrediente ingredienteABorrar) throws RecetaException {
            if (!ingredientes.removeIf(i -> i.getNombre().equalsIgnoreCase(ingredienteABorrar.getNombre()))) {
                throw new RecetaException("Recetario.Ingrediente no encontrado en la receta.");
            }
            pasos.removeIf(paso -> paso.toLowerCase().contains(ingredienteABorrar.getNombre().toLowerCase()));
        }

        public void annadirPasoDetrasDe(String pasoNuevo, String pasoExistente) throws RecetaException {
            int index = pasos.indexOf(pasoExistente);
            if (index == -1) {
                throw new RecetaException("El paso existente no se encuentra en la receta.");
            }
            pasos.add(index + 1, pasoNuevo);
        }
    }

}
