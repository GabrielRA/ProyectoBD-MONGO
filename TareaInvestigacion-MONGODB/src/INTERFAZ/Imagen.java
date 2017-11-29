/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFAZ;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author M Express
 */

public class Imagen extends javax.swing.JPanel {
    String ruta;
    public Imagen(String dir) {
        this.ruta = dir;
        this.setSize(110, 150);//se selecciona el tamaño del panel
    }

    //Se crea un método cuyo parámetro debe ser un objeto Graphics

    public void paint(Graphics grafico) {
        Dimension height = getSize();

        //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa

        ImageIcon Img = new ImageIcon(getClass().getResource(ruta)); //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel

        grafico.drawImage(Img.getImage(), 0, 0, Img.getIconWidth(), Img.getIconHeight(), null);

        setOpaque(false);
        super.paintComponent(grafico);
    }
}