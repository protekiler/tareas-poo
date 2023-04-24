package org.example.herenciamultiple;

public class alumno extends persona{
    private int numcuenta;
    private String carrera;
    private double promedio;

    public alumno() {
    }

    public alumno(int numcuenta, String carrera, double promedio) {
        this.numcuenta = numcuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public alumno(String nombre, String edad, int numcuenta, String carrera, double promedio) {
        super(nombre, edad);
        this.numcuenta = numcuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "alumno{" +
                "numcuenta=" + numcuenta +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
