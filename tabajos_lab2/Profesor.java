import java.util.ArrayList;

public class Profesor extends Persona {

    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String nombre, String dni, String correo,
                    String especialidad) {

        super(nombre, dni, correo);
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void asignarCurso(Curso curso) {
        cursos.add(curso);
        curso.setProfesor(this);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Correo: " + correo);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
}