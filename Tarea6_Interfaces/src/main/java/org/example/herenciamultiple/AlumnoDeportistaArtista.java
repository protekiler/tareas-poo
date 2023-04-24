package org.example.herenciamultiple;

public class AlumnoDeportistaArtista extends alumno implements Deportista,artista{
    private int idActivExtra;
    private String Deporte;
    private String Arte;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(String nombre, String edad, int numcuenta, String carrera, double promedio, int idActivExtra, String deporte, String arte) {
        super(nombre, edad, numcuenta, carrera, promedio);
        this.idActivExtra = idActivExtra;
        Deporte = deporte;
        Arte = arte;
    }

    public int getIdActivExtra() {
        return idActivExtra;
    }

    public void setIdActivExtra(int idActivExtra) {
        this.idActivExtra = idActivExtra;
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String deporte) {
        Deporte = deporte;
    }

    public String getArte() {
        return Arte;
    }

    public void setArte(String arte) {
        Arte = arte;
    }

    @Override
    public String toString() {
        return super.toString()+
                "AlumnoDeportistaArtista{" +
                "idActivExtra=" + idActivExtra +
                ", Deporte='" + Deporte + '\'' +
                ", Arte='" + Arte + '\'' +
                '}';
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre()+" entreno el deporte "+Deporte);
        return 2;
    }

    @Override
    public boolean presentarcompetencia(String ubicacion) {
        System.out.println(getNombre()+"Esta en competencia del deporte ");

        return true;
    }

    @Override
    public int ensayar(String Disciplina) {
        System.out.println("El alumno esta ensayando "+ this.Arte );
        return 0;
    }

    @Override
    public boolean presentarobra() {
        System.out.println(getNombre()+ "Esta presentando su obra...");
        return true;
    }
}
