package Equipos_deportivo;

import java.util.HashSet;
import java.util.Set;

public class Equipo {

    private final String nombre;
    private final Set<Alumno> alumnos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAlumno(Alumno alumno) throws EquipoException {
        if (!alumnos.add(alumno)) {
            throw new EquipoException("El alumno " + alumno.getNombre() + " ya está en el equipo " + nombre);
        }
    }

    public void borrarAlumno(Alumno alumno) throws EquipoException {
        if (!alumnos.remove(alumno)) {
            throw new EquipoException("El alumno " + alumno.getNombre() + " no está en el equipo " + nombre);
        }
    }

    public Alumno buscarAlumno(Alumno alumno) throws EquipoException {
        for (Alumno a : alumnos) {
            if (a.equals(alumno)) {
                return a;
            }
        }
        return null;
    }

    public void mostrarEquipo() {
        System.out.println("Equipos_deportivo.Equipo: " + nombre);
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }

    public Equipo unionEquipos(Equipo otroEquipo) {
        Equipo nuevoEquipo = new Equipo(this.nombre + " + " + otroEquipo.getNombre());
        nuevoEquipo.alumnos.addAll(this.alumnos);
        nuevoEquipo.alumnos.addAll(otroEquipo.alumnos);
        return nuevoEquipo;
    }

    public Equipo interseccionEquipos(Equipo otroEquipo) {
        Equipo nuevoEquipo = new Equipo(this.nombre + " ∩ " + otroEquipo.getNombre());
        for (Alumno a : this.alumnos) {
            if (otroEquipo.alumnos.contains(a)) {
                nuevoEquipo.alumnos.add(a);
            }
        }
        return nuevoEquipo;
    }


}
