package org.example;

import org.example.herenciamultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cuadrado cuadrado=new Cuadrado();

        cuadrado.setLado(5);

        System.out.println("cuadrado "+cuadrado.calcularArea());

        Circulo circulo=new Circulo();
        circulo.setRadio(2.4);
        System.out.println("circulo:"+circulo.calcularArea());
        AlumnoDeportistaArtista ada=new AlumnoDeportistaArtista();
        ada.setNombre("Juan");
        ada.setArte("pintura");
        ada.setDeporte("basket ball");
        System.out.println(ada);
        ada.ensayar("oleo");
        ada.entrenar();
        ada.presentarcompetencia("naucali");

    }


}