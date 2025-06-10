package gestion_de_la_biblioteca;

import java.time.LocalDate;

public interface Prestable {

    default void prestar(Usuario usuario, LocalDate fechaInicio) throws BibliotecaException {
        if (usuario.tienePrestamoActivo()) {
            throw new BibliotecaException("El usuario ya tiene un préstamo activo");
        }
    }
}
