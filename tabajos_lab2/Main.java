import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        SistemaGestion sistema = new SistemaGestion();

        // =========================
        // INGRESAR PROFESOR
        // =========================

        System.out.println("===== REGISTRO DEL PROFESOR =====");

        System.out.print("Ingrese nombre del profesor: ");
        String nombreProfesor = teclado.nextLine();

        System.out.print("Ingrese DNI: ");
        String dniProfesor = teclado.nextLine();

        System.out.print("Ingrese correo: ");
        String correoProfesor = teclado.nextLine();

        System.out.print("Ingrese especialidad: ");
        String especialidad = teclado.nextLine();

        Profesor profesor = new Profesor(
                nombreProfesor,
                dniProfesor,
                correoProfesor,
                especialidad
        );

        sistema.agregarProfesor(profesor);


        // =========================
        // INGRESAR CURSO
        // =========================

        System.out.println("\n===== REGISTRO DEL CURSO =====");

        System.out.print("Ingrese código del curso: ");
        String codigoCurso = teclado.nextLine();

        System.out.print("Ingrese nombre del curso: ");
        String nombreCurso = teclado.nextLine();

        System.out.println("\nSeleccione una categoría:");
        System.out.println("1. LP3");
        System.out.println("2. Programación");
        System.out.println("3. Base de Datos");
        System.out.println("4. Redes");
        System.out.println("5. Inteligencia Artificial");

        System.out.print("Ingrese opción: ");
        int opcion = teclado.nextInt();
        teclado.nextLine();

        CategoriaCurso categoria;

        switch (opcion) {

            case 1:
                categoria = CategoriaCurso.LP3;
                break;

            case 2:
                categoria = CategoriaCurso.PROGRAMACION;
                break;

            case 3:
                categoria = CategoriaCurso.BASE_DE_DATOS;
                break;

            case 4:
                categoria = CategoriaCurso.REDES;
                break;

            case 5:
                categoria = CategoriaCurso.INTELIGENCIA_ARTIFICIAL;
                break;

            default:
                System.out.println("Opción no válida.");
                categoria = CategoriaCurso.PROGRAMACION;
        }

        Curso curso = new Curso(
                codigoCurso,
                nombreCurso,
                categoria
        );

        sistema.agregarCurso(curso);

        // Asignar profesor al curso
        profesor.asignarCurso(curso);


        // =========================
        // INGRESAR ESTUDIANTE
        // =========================

        System.out.println("\n===== REGISTRO DEL ESTUDIANTE =====");

        System.out.print("Ingrese nombre del estudiante: ");
        String nombreEstudiante = teclado.nextLine();

        System.out.print("Ingrese DNI: ");
        String dniEstudiante = teclado.nextLine();

        System.out.print("Ingrese correo: ");
        String correoEstudiante = teclado.nextLine();

        System.out.print("Ingrese código del estudiante: ");
        String codigoEstudiante = teclado.nextLine();

        Estudiante estudiante = new Estudiante(
                nombreEstudiante,
                dniEstudiante,
                correoEstudiante,
                codigoEstudiante
        );

        sistema.agregarEstudiante(estudiante);


        // =========================
        // INSCRIBIR ESTUDIANTE
        // =========================

        System.out.println("\n===== INSCRIPCIÓN =====");

        estudiante.inscribirse(curso);

        System.out.println("\n¡Estudiante inscrito correctamente!");


        // =========================
        // MOSTRAR INFORMACIÓN
        // =========================

        System.out.println("\n===== INFORMACIÓN =====");

        estudiante.mostrarInformacion();

        System.out.println();

        profesor.mostrarInformacion();

        System.out.println();

        sistema.mostrarCantidadEstudiantes(curso);

        sistema.mostrarCursosDisponibles();

        teclado.close();
    }
}