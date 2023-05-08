package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JButton boton1;
    private JLabel etiqueta1;


    private JPanel panel2;
    private JLabel etiqueta2;

    private JPanel panel3;
    private JComboBox<String> comboBox3;

    private JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout=new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //panel1
        panel1=new JPanel();
        this.getContentPane().add(panel1,0);
        panel1.setBackground(new Color(120, 254, 136));
        boton1=new JButton("presioname");
        panel1.add(boton1);
        etiqueta1=new JLabel("...");
        panel1.add(etiqueta1);
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta1.setText("presionaste el boton del panel 1");
            }
        });


        //panel2
        String URL="https://stayhipp.com/wp-content/uploads/2020/10/juan-horse-memes-.jpg";
        panel2=new JPanel();
        panel2.setBackground(new Color(254, 130, 120));

        panel2.setLayout(new FlowLayout());
        //imagen de internet cargada
        try {
            URL url=new URL(URL);
            Image imagen= ImageIO.read(url);
            ImageIcon imagenIcon= new ImageIcon(imagen);
            etiqueta2=new JLabel(imagenIcon);
            panel2.add(etiqueta2);
            this.getContentPane().add(panel2,1);

        }catch (MalformedURLException me){
            System.out.println("URL no valida");
        }catch (Exception e){
            System.out.println("imagen cargada");
        }





        //panel3
        panel3=new JPanel();
        panel3.setBackground(new Color(161, 120, 254));
        this.getContentPane().add(panel3,2);
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos= {"opcion1","opcion2","opcion3","opcion4"};
        comboBox3=new JComboBox<>(elementos);
        comboBox3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBox3.getSelectedIndex());

            }
        });
        panel3.add(comboBox3);
        this.getContentPane().add(panel3,2);





        //panel4
        panel4=new JPanel();
        this.getContentPane().add(panel4,3);
        panel4.setBackground(new Color(240, 254, 120 ));

        this.setVisible(true);

    }
}
