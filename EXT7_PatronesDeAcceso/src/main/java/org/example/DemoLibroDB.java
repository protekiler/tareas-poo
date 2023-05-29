package org.example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DemoLibroDB {
    public DemoLibroDB() {
    }
    public void insertarStament(){
        String elTitulo="Arrancarme la vida";
        String elautor="angeles matreta";
        try {
            Statement stm=ConexionSingleton.getInstance("libros.db").getConnection().createStatement();
            String sqqInsert="INSERT INTO libros(titulo,autor) VALUES('"+elTitulo+"','"+elautor+"')";
            int rowCount=stm.executeUpdate(sqqInsert);
            System.out.println("Se insertaron"+rowCount+" registros");
        }catch (SQLException sqle){
            System.out.println("Error al conectar"+sqle.getMessage());
        }


    }
    public void insertarPreparedeStatement(){
        String elTitulo="el principito";
        String elautor="no se";
        String sqlInsert="INSERT INTO libros(titulo,autor) VALUES(?,?)";
        try {
            PreparedStatement pstm=ConexionSingleton.getInstance("libros.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1,elTitulo);
            pstm.setString(2,elautor);
            int rowCount=pstm.executeUpdate();
        }catch (SQLException sqle){
            System.out.println("error prepared statement"+sqle.getMessage());
        }

    }

    public boolean insertarLibro(LIBRO libro){
        int rowCount=0;
        String sqlInsert="INSERT INTO libros(titulo,autor) VALUES(?,?)";
        try {
            PreparedStatement pstm=ConexionSingleton.getInstance("libros.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1,libro.getTITULO());
            pstm.setString(2,libro.getAutor());
            rowCount=pstm.executeUpdate();
            System.out.println("se inserto "+rowCount+" registros");
        }catch (SQLException sqle){
            System.out.println("error prepared statement"+sqle.getMessage());
        }return rowCount>0;
    }
    public LIBRO buscarlibroporid(int id){
        String sql="SELECT *FROM libros WHERE id=?;";
        LIBRO libro=null;
        try {
            PreparedStatement pstm=ConexionSingleton.getInstance("libros.db").getConnection().prepareStatement(sql);
            pstm.setInt(1,id);
            ResultSet rst= pstm.executeQuery();
            if (rst.next()){
                libro=new LIBRO(rst.getInt(1), rst.getString(2),rst.getString(3 ));
            }
        }catch(SQLException sqle){
            System.out.println("error de busqueda");
        }return libro;
    }
    public ArrayList<LIBRO> obtenertodo(){
        String sql="SELECT *FROM libros";
        ArrayList<LIBRO>resultado=new ArrayList<>();
        try {
            Statement stm=ConexionSingleton.getInstance("libros.db").getConnection().createStatement();
            ResultSet rst=stm.executeQuery(sql);
            while (rst.next()){
                resultado.add(new LIBRO(rst.getInt(1), rst.getString(2),rst.getString(3 )));
            }
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }return resultado;

    }
}
