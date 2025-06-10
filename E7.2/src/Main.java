import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class EJ2 {

    public static void main(String[] args) {
        String buscarPalabra = "mundo";
        Path ficheroBuscarPalabra = Path.of("boletin1/Tema_7/Boletin7_2/BuscandoPalabra" + buscarPalabra + ".txt");
        Path fichero = Path.of("boletin1/Tema_7/Boletin7_2/fichero.txt");
        try (Stream<String> flujo = Files.lines(fichero)) {
            System.out.println(flujo
                    .mapToInt(s -> s.split("\\s+").length)
                    .sum());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //creo un atomic integer para que el flujo pueda procesarlo cada vez que cambie
        AtomicInteger contador = new AtomicInteger();
        try (Stream<String> flujo = Files.lines(fichero)) {
            Pattern palabra = Pattern.compile(buscarPalabra);
            flujo.map(s -> palabra.matcher(s)).forEach(m -> {
                contador.set(contador.get() + 1);
                while (m.find()) {
                    try {
                        Files.writeString(ficheroBuscarPalabra , String.format("Encontrada en linea %d columna %d \n", contador.get(), m.start()), StandardOpenOption.APPEND);
                    }
                }
            });
        } catch (IOException | RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}