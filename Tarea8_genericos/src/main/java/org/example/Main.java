package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja<String> micaja=new Caja<>(new String[10]);
        micaja.add(0,"aguacate");

        micaja.add(3,"chilaquiles");
        System.out.println(micaja);

        System.out.println("----------");
        Cajasingenericos cajasin=new Cajasingenericos(new Object[10]);
        cajasin.add(1,"hola");
        cajasin.add(4,"si");
        System.out.println(cajasin);
        System.out.println("----comida---");
        Caja<comida> cajacomida=new Caja<>(new comida[10]);
        cajacomida.add(0,new comida("yogurth",true));
        System.out.println(cajacomida.get(0));
        System.out.println("---------");
        /*  la Arraylist es un tipo de paquete que puede modificarse para
        agregar o quitar cantidad de objetos, sin realizar modificaciones
        directas en el programa**/
        ArrayList<comida>comidas=new ArrayList<comida>();
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        comidas.add(new comida("zanahoria",false));
        // el .size nos permite identificar cuantos objetos tenemos en el paquete.
        System.out.println(comidas.size());
        ArrayList<comida>comidas2=new ArrayList<>();
        comidas2.add(new comida("manzana", false));
        comidas2.add(new comida("fresa", false));
        comidas2.add(new comida("bisteck", false));
        comidas2.add(new comida("danonino", true));
        comidas2.add(new comida("yogurth", true));

        System.out.println(comidas2.get(3));
        comidas2.set(3,new comida("papaya",false));
        comidas2.add(3,new comida("naranja",false));
        System.out.println("-----final------");
        for (comida comida: comidas2) {
            System.out.println(comida);

        }




    }
}