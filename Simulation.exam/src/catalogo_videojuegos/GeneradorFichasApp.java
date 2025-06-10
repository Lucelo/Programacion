package catalogo_videojuegos;

import java.io.File;
import java.util.List;

public class GeneradorFichasApp {
    public static void main(String[] args) {
        String rutaXML = (args.length > 0) ? args[0] : "catalogo_videojuegos.xml";
        String salida = "fichas"; // Carpeta de salida
        boolean mkdir = new File(salida).mkdir();// Crear si no existe

        List<Videojuego> videojuegos = VideojuegoParser.parseXML(rutaXML);
        List<String> ficheros = FichaGenerator.generarFichas(videojuegos, salida);

        System.out.println("\n--- RESUMEN ---");
        System.out.println("Videojuegos leídos: " + videojuegos.size());
        System.out.println("Fichas generadas: " + ficheros.size());
        System.out.println("Ficheros:");
        ficheros.forEach(f -> System.out.println(" - " + f));
    }
}
