public class Alumno {
    private String nombre;
    private String apellido;
    private String matricula;
    private int edad;
    private String carrera;
    private boolean activo;

    public Alumno() {
        this.activo = true;
    }

    public Alumno(String nombre, String apellido, String matricula, int edad, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.edad = edad;
        this.carrera = carrera;
        this.activo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }




    @Override
    public String toString() {
        return "Alumno{" +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Matrícula='" + matricula + '\'' +
                ", Edad=" + edad +
                ", Carrera='" + carrera + '\'' +
                ", Activo=" + (activo ? "Sí" : "No") +
                '}';
    }
}
//control avance: clase creada, Sobre si todos los atributos deben tener un setter. no, por ejemplo, la matricula no tiene un setter para mantenerla como un identificador inmutable una vez creado el objeto.