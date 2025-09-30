import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nombre;
    private String codigo;
    private List<Alumno> alumnos;


    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.alumnos = new ArrayList<>();
    }

    public boolean agregarAlumno(Alumno alumno) {
        if (alumno == null) {
            System.out.println("ERROR: No se puede agregar un alumno nulo.");
            return false;
        }

        if (perteneceAlumno(alumno.getMatricula())) {
            System.out.println("ERROR: El alumno con matrícula " + alumno.getMatricula() + " ya está en el curso.");
            return false;
        }

        return alumnos.add(alumno);
    }


    public boolean eliminarAlumno(String matricula) {
        Alumno alumnoAEliminar = null;
        for (Alumno a : alumnos) {
            if (Objects.equals(a.getMatricula(), matricula)) {
                alumnoAEliminar = a;
                break;
            }
        }

        if (alumnoAEliminar != null) {
            return alumnos.remove(alumnoAEliminar);
        } else {
            System.out.println("ERROR: No se encontró el alumno con matrícula " + matricula + " para eliminar.");
            return false;
        }
    }

    public boolean perteneceAlumno(String matricula) {
        for (Alumno a : alumnos) {
            if (Objects.equals(a.getMatricula(), matricula)) {
                return true;
            }
        }
        return false;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("--- INFORMACIÓN DEL CURSO ---\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Código: ").append(codigo).append("\n");
        sb.append("Total de Alumnos: ").append(alumnos.size()).append("\n");

        if (alumnos.isEmpty()) {
            sb.append("\nEl curso no tiene alumnos registrados.");
        } else {
            sb.append("\n--- LISTA DE ALUMNOS ---\n");
            for (Alumno alumno : alumnos) {
                sb.append("- ").append(alumno.toString()).append("\n");
            }
        }

        return sb.toString();
    }
}