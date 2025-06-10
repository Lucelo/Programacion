package gestion_de_la_biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();

        libros.add(new Libro("El Gran Gatsby", new String[]{"F. Scott Fitzgerald"}, "9788491050563", "Sinopsis del libro 1"));
        libros.add(new Libro("1984", new String[]{"George Orwell"}, "9788423340661", "Sinopsis del libro 2"));
        libros.add(new Libro("Don Quijote de la Mancha", new String[]{"Miguel de Cervantes"}, "9788420412146", "Sinopsis del libro 3"));
        libros.add(new Libro("Moby-Dick", new String[]{"Herman Melville"}, "9780142000083", "Sinopsis del libro 4"));
        libros.add(new Libro("Cien años de soledad", new String[]{"Gabriel García Márquez"}, "9780307474728", "Sinopsis del libro 5"));
        libros.add(new Libro("La vida de Bermudo. Parte 1", new String[]{"Miguel de Cervantes", "Pinocho", "Robocop"}, "9781234567890", "Cuenta la historia del maravilloso Bermudo y sus andanzas suspendiendo alumnos en exámenes de recuperación"));
        libros.add(new Libro("Ulises", new String[]{"James Joyce"}, "9788497931038", "Sinopsis del libro 6"));
        libros.add(new Libro("Orgullo y prejuicio", new String[]{"Jane Austen"}, "9788491050914", "Sinopsis del libro 7"));
        libros.add(new Libro("En busca del tiempo perdido", new String[]{"Marcel Proust"}, "9788437604943", "Sinopsis del libro 8"));
        libros.add(new Libro("Crimen y castigo", new String[]{"Fyodor Dostoevsky"}, "9788491051836", "Sinopsis del libro 9"));
        libros.add(new Libro("El viejo y el mar", new String[]{"Ernest Hemingway"}, "9788499897503", "Sinopsis del libro 10"));
        libros.add(new Libro("La vida de Bermudo. Parte 2", new String[]{"Thor", "F. Scott Fitzgerald", "El chapulín colorado"}, "9781234567891", "Continúa la historia tras la épica batalla con los alumnos suspensos y la aparición de un nuevo enemigo: los exámenes de septiembre"));

        List<Audiovisual> audiovisuales = new ArrayList<>();

        audiovisuales.add(new Audiovisual("El Padrino", TAudioVisual.BLURAY));
        audiovisuales.add(new Audiovisual("El Padrino del cuñao del vecino de mi prima Angustias la mayor", TAudioVisual.DVD));
        audiovisuales.add(new Audiovisual("Titanic", TAudioVisual.DVD));
        audiovisuales.add(new Audiovisual("La La Land", TAudioVisual.BLURAY));
        audiovisuales.add(new Audiovisual("Jurassic Park", TAudioVisual.DVD));
        audiovisuales.add(new Audiovisual("El Señor de los Anillos: La Comunidad del Anillo", TAudioVisual.BLURAY));
        audiovisuales.add(new Audiovisual("El Señor de los Anillos: La Comunidad de Vecinos", TAudioVisual.BLURAY));



        Biblioteca biblioteca = new Biblioteca("Biblioteca del Miravent");

        for (Libro libro: libros) {
            biblioteca.agregarElementoAlCatalogo(libro);
        }

        for (Audiovisual audiovisual: audiovisuales) {
            biblioteca.agregarElementoAlCatalogo(audiovisual);
        }


        List<Usuario> usuarios = new ArrayList<>();
        Usuario pepe = new Usuario("Pepe", true, LocalDate.of(2020, 1, 1));
        Usuario maria = new Usuario("María", false, LocalDate.of(2022, 5, 10));
        Usuario juan = new Usuario("Juan", true, LocalDate.of(2021, 9, 15));
        Usuario ana = new Usuario("Ana", true, LocalDate.of(2023, 2, 28));
        Usuario pedro = new Usuario("Pedro", true, LocalDate.of(2022, 12, 1));


        biblioteca.agregarUsuario(pepe);
        biblioteca.agregarUsuario(maria);
        biblioteca.agregarUsuario(juan);
        biblioteca.agregarUsuario(ana);
        biblioteca.agregarUsuario(pedro);


        biblioteca.realizarPrestamo(pepe, libros.get(0), LocalDate.of(2020, 1, 1));
        //Esta debe fallar
        biblioteca.realizarPrestamo(pepe, libros.get(1), LocalDate.of(2020, 1, 7));

        // María no está activa
        biblioteca.realizarPrestamo(maria, audiovisuales.get(4), LocalDate.of(2022, 12, 4));

        biblioteca.devolverPrestamo(pepe, LocalDate.of(2020, 1, 25));
        biblioteca.realizarPrestamo(pepe, audiovisuales.get(0), LocalDate.of(2022, 3, 4));
        biblioteca.devolverPrestamo(pepe, LocalDate.of(2022, 3, 6));
        biblioteca.realizarPrestamo(pepe, libros.get(5), LocalDate.of(2021, 1, 1));
        biblioteca.realizarPrestamo(juan, audiovisuales.get(2), LocalDate.of(2021, 1, 1));
        biblioteca.devolverPrestamo(juan, LocalDate.of(2023, 12, 6));
        biblioteca.realizarPrestamo(ana, audiovisuales.get(1), LocalDate.of(2021, 8, 1));
        biblioteca.devolverPrestamo(ana, LocalDate.of(2021, 8, 6));
        biblioteca.realizarPrestamo(pedro, libros.get(5), LocalDate.of(2021, 1, 1));
        biblioteca.devolverPrestamo(pedro, LocalDate.of(2021, 2, 6));
        biblioteca.realizarPrestamo(pedro, audiovisuales.get(4), LocalDate.of(2023, 4, 1));
        biblioteca.realizarPrestamo(ana, libros.get(11), LocalDate.of(2023, 5, 17));
        biblioteca.devolverPrestamo(ana, LocalDate.of(2023, 6, 13));


        long prestamosDesdeFecha = biblioteca.contarPrestamosDesdeFecha(LocalDate.of(2021, 1, 2));
        System.out.println("Prestamos desde 02/01/2021: " + prestamosDesdeFecha);

        System.out.printf("Número de libros que tienen más de un autor: %d\n", biblioteca.contarLibrosMasDeUnAutor());

        System.out.printf("Número de préstamos en los últimos 90 días que se pasaron de la fecha de devolución: %d\n", biblioteca.prestamosUltimos90DiasPasaFechaMaxima());

        // Este método imprimirá
        biblioteca.autoresMasPrestados();

    }
}