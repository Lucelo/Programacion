package gestion_de_la_biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private boolean activo;
    private LocalDate fechaAlta;
    private List<Prestamo> prestamos;

    public Usuario(String nombre, boolean activo, LocalDate fechaAlta) {
        this.nombre = nombre;
        this.activo = activo;
        this.fechaAlta = fechaAlta;
        this.prestamos = new ArrayList<>();
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public boolean tienePrestamoActivo() {
        return prestamos.stream().anyMatch(p -> p.getFechaDevolucion() == null);
    }

    public void realizarPrestamo(Prestable elemento, LocalDate fechaInicio) throws BibliotecaException {
        if (!tienePrestamoActivo()) {
            elemento.prestar(this, fechaInicio);
        } else {
            System.out.println("El usuario " + nombre +" ya tiene un préstamo activo.");
        }
    }

    public void devolverPrestamo(LocalDate fechaDevolucion) {
        for (Prestamo p : prestamos) {
            if (p.getFechaDevolucion() == null) {
                p.devolver(fechaDevolucion);
                return;
            }
        }
        System.out.println("No hay préstamos activos para devolver.");
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public static void add(Usuario nombre) {
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

}
