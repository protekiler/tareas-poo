package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Escaneo=new Scanner(System.in);


        try {
            int a=10;
            int b= Integer.parseInt(Escaneo.nextLine());
            System.out.println("Division: "+(a/b));
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir entre cero");
        }catch (NumberFormatException nfe){
            System.out.println("No capturaste el dato correctamente");
        }finally {
            System.out.println("Siempre se ejecuta");
        }
        System.out.println("Fin del programa");

    }
}