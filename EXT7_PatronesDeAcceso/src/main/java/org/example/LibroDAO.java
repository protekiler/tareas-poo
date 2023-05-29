package org.example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LibroDAO implements InterfazDAO {
    public LibroDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        int rowCount = 0;
        String sqlInsert = "INSERT INTO libros(titulo,autor) VALUES(?,?)";
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("libros.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, ((LIBRO) obj).getTITULO());
            pstm.setString(2, ((LIBRO) obj).getAutor());
            rowCount = pstm.executeUpdate();
            System.out.println("se inserto " + rowCount + " registros");
        } catch (SQLException sqle) {
            System.out.println("error prepared statement" + sqle.getMessage());
        }
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        int rowCount = 0;
        String sqlUPDATE = "UPDATE libros SET titulo=?,autor=? WHERE id=?;";
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("libros.db").getConnection().prepareStatement(sqlUPDATE);
            pstm.setString(1, ((LIBRO) obj).getTITULO());
            pstm.setString(2, ((LIBRO) obj).getAutor());
            pstm.setInt(3, ((LIBRO) obj).getId());
            rowCount = pstm.executeUpdate();
            System.out.println("se inserto " + rowCount + " registros");
        } catch (SQLException sqle) {
            System.out.println("error prepared statement" + sqle.getMessage());
        }
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM libros WHERE id=?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("libros.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql="SELECT *FROM libros";
        ArrayList<LIBRO>resultado=new ArrayList<>();

            Statement stm=ConexionSingleton.getInstance("libros.db").getConnection().createStatement();
            ResultSet rst=stm.executeQuery(sql);
            while (rst.next()){
                resultado.add(new LIBRO(rst.getInt(1), rst.getString(2),rst.getString(3 )));
            }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT *FROM libros WHERE id=?;";
        LIBRO libro = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("libros.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            libro = new LIBRO(rst.getInt(1), rst.getString(2), rst.getString(3));

            return libro;
        }
        return null;
    }
}
