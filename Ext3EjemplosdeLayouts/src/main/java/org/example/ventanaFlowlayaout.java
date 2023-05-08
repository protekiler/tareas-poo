package org.example;

import java.awt.*;

public class ventanaFlowlayaout extends Frame {
    private Label lbletiqueta1;
    private Label lbletiqueta2;
    private TextField txtcuadro1;
    private TextField txtcuadro2;
    private Button boton;
    private FlowLayout layout;

    public ventanaFlowlayaout(String title) throws HeadlessException {
        super(title);
        layout=new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        lbletiqueta1=new Label("Etiqueta1");
        this.add(lbletiqueta1);
        txtcuadro1=new TextField(30);
        this.add(txtcuadro1);

        lbletiqueta2=new Label("Etiqueta2");
        this.add(lbletiqueta2);
        txtcuadro2=new TextField(30);
        this.add(txtcuadro2);

        this.setSize(800,600);
        this.setVisible(true);

    }
}
