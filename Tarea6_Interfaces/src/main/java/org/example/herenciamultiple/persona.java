package org.example.herenciamultiple;

public class persona {
    private String nombre;
    private String edad;

    public persona() {
    }

    public persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
    public void caminar(){
        System.out.println("caminando...");
    }
    public void dormir(){
        System.out.println("durmiendo...");

    }
}
