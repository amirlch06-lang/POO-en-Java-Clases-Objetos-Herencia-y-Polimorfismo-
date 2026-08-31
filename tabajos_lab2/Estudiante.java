import java.util.ArrayList;

public class Estudiante extends Persona {

    private String codigo;
    private ArrayList<Curso> cursos;

    public Estudiante(String nombre, String dni, String correo, String codigo) {
        super(nombre, dni, correo);
        this.codigo = codigo;
        this.cursos = new ArrayList<>();
    }

    public void inscribirse(Curso curso) {
        cursos.add(curso);
        curso.agregarEstudiante(this);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Correo: " + correo);
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
}