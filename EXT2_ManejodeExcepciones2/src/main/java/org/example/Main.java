package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       LeerArchivo lectura=new LeerArchivo();

        try{
            lectura.metodouno(("datos.txt"));
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}