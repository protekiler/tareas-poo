package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ventanagridlayout extends Frame {
    private Label lbletiqueta1;
    private Label lbletiqueta2;
    private TextField txtcuadro1;
    private TextField txtcuadro2;
    private Button boton;
    private GridLayout layout;

    public ventanagridlayout(String title) throws HeadlessException {
        super(title);
        layout=new GridLayout(3,2);
        this.setLayout(layout);
        lbletiqueta1=new Label("Etiqueta1");
        this.add(lbletiqueta1,0);
        txtcuadro1=new TextField(30);
        this.add(txtcuadro1,1);


        lbletiqueta2=new Label("Etiqueta2");
        this.add(lbletiqueta2,2);
        txtcuadro2=new TextField(30);
        this.add(txtcuadro2,3);

        boton=new Button("presioname");
        this.add(boton,4);
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String texto=txtcuadro1.getText()+" "+txtcuadro2.getText();
                JOptionPane.showMessageDialog(null,texto);

            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setSize(800,600);
        this.setVisible(true);
    }
}
