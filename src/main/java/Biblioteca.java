import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a una biblioteca y los libros contenidos en ella.
 * Permite agregar, eliminar y buscar libros por título y por autor.

 * @see Libro
 * @author Pablo Terán Rueda
 * @version 6.3.2025
 */

public class Biblioteca {

    /**
     * Lista de libros disponibles en la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Constructor por defecto de Biblioteca.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor de Biblioteca con parámetros.
     * @param libros Lista de libros con los que inicializar la biblioteca.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }


    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }


    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Busca los libros que existen en la biblioteca
     *
     * @return Lista de libros contenidos en la biblioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro cuyo título coincide con el que se pase como argumento.
     *
     * @param titulo Título del libro que se quiere encontrar.
     * @return Objeto libro que coincida con la búsqueda
     * o {@code null} si no se encuentra un libro con el título solicitado.
     */

    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca un libro cuyo autor coincida con el que se pase como argumento.
     *
     * @deprecated Este metodo ha quedado obsoleto.
     * Se recomienda usar {@link #encuentraLibrosPorAutor(String)}
     *
     * @param autor Nombre del autor del libro.
     * @return Objeto libro que coincida con la búsqueda
      * o {@code null} si no se encuentra un libro con el autor solicitado.
     */

    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca un libro cuyo autor coincida con el que se pase como argumento.
     *
     * @since V2.0.
     * Sustituye al metodo {@link #encuentaLibroPorAutor(String)}
     *
     * @param autor Nombre del autor del libro.
     * @return una lista de libros que coincida con la búsqueda
     * o {@code null} si no se encuentran libros con el autor solicitado.
     */
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
