package org.example;

import java.util.Scanner;
public class Tarea3_JuegoGato {
    public static void main(String args[]) {
        Scanner lector=new Scanner(System.in);
        System.out.println("anota los caracateres ");

        String gato=lector.nextLine();

        char []datos=new char[gato.length()];
        int espacio=0;
        for(int i=0; i < gato.length();i++){
            datos[i]= gato.charAt(i);
            if (datos[i]!='o' && datos[i]!='x' && datos[i]!='_'){
                System.out.println("Ha introducido un caracter no valido: " + datos[i]);
                break;
            }
        }
        System.out.println("-----");
        for(int e=1; e <= 3;e++){
            System.out.println("|"+ datos[espacio] + datos[espacio+1] + datos[espacio+2] + "|");
            espacio+=3;
        }
        System.out.println("-----");
    }
}

