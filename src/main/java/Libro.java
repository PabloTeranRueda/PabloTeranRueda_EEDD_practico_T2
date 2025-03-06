/**
 * Clase que representa un libro que puede formar parte de una Biblioteca
 * y sus características o atributos (título, autor y año de publicación).
 * Permite obtener ({@code get()}) y establecer ({@code set()}) el título de libro, su autor y su año de publicación.

 * @see Biblioteca
 * @author Pablo Terán Rueda
 * @version 6.3.2025
 */

public class Libro {

    /**
     * Título del libro
     */
    private String titulo;
    /**
     * Autor del libro
     */
    private String autor;
    /**
     * Año de publicación del libro
     */
    private int anioPublicacion;


    /**
     * Constructor con parámetros de Libro.
     *
     * @param titulo Título del libro.
     * @param autor Autor del libro.
     * @param anioPublicacion Año de publicación del libro.
     */
    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Recoge el autor de un libro.
     *
     * @return Autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Recoge el año de publicación de un libro.
     *
     * @return año en que se ha publicado un libro.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
