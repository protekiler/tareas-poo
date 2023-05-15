package org.example;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaVideojuego implements TableModel {
    public static final int COLS=6;
    ArrayList<VideoJuego>datos;

    public ModeloTablaVideojuego(ArrayList<VideoJuego>datos){

        this.datos=datos;

    }
//cantidad de filas de la tabla,sin embargo la tabla tendra diversas modificaciones entorno a el numero de datos
    @Override
    public int getRowCount() {
        return datos.size();
    }
//En este caso en particular el numero de columnas sera seis, debido a la info que se colocara
    @Override
    public int getColumnCount() {
        return COLS;
    }
//colocar los datos de la primera fila y las distintas columnas, entorno al valor de entrada de cada una;
    @Override
    public String getColumnName(int columnIndex) {
        String columName="";
        switch (columnIndex){
            case 0:
                columName="id";
                break;
            case 1:
                columName="Nombre";
                break;
            case 2:
                columName="Genero";
                break;
            case 3:
                columName="Peso en GB";
                break;
            case 4:
                columName="Plataforma";
                break;
            case 5:
                columName="Desarrollador";
                break;
        }
        return columName;
    }
// aqui funciona de forma similar al anterior, pero nos pregunta que tipo de dato acepta
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }
//pregunta si alguna celda es de tipo editable
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
//nos permite identifica que tipo de datos ahi en esa localidad y mostrarlo en ventana
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //recordemos que "row" hace referencia a fila y "column" a columna
        VideoJuego tmp=datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getGenero();
            case 3:
                return tmp.getPesoGB();
            case 4:
                return tmp.getPlataforma();
            case 5:
                return tmp.getDesarrollador();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void agregarjuego(VideoJuego juego){
        this.datos.add(juego);
    }
}
