# Proyecto POO: Gestión de Alumnos y Cursos UFRO

## Descripción del Proyecto

Este proyecto consiste en la implementación de una solución computacional en **Java** para modelar la relación entre **Alumnos** y un **Curso** en el contexto de la Universidad de La Frontera (UFRO). El objetivo principal de la actividad es practicar y consolidar los principios fundamentales de la **Programación Orientada a Objetos (POO)**: clases, atributos, encapsulamiento, constructores, métodos *setter/getter*, y el uso de colecciones (`ArrayList`).

---

## Objetivos de la Actividad

El desarrollo se enfocó en tres versiones progresivas que cumplen con los siguientes requisitos:

| Versión | Clase(s) Implementada(s) | Conceptos Clave |
| :--- | :--- | :--- |
| **V1** | `Alumno.java` | Atributos, Encapsulamiento (`private`), Constructores (con y sin parámetros), Getters/Setters, Sobrescritura de `toString()`. |
| **V2** | `Curso.java` | Relación de Composición (Curso contiene Alumnos), Colecciones (`ArrayList`), Gestión de objetos (agregar/eliminar), Validación de pertenencia. |
| **V3** | `Main.java` y `Pruebas.java` | Instanciación de Objetos, Ejecución de métodos y Pruebas, Buenas prácticas (separación de la lógica de prueba). |

---

## Estructura del Repositorio

| Archivo | Propósito |
| :--- | :--- |
| `Alumno.java` | Clase base que modela a un estudiante (nombre, matrícula, edad, etc.). |
| `Curso.java` | Clase que representa un curso, conteniendo una colección de objetos `Alumno` para su gestión. |
| `Pruebas.java` | Contiene el método estático `ejecutarPruebas()` con toda la lógica de instanciación y prueba de los métodos de `Alumno` y `Curso`. |
| `Main.java` | Clase principal que solo contiene el método `main` para iniciar el programa llamando a `Pruebas.ejecutarPruebas()`. |

---

## Instrucciones de Ejecución

Para ejecutar este proyecto en **IntelliJ IDEA** o cualquier IDE de Java:

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/Victoria04510/Alumnos-y-Cursos.git](https://github.com/Victoria04510/Alumnos-y-Cursos.git)
    ```
2.  **Abrir el Proyecto:** Abrir la carpeta `Alumnos-y-Cursos` como un proyecto Java.
3.  **Compilar y Ejecutar:** Ejecutar la clase **`Main.java`**. Esta clase llamará automáticamente al método `ejecutarPruebas()` de la clase `Pruebas.java` para mostrar el funcionamiento de las clases `Alumno` y `Curso`.

---

## Historial de Versiones

El desarrollo del proyecto fue documentado mediante los siguientes *commits* principales:

* **Commit V1:** Implementación de la clase `Alumno.java`.
* **Commit V2:** Implementación de la clase `Curso.java` con lógica de gestión de `ArrayList`.
* **Commit V3:** Separación de la lógica de prueba en `Pruebas.java` y uso de `Main.java` como iniciador.
* **Commit Docs:** Adición del archivo `README.md`.
