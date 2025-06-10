package gestion_de_la_biblioteca;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Biblioteca {
    private String nombre;
    private List<Usuario> usuarios;
    private List<Prestable> catalogo;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.usuarios = new ArrayList<>();
        this.catalogo = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void agregarElementoAlCatalogo(Libro libro) {
        if (libro != null) catalogo.add(libro);
    }
    public void agregarElementoAlCatalogo(Audiovisual audiovisual) {
        if (audiovisual != null) catalogo.add(audiovisual);
    }

    public void realizarPrestamo(Usuario usuario, Libro libro, LocalDate fechaInicio) {
        if (usuario.tienePrestamoActivo()) {
            System.out.println("El usuario ya tiene un préstamo activo.");
            return;
        }
        libro.prestar(usuario, fechaInicio);
        System.out.println("Fecha máxima de devolución: " + fechaInicio.plusDays(14));
    }

    public void devolverPrestamo(Usuario usuario, LocalDate fechaDevolucion) {
        usuario.devolverPrestamo(fechaDevolucion);
    }

    public long contarPrestamosDesdeFecha(LocalDate fecha) {
        return usuarios.stream()
                .flatMap(u -> u.getPrestamos().stream())
                .filter(p -> !p.getFechaInicio().isBefore(fecha))
                .count();
    }

    public Object contarLibrosMasDeUnAutor() {
        return catalogo.stream()
                .filter(e -> e instanceof Libro)
                .map(e -> (Libro) e)
                .filter(l -> l.getAutores().size() > 1)
                .count();
    }

    public Object prestamosUltimos90DiasPasaFechaMaxima() {
        LocalDate hoy = LocalDate.now();
        LocalDate hace90Dias = hoy.minusDays(90);

        return usuarios.stream()
                .flatMap(u -> u.getPrestamos().stream())
                .filter(p -> p.getFechaInicio().isAfter(hace90Dias))
                .filter(Prestamo::estaAtrasado)
                .count();
    }

    public void autoresMasPrestados() {
        Map<String, Integer> conteoAutores = new HashMap<>();

        for (Usuario usuario : usuarios) {
            for (Prestamo prestamo : usuario.getPrestamos()) {
                if (prestamo.getElemento() instanceof Libro) {
                    Libro libro = (Libro) prestamo.getElemento();
                    for (String autor : libro.getAutores()) {
                        conteoAutores.put(autor, conteoAutores.getOrDefault(autor, 0) + 1);
                    }
                }
            }
        }

        if (conteoAutores.isEmpty()) {
            System.out.println("No se han registrado préstamos de libros.");
            return;
        }

        int max = Collections.max(conteoAutores.values());

        List<String> autoresTop = conteoAutores.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Autor(es) más prestado(s):");
        for (String autores : autoresTop) {
            System.out.println("- " + autores + " (" + max + " préstamos)");
        }
    }
}
