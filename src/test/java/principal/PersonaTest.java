package principal;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    public void testGetEdad() {
        Persona persona = new Persona(12345678, "Juan", 'M', 15, 4, 1990);
        assertEquals(34, persona.getEdad());
    }

    @Test
    public void testEquals() {
        Persona persona1 = new Persona(12345678, "Juan", 'M', 15, 4, 1990);
        Persona persona2 = new Persona(12345678, "Maria", 'F', 20, 5, 1995);
        assertTrue(persona1.equals(persona2));
    }
}