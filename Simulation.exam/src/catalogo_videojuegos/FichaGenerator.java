package catalogo_videojuegos;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FichaGenerator {
    public static List<String> generarFichas(List<Videojuego> videojuegos,
                                             String directorioSalida) {
        List<String> nombresFichero = new ArrayList<>();

        for (Videojuego vj : videojuegos) {
            String tituloNorm = normalizarTitulo(vj.getTitulo());
            String nombreFichero = tituloNorm + "_" + vj.getId() + ".txt";
            String ruta = Paths.get(directorioSalida, nombreFichero).toString();

            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(ruta))) {
                writer.write("========================================\n");
                writer.write("FICHA DEL VIDEOJUEGO\n");
                writer.write("========================================\n");
                writer.write("ID: " + vj.getId() + "\n");
                writer.write("Título: " + vj.getTitulo() + "\n");
                writer.write("Desarrollador: " + vj.getDesarrollador() + "\n");
                writer.write("Año de Lanzamiento: " + vj.getLanzamiento() + "\n");
                writer.write("Género: " + vj.getGenero() + "\n");
                writer.write("Plataformas: " + vj.getPlataforma() + "\n");
                writer.write("PEGI: " + vj.getPegi() + "\n");
                writer.write("----------------------------------------\n");
                writer.write("Descripción:\n" + vj.getDescripcion() + "\n");
                writer.write("========================================\n");
                nombresFichero.add(nombreFichero);
            } catch (IOException e) {
                System.out.println("Error escribiendo " + nombreFichero + ": " +
                        e.getMessage());
            }
        }

        return nombresFichero;
    }

    private static String normalizarTitulo(String titulo) {
        return titulo.toLowerCase()
                .replaceAll("[^a-z0-9\\-]+", "_")
                .replaceAll("_+", "_")
                .replaceAll("^_|_$", "");
    }
}
