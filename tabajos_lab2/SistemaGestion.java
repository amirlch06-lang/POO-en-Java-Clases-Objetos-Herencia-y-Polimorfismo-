import java.util.ArrayList;

public class SistemaGestion {

    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public SistemaGestion() {
        estudiantes = new ArrayList<>();
        profesores = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarCursosDisponibles() {

        System.out.println("\nCURSOS DISPONIBLES");

        for (Curso curso : cursos) {

            if (curso.estaDisponible()) {
                System.out.println(
                    curso.getCodigo() + " - " +
                    curso.getNombre() +
                    " | Matriculados: " +
                    curso.cantidadEstudiantes()
                );
            }
        }
    }

    public void mostrarCantidadEstudiantes(Curso curso) {

        System.out.println(
            "Curso: " + curso.getNombre()
        );

        System.out.println(
            "Cantidad de estudiantes: " +
            curso.cantidadEstudiantes()
        );
    }
}