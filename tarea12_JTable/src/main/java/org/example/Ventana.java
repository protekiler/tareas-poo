package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel LBlID;
    private JLabel LBlnombre;
    private JLabel LBlGenero;
    private JLabel LBlpeso;
    private JLabel LBlplataforma;
    private JLabel LBldesarrollador;
    private JTextField txtid;
    private JTextField txtnombre;
    private JTextField txtgenero;
    private JTextField txtpeso;
    private JTextField txtplataforma;
    private JTextField txtdesarrollador;
    private JButton btnagregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaVideojuego modelo;
    private ArrayList<VideoJuego>info;
    //el scroll se refiere a la barra.
    private JScrollPane scroll;
    private JTable tblTabla;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500,700);
        layout=new GridLayout(2,1);
        this.setLayout(layout);
        this.setVisible(true);
        //PANEL1
        panel1=new JPanel(new FlowLayout());
        panel1.setBackground(new Color(9, 195, 220));
        LBlID =new JLabel("id");
        txtid=new JTextField(4);
        panel1.add(LBlID);
        panel1.add(txtid);

        LBlnombre =new JLabel("NOMBRE");
        txtnombre=new JTextField(30);
        panel1.add(LBlnombre);
        panel1.add(txtnombre);

        LBlGenero =new JLabel("GENERO");
        txtgenero=new JTextField(15);
        panel1.add(LBlGenero);
        panel1.add(txtgenero);

        LBlpeso =new JLabel("peso");
        txtpeso=new JTextField(5);
        panel1.add(LBlpeso);
        panel1.add(txtpeso);

        LBlplataforma =new JLabel("plataforma");
        txtplataforma=new JTextField(15);
        panel1.add(LBlplataforma);
        panel1.add(txtplataforma);

        LBldesarrollador =new JLabel("desarrollador");
        txtdesarrollador=new JTextField(15);
        panel1.add(LBldesarrollador);
        panel1.add(txtdesarrollador);
        //PANEL2

        panel2=new JPanel(new FlowLayout());
        panel2.setBackground(new Color(124, 250, 97));
        info=new ArrayList<>();
        info.add(new VideoJuego(1,"League of Legends","MOBA",4.5,"WINDOWS Y MAC","RIOT GAMES"));
        modelo=new ModeloTablaVideojuego(info);
        tblTabla=new JTable(modelo);
        scroll=new JScrollPane(tblTabla);
        panel2.add(scroll);

        btnagregar=new JButton("agregar juego");
        panel1.add(btnagregar);

        //vista en el contenedor de los paneles y visuazliacion de ventanas
        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.btnagregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VideoJuego nuevo=new VideoJuego();
                nuevo.setId(Integer.parseInt(txtid.getText()));
                nuevo.setNombre(txtnombre.getText());
                nuevo.setGenero(txtgenero.getText());
                nuevo.setPesoGB(Double.parseDouble(txtpeso.getText()));
                nuevo.setPlataforma(txtplataforma.getText());
                nuevo.setDesarrollador(txtdesarrollador.getText());
                //info.add(nuevo);
                modelo.agregarjuego(nuevo);
                tblTabla.updateUI();
            }
        });
        this.setVisible(true);

    }
}
