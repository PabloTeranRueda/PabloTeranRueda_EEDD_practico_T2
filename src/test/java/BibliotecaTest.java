import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
        Libro libro = new Libro("Quijote","Cervantes",1605);
    }

    @Test
    void agregarLibro() {
        biblioteca.agregarLibro(libro);

        assertNotNull(biblioteca.getLibros());
        assertTrue(biblioteca.getLibros().contains(libro));
    }

    @Test
    void eliminarLibro() {
        Libro newLibro = new Libro("miLibro","Pablo Teran",2005);

        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(newLibro);
        biblioteca.eliminarLibro(newLibro);

        assertFalse(biblioteca.getLibros().contains(newLibro));
        assertTrue(biblioteca.getLibros().contains(libro));
    }

    @Test
    void encuentraLibroPorTitulo() {
        Libro anotherLibro = new Libro("miOtroLibro","Pablo Teran",2010);

        biblioteca.agregarLibro(anotherLibro);

        assertEquals("miOtroLibro",biblioteca.encuentraLibroPorTitulo("miOtroLibro").getTitulo());
        assertNull(biblioteca.encuentraLibroPorTitulo("Pedazo de Libro"));
    }

    @Test
    void encuentraLibrosPorAutor() {
        Libro libro = new Libro("Quijote","Cervantes",1605);
        Libro newLibro = new Libro("miLibro","Pablo Teran",2005);
        Libro anotherLibro = new Libro("miOtroLibro","Pablo Teran",2010);

        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(newLibro);
        biblioteca.agregarLibro(anotherLibro);

        assertEquals(2,biblioteca.encuentraLibrosPorAutor("Pablo Teran").size(),
                "Debería haber dos libros con Pablo Teran como autor.");

        assertNull(biblioteca.encuentraLibrosPorAutor("Rodrigo Perez"));


    }
}