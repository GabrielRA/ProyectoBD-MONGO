/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFAZ;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tareainvestigacion.mongodb.TareaInvestigacionMONGODB;

/**
 *
 * @author Marisol CH
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    DB db;
    DBCollection tabla;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        try {
            Mongo mongo  = new Mongo("localhost", 27017);
            db = mongo.getDB("practInvestigacion");
            tabla = db.getCollection("producto");
        } catch (UnknownHostException ex) {
            Logger.getLogger(TareaInvestigacionMONGODB.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_idProducto = new javax.swing.JTextField();
        text_Tipo = new javax.swing.JTextField();
        text_Precio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo_Mostrar = new javax.swing.JTextArea();
        boton_Insertar = new javax.swing.JButton();
        boton_Mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_TipoActionPerformed(evt);
            }
        });

        text_Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_PrecioActionPerformed(evt);
            }
        });

        campo_Mostrar.setColumns(20);
        campo_Mostrar.setRows(5);
        jScrollPane1.setViewportView(campo_Mostrar);

        boton_Insertar.setText("Insertar");
        boton_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_InsertarActionPerformed(evt);
            }
        });

        boton_Mostrar.setText("Mostrar");
        boton_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_MostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_Insertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_Mostrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(text_idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(text_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(text_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_Insertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(boton_Mostrar)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_TipoActionPerformed

    private void text_PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_PrecioActionPerformed

    private void boton_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_InsertarActionPerformed
        BasicDBObject document = new BasicDBObject();
        document.put("id_producto","'" + text_idProducto.getText() + "'");
        document.put("tipo","'" + text_Tipo.getText() + "'");
        document.put("precio","'" + text_Precio.getText() + "'");
        tabla.insert(document);
    // TODO add your handling code here:
    }//GEN-LAST:event_boton_InsertarActionPerformed

    private void boton_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_MostrarActionPerformed
        DBCursor cursor = tabla.find();
        while(cursor.hasNext()){
            campo_Mostrar.setText(campo_Mostrar.getText()+"\n"+cursor.next());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_MostrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Insertar;
    private javax.swing.JButton boton_Mostrar;
    private javax.swing.JTextArea campo_Mostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField text_Precio;
    private javax.swing.JTextField text_Tipo;
    private javax.swing.JTextField text_idProducto;
    // End of variables declaration//GEN-END:variables
}
