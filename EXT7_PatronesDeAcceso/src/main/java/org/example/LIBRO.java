package org.example;

public class LIBRO {
    private int id;
    private String TITULO;
    private String autor;

    public LIBRO() {
    }

    public LIBRO(int id, String TITULO, String autor) {
        this.id = id;
        this.TITULO = TITULO;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTITULO() {
        return TITULO;
    }

    public void setTITULO(String TITULO) {
        this.TITULO = TITULO;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "LIBRO{" +
                "id=" + id +
                ", TITULO='" + TITULO + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
