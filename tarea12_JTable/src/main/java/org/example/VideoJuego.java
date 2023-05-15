package org.example;

public class VideoJuego {
    private int id;
    private String nombre;
    private String genero;
    private double PesoGB;
    private String Plataforma;
    private String Desarrollador;

    public VideoJuego() {
    }

    public VideoJuego(int id, String nombre, String genero, double pesoGB, String plataforma, String desarrollador) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        PesoGB = pesoGB;
        Plataforma = plataforma;
        Desarrollador = desarrollador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPesoGB() {
        return PesoGB;
    }

    public void setPesoGB(double pesoGB) {
        PesoGB = pesoGB;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String plataforma) {
        Plataforma = plataforma;
    }

    public String getDesarrollador() {
        return Desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        Desarrollador = desarrollador;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", PesoGB=" + PesoGB +
                ", Plataforma='" + Plataforma + '\'' +
                ", Desarrollador='" + Desarrollador + '\'' +
                '}';
    }
}
