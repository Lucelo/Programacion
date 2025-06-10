import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {




        try (FileReader fr = new FileReader("input.txt");

             BufferedReader br = new BufferedReader(fr)) {

            int contador = 0;
            while (br.readLine() != null) {
                contador ++;

            }
            System.out.println("El fichero tiene " + contador);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}