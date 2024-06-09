import java.util.HashMap;
import java.util.Map;

class Libro {
    private String titulo;
    private String autor;
    private String ISBN;

    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }
}

class Biblioteca {
    private Map<String, Libro> libros;

    public Biblioteca() {
        this.libros = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        libros.put(libro.getISBN(), libro);
    }

    public void eliminarLibro(String ISBN) {
        libros.remove(ISBN);
    }

    public Libro buscarLibroPorISBN(String ISBN) {
        return libros.get(ISBN);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros.values()) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}

public class GestionBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro("1984", "George Orwell", "1234567890"));
        biblioteca.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel García Márquez", "0987654321"));

        Libro libro = biblioteca.buscarLibroPorTitulo("1984");
        if (libro != null) {
            System.out.println("Libro encontrado: " + libro.getTitulo() + " por " + libro.getAutor());
        } else {
            System.out.println("Libro no encontrado.");
        }

        biblioteca.eliminarLibro("1234567890");
        System.out.println("Libro eliminado.");
    }
}
