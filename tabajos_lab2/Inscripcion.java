public class Inscripcion {

    private Estudiante estudiante;
    private Curso curso;

    public Inscripcion(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public void mostrarInscripcion() {
        System.out.println(
            "Estudiante: " + estudiante.getNombre()
        );

        System.out.println(
            "Curso: " + curso.getNombre()
        );
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Curso getCurso() {
        return curso;
    }
}