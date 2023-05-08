package org.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class panel extends JFrame {
    private JTextField txtGrados;
    private JLabel etiqueta1;
    private JButton boton;
    private FlowLayout layout;
    private JLabel lblresultado;

    public panel(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout=new FlowLayout();
        this.getContentPane().setLayout(layout);
        etiqueta1=new JLabel("Grados c");
        this.getContentPane().add(etiqueta1);
        txtGrados=new JTextField(10);
        this.getContentPane().add(txtGrados);
        boton=new JButton("convertir");
        this.getContentPane().add(boton);
        this.lblresultado=new JLabel("0.0 FARENHEIT");
        this.getContentPane().add(lblresultado);
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double centigrados=Double.parseDouble(txtGrados.getText());
                double farenheid=(centigrados*9.0/5.0)+32;
                lblresultado.setText(farenheid+"F");
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null,"ADIOS...");
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}
