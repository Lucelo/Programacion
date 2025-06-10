package gestion_de_la_biblioteca;

import java.time.LocalDate;

public class Audiovisual extends Libro implements Prestable {
    private String titulo;
    private TAudioVisual formato;

    public Audiovisual(String titulo, TAudioVisual formato) {
        super("El Gran Gatsby", new String[]{"F. Scott Fitzgerald"}, "9788491050563", "Sinopsis del libro 1");
        this.titulo = titulo;
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public TAudioVisual getFormato() {
        return formato;
    }

    @Override
    public void prestar(Usuario usuario, LocalDate fechaInicio) {
        Prestamo prestamo = new Prestamo(this, fechaInicio, usuario);
        usuario.agregarPrestamo(prestamo);
    }
}


