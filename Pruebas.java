public class Pruebas {

    public static void ejecutarPruebas() {
        System.out.println("--- INICIO DE PRUEBAS DE POO: ALUMNO Y CURSO ---");

        System.out.println("\n--- 1. Creación de Alumnos ---");

        Alumno a1 = new Alumno("Pedro", "López", "10001-3", 20, "Ingeniería Civil Informática");
        Alumno a2 = new Alumno("Ana", "Gómez", "10002-K", 21, "Derecho");
        Alumno a3 = new Alumno("Juan", "Pérez", "10003-1", 19, "Medicina");
        Alumno a4 = new Alumno("María", "Soto", "10004-2", 22, "Ingeniería Civil Eléctrica");

        Alumno a5 = new Alumno();
        a5.setNombre("Javier");
        a5.setApellido("Rojas");

        a5.setEdad(23);
        a5.setCarrera("Ingeniería Comercial");
        a5.setActivo(false);

        Alumno a6 = new Alumno("Sofía", "Castro", "10006-4", 20, "Enfermería");

        System.out.println("\n--- 2. Detalle de Alumno A1 (toString) ---");
        System.out.println(a1);
        System.out.println("Carrera de A4 (Getter): " + a4.getCarrera());
        System.out.println("¿A5 está activo? " + a5.isActivo());

        // 3. CREACIÓN E INSTANCIACIÓN DE UN OBJETO CURSO (Versión 2)
        System.out.println("\n--- 3. Creación del Curso 'POO' ---");
        Curso cursoPOO = new Curso("Programación Orientada a Objetos", "INF-301");

        System.out.println("\n--- 4. Agregando Alumnos ---");
        cursoPOO.agregarAlumno(a1);
        cursoPOO.agregarAlumno(a2);
        cursoPOO.agregarAlumno(a3);
        cursoPOO.agregarAlumno(a4);
        cursoPOO.agregarAlumno(a6);

        System.out.println("\n--- 5. Prueba de Validación ---");
        cursoPOO.agregarAlumno(a1);

        System.out.println("\n--- 6. Mostrar Curso Completo ---");
        System.out.println(cursoPOO);

        System.out.println("\n--- 7. Prueba de Pertenencia ---");
        String mat_existente = "10003-1";
        String mat_inexistente = "99999-X";

        System.out.println("¿El alumno con matrícula " + mat_existente + " pertenece al curso? "
                + (cursoPOO.perteneceAlumno(mat_existente) ? "Sí" : "No"));
        System.out.println("¿El alumno con matrícula " + mat_inexistente + " pertenece al curso? "
                + (cursoPOO.perteneceAlumno(mat_inexistente) ? "Sí" : "No"));

        System.out.println("\n--- 8. Prueba de Eliminación ---");
        String mat_a_eliminar = "10002-K";
        boolean eliminado = cursoPOO.eliminarAlumno(mat_a_eliminar);
        System.out.println("Intento de eliminar alumno con matrícula " + mat_a_eliminar + ": "
                + (eliminado ? "ÉXITO" : "FRACASO"));

        System.out.println("\n--- 9. Curso Después de Eliminar ---");
        System.out.println(cursoPOO);

        System.out.println("--- FIN DE PRUEBAS ---");
    }
}