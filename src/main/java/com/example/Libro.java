package com.example;

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;

    // Constructor vacío
    public Libro() {
        titulo = "Desconocido";
        autor = "Anónimo";
        paginas = 0;
    }

    // Constructor con título y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 0;
    }

    // Constructor completo
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Método para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }
}
