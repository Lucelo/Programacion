package Recetario;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        class Recetario {
            private HashMap<String, RecetaException.Receta> recetas;

            public Recetario() {
                this.recetas = new HashMap<>();
            }

            public void annadirReceta(Recetario.RecetaException.Receta nuevaReceta) throws RecetaException {
                if (recetas.containsKey(nuevaReceta.getNombre())) {
                    throw new RecetaException("La receta ya existe en el recetario.");
                }
                recetas.put(nuevaReceta.getNombre(), nuevaReceta);
            }

            public String listadoRecetasOrdenadasAlfabeticamente() throws RecetaException {
                if (recetas.isEmpty()) {
                    throw new RecetaException("No hay recetas en el recetario.");
                }
                return recetas.values().stream()
                        .sorted(Comparator.comparing(Receta::getNombre))
                        .map(r -> r.getNombre() + " - " + r.getTiempoPreparacion() + " min")
                        .reduce("", (a, b) -> a + "\n" + b);
            }

            public String listadoRecetasConIngredienteOrdenadasPorTiempoPreparacion(String ingrediente) throws RecetaException {
                List<Receta> recetasConIngrediente = new ArrayList<>();
                for (Receta receta : recetas.values()) {
                    if (receta.necesitaIngrediente(ingrediente)) {
                        recetasConIngrediente.add(receta);
                    }
                }
                if (recetasConIngrediente.isEmpty()) {
                    throw new RecetaException("No hay recetas con el ingrediente especificado.");
                }
                recetasConIngrediente.sort(Comparator.comparingInt(Receta::getTiempoPreparacion));
                return recetasConIngrediente.stream()
                        .map(r -> r.getNombre() + " - " + r.getTiempoPreparacion() + " min")
                        .reduce("", (a, b) -> a + "\n" + b);
            }
        }

    }
}