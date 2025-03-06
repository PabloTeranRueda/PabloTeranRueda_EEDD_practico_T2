import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void creaLibro() {
        Libro libro = new Libro("miLibro","Pablo Teran",2005);

        assertNotNull(libro.getTitulo());
        assertNotNull(libro.getAutor());
        assertEquals(2005,libro.getAnioPublicacion(),"El año de publicación debería ser 2005");
    }

}