package empleados_de_la_empresa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Empleados {
    //Los datos y la lista a crear
    static File empleado = new File("./datos_empleados");
    static List<File> lista_empleados = new ArrayList<>();

    //Deveria firtrar los archivos
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("empleados_unificado.txt"))) {
            for (File empleado : lista_empleados) {
                List<String> lineas = Files.readAllLines(empleado.toPath());

                // busca la palabra CONFIDENCIAL
                boolean esConfidencial = lineas.stream().anyMatch(linea ->
                        Pattern.compile("\\bCONFIDENCIAL\\b", Pattern.CASE_INSENSITIVE).matcher(linea).find());

                if (!esConfidencial) {
                    // Extraer las líneas (Nombre, Departamento, Edad)
                    for (String linea : lineas) {
                        if (linea.startsWith("Nombre: ") || linea.startsWith("Departamento: ") || linea.startsWith("Edad: ")) {
                            writer.write(linea);
                            writer.newLine();
                        }

                    }
                    // Separador
                    writer.newLine();

                }

            }

        } catch (IOException e) {
            System.err.println("Error al escribir el archivo de salida: " + e.getMessage());
        }

    }

}

