package org.example.interfasdeusuario;

import org.example.interfasdeusuario.EVENTOS.EventosRaton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLOutput;

public class principal extends Frame {
    private Label lblNombre;
    private TextField txtNombre;
    private Button btnBoton1;

    public principal(String title) throws HeadlessException {
        super(title);
        this.setLayout(new FlowLayout());
        lblNombre=new Label("Nombre");
        this.add(lblNombre);
        this.setVisible(true);
        this.setSize(800,600);
        txtNombre=new TextField(25);
        this.add(txtNombre);
        btnBoton1=new Button("Saludar");
        this.add(btnBoton1);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
       // btnBoton1.addMouseListener(new EventosRaton());
        //Con adaptadores
        btnBoton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(txtNombre.getText());
                JOptionPane.showMessageDialog(null,"Hola"+txtNombre.getText());
            }
        });
    }

}
