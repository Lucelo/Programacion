package examen;
import java.util.ArrayList;
import java.util.List;

public class Main {


    //Lista de los instrumentos
    public static void main(String[] args) {
        List<instrumento> instrumentos = new ArrayList<>();

        instrumentos.add(new instrumento.Cuerda("Guitarra española", "GuitarraAcustica", "Madera", 2.5, false));
        instrumentos.add(new instrumento.Cuerda("Fender Stratocaster", "GuitarraElectrica", "Metal", 3.5, true));
        instrumentos.add(new instrumento.Cuerda("Yamaha Clavinova", "Piano", "Madera", 100, false));
        instrumentos.add(new instrumento.Viento("Flauta dulce", "Flauta", "Plastico", 0.5, true));
        instrumentos.add(new instrumento.Percusion("Batería acústica", "Bateria", "Metal", 100, false));


        System.out.println("=== AFINAR Y TOCAR INSTRUMENTOS ===");
        for (instrumento instrumento : instrumentos) {
            if (!instrumento.afinado) {
                instrumento.afinar();
            }
            instrumento.tocar();
        }
/*
        //No va
        System.out.println("\n=== PRUEBA DE PORTABILIDAD ===");
        for (instrumento instrumento : instrumentos) {
            if (double peso <= 3 ) {
                System.out.println(instrumento.nombre + " es fácil de transportar");
            } else {
                System.out.println(instrumento.nombre + " no es un instrumento portátil.");
            }
        }
*/
        //No he podido
        System.out.println("\n=== PRUEBA DE AMPLIFICACIÓN ===");
        System.out.println("Conectando la guitarra eléctrica al amplificador");
        System.out.println("Ajustando el volumen del amplificador a 10");

    }

}