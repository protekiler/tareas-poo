package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LibroDAO ldao=new LibroDAO();
        try {
            LIBRO res=(LIBRO) ldao.buscarPorId("1");
            System.out.println(res);
            System.out.println("____________");
            for (Object LIB: ldao.obtenerTodo()){
                System.out.println((LIBRO)LIB);
            }

        }catch (SQLException sqle){
            System.out.println("error al eliminar");
            System.out.println(sqle.getMessage());
        }


    }
}