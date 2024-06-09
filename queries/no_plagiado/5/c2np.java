import java.util.ArrayList;
import java.util.List;

class MaterialBiblioteca {
    protected String titulo;
    protected String autor;

    public MaterialBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

class Libro extends MaterialBiblioteca {
    private String isbn;

    public Libro(String titulo, String autor, String isbn) {
        super(titulo, autor);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}

class Revista extends MaterialBiblioteca {
    private int numero;

    public Revista(String titulo, String autor, int numero) {
        super(titulo, autor);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}

class Biblioteca {
    private List<MaterialBiblioteca> materiales;

    public Biblioteca() {
        this.materiales = new ArrayList<>();
    }

    public void agregarMaterial(MaterialBiblioteca material) {
        materiales.add(material);
    }

    public void eliminarMaterial(String titulo) {
        materiales.removeIf(material -> material.getTitulo().equalsIgnoreCase(titulo));
    }

    public MaterialBiblioteca buscarMaterialPorTitulo(String titulo) {
        for (MaterialBiblioteca material : materiales) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        return null;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarMaterial(new Libro("1984", "George Orwell", "1234567890"));
        biblioteca.agregarMaterial(new Revista("National Geographic", "Varios", 202));

        MaterialBiblioteca material = biblioteca.buscarMaterialPorTitulo("1984");
        if (material != null) {
            System.out.println("Material encontrado: " + material.getTitulo() + " por " + material.getAutor());
        } else {
            System.out.println("Material no encontrado.");
        }

        biblioteca.eliminarMaterial("1984");
        System.out.println("Material eliminado.");
    }
}
