package org.example;

import java.sql.*;

public class DemoConexionSQLite {
    public static void main(String[] args) {
        /*nos permite hacer una conexion directa con la base de datos
        y identificar cuales son sus componentes**/
        String Db_URL="jdbc:sqlite:libros.db";
        Connection conexion=null;

        try {
            Class.forName("org.sqlite.JDBC");
            conexion= DriverManager.getConnection(Db_URL);
            Statement Stm=conexion.createStatement();
            ResultSet rst=Stm.executeQuery("SELECT*FROM libros;");
            while (rst.next()){
                System.out.println(rst.getString(1)+" "+rst.getString(2));
            }
            conexion.close();
        }catch (ClassNotFoundException cne){
            cne.printStackTrace();

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

    }
}
