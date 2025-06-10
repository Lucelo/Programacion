package gestion_de_la_biblioteca;

import java.time.LocalDate;

public class Prestamo {
    private Prestable elemento;
    private LocalDate fechaInicio;
    private LocalDate fechaMaximaDevolucion;
    private LocalDate fechaDevolucion;

    public Prestamo(Prestable elemento, LocalDate fechaInicio, Usuario usuario) {
        this.elemento = elemento;
        this.fechaInicio = fechaInicio;
        this.fechaMaximaDevolucion = fechaInicio.plusDays(14);
        this.fechaDevolucion = null;
    }

    public Prestable getElemento() {
        return elemento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaMaximaDevolucion() {
        return fechaMaximaDevolucion;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean estaDevuelto() {
        return fechaDevolucion != null;
    }

    public boolean estaAtrasado() {
        return estaDevuelto() && fechaDevolucion.isAfter(fechaMaximaDevolucion);
    }

    public void devolver(LocalDate fechaDevolucion) {
        if (fechaDevolucion.isBefore(fechaInicio)) {
            throw new IllegalArgumentException("La fecha de devolución no puede ser anterior a la fecha de inicio.");
        }
        this.fechaDevolucion = fechaDevolucion;
    }
}
