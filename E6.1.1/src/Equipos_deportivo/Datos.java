package Equipos_deportivo;

public class Datos {
    public static void main(String[] args) {
        try {
            //Alumnos
            Alumno a1 = new Alumno("Juan", "123A");
            Alumno a2 = new Alumno("Pedro", "456B");
            Alumno a3 = new Alumno("Maria", "789C");
            Alumno a4 = new Alumno("Luis", "101D");
            Alumno a5 = new Alumno("Ana", "202E");
            Alumno a6 = new Alumno("Antonio", "657Y");
            Alumno a7 = new Alumno("Alejandro", "936O");
            Alumno a8 = new Alumno("Tomas", "482A");

            //Equipos
            Equipo equipo1 = new Equipo("Fútbol");
            Equipo equipo2 = new Equipo("Baloncesto");

            //Los que estan en Fútbol
            equipo1.agregarAlumno(a1);
            equipo1.agregarAlumno(a2);
            equipo1.agregarAlumno(a3);
            equipo1.agregarAlumno(a7);

            //Los que estan en Baloncesto
            equipo2.agregarAlumno(a3);
            equipo2.agregarAlumno(a4);
            equipo2.agregarAlumno(a5);
            equipo2.agregarAlumno(a6);

            //
            System.out.println("Equipos");
            equipo1.mostrarEquipo();
            equipo2.mostrarEquipo();

            //
            System.out.println("Unir Equipos");
            Equipo equipoUnion = equipo1.unionEquipos(equipo2);
            equipoUnion.mostrarEquipo();

            //
            System.out.println("Intersección de equipos");
            Equipo equipoInterseccion = equipo1.interseccionEquipos(equipo2);
            equipoInterseccion.mostrarEquipo();

        } catch (EquipoException e) {
            System.out.println(e.getMessage());
        }
    }
}
