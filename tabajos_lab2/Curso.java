import java.util.ArrayList;

public class Curso {

    private String codigo;
    private String nombre;
    private CategoriaCurso categoria;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public static final int CAPACIDAD_MAXIMA = 30;

    public Curso(String codigo, String nombre, CategoriaCurso categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.estudiantes = new ArrayList<>();
    }

    public boolean agregarEstudiante(Estudiante estudiante) {

        if (estudiantes.size() < CAPACIDAD_MAXIMA) {
            estudiantes.add(estudiante);
            return true;
        }

        return false;
    }

    public boolean estaDisponible() {
        return estudiantes.size() < CAPACIDAD_MAXIMA;
    }

    public int cantidadEstudiantes() {
        return estudiantes.size();
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public CategoriaCurso getCategoria() {
        return categoria;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}