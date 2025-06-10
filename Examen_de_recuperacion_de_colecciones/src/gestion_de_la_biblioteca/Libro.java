package gestion_de_la_biblioteca;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Libro implements Prestable {
    private String titulo;
    private final List<String> autores;
    private final String Numerodeserie;
    private final String sinopsis;

    public Libro(String Titulos, String[] autores, String Numerodeserie, String sinopsis) {
        this.titulo = titulo;
        this.autores = Collections.singletonList(Arrays.toString(autores));
        this.Numerodeserie = Numerodeserie;
        this.sinopsis = sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getAutores() {
        return autores;
    }

    public String getNumerodeserie() {
        return Numerodeserie;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    @Override
    public void prestar(Usuario usuario, LocalDate fechaInicio) {
        Prestamo prestamo = new Prestamo(this, fechaInicio, usuario);
        usuario.agregarPrestamo(prestamo);
    }
}

