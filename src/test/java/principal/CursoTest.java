package principal;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    public void testAniadirAlumno() {
        Curso curso = new Curso("Matemáticas");
        Persona alumno1 = new Persona(12345678, "Juan", 'M', 15, 4, 1990);
        Persona alumno2 = new Persona(87654321, "Maria", 'F', 20, 5, 1995);
        curso.aniadirAlumno(alumno1);
        curso.aniadirAlumno(alumno2);
        assertEquals(2, curso.getListaAlumnos().size());
    }
}