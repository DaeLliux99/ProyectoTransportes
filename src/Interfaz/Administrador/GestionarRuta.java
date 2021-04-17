/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Administrador;

import main.ClassCollector;
import modelos.*;
import estructuras.*;

/**
 *
 * @author LEONARDO
 */
public class GestionarRuta extends javax.swing.JFrame {

    ClassCollector principal;
    Lista<Ciudad> listaTemporal = new Lista<>();
    String ciudadBuscada = "";

    public GestionarRuta(ClassCollector A) {
        initComponents();
        principal = A;
        insertar();
        this.setLocationRelativeTo(null);
    }

    public void insertar() {
        limpiarCB();
        for (Ciudad C : principal.reg.obtenerCiudades()) {
            CBRuta1.addItem(C.getCiudad());
        }
    }

    public void insertarAdya(Ciudad ciudad) {
        limpiarCB();
        for (Ciudad C : principal.reg.obtenerCiudadesAdya(ciudad)) {
            CBRuta1.addItem(C.getCiudad());
        }
    }

    void limpiarCB() {
        CBRuta1.removeAllItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CBRuta1 = new javax.swing.JComboBox<>();
        CListaCiudad = new javax.swing.JTextField();
        CCiudadSeleccionada = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BAgregarCiudad = new javax.swing.JButton();
        BElminarCiudadRuta = new javax.swing.JButton();
        botonRegistrarRuta = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CBRuta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBRuta1ActionPerformed(evt);
            }
        });
        getContentPane().add(CBRuta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));
        getContentPane().add(CListaCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 490, -1));

        CCiudadSeleccionada.setEditable(false);
        getContentPane().add(CCiudadSeleccionada, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 70, -1));

        jLabel1.setText("Ciudad seleccionada");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel2.setText("Ruta de ciudades");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        BAgregarCiudad.setText("Agregar ciudad");
        BAgregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(BAgregarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        BElminarCiudadRuta.setText("Eliminar ultima ciudad");
        BElminarCiudadRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BElminarCiudadRutaActionPerformed(evt);
            }
        });
        getContentPane().add(BElminarCiudadRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        botonRegistrarRuta.setText("Registrar ruta");
        botonRegistrarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarRutaActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistrarRutaActionPerformed

    private void CBRuta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBRuta1ActionPerformed

        CCiudadSeleccionada.setText((String) CBRuta1.getSelectedItem());
        ciudadBuscada = CCiudadSeleccionada.getText();
    }//GEN-LAST:event_CBRuta1ActionPerformed

    private void BAgregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarCiudadActionPerformed
        // TODO add your handling code here:

        CListaCiudad.setText(CListaCiudad.getText() + "-" + CCiudadSeleccionada.getText());
        
        for (Ciudad d : principal.reg.obtenerCiudades()) {
            if (d.getCiudad().equals(CCiudadSeleccionada.getText())) {
                listaTemporal.insertarFinal(d);
                break;
            }
        }
        
        for (Ciudad C : principal.reg.obtenerCiudades()) {
            if (C.getCiudad().equals(ciudadBuscada)) {
                insertarAdya(C);
                break;
            }
        }
        
    }//GEN-LAST:event_BAgregarCiudadActionPerformed

    private void BElminarCiudadRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BElminarCiudadRutaActionPerformed
        // TODO add your handling code here:
        listaTemporal.eliminarUltimo();
        Ciudad ultimaCiudad = listaTemporal.obetenerUltimoObjeto();
        if (ultimaCiudad != null) {
            insertarAdya(ultimaCiudad);
        } else {
            insertar();
        }
        String temporal = "";
        for (Ciudad c : listaTemporal) {
            temporal = temporal + c.toString();
        }
        CListaCiudad.setText(temporal);
        
        /*
        principal.reg.obtenerCiudades().eliminar(principal.reg.obtenerCiudades().obetenerUltimoObjeto());
        String[] arregloDeLuis = CListaCiudad.getText().split("-");
        String temporal = "";
        for (int i = 0; i < arregloDeLuis.length - 1; i++) {
            System.out.println("luis KBRO");
            if (i == 0) {
                temporal = arregloDeLuis[i];
            } else {
                temporal = temporal + "-" + arregloDeLuis[i];
            }
        }
        CListaCiudad.setText(temporal);
        */
    }//GEN-LAST:event_BElminarCiudadRutaActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        PanelDeControl UU = new PanelDeControl(principal);
        this.setVisible(false);
        UU.setVisible(true);
    }//GEN-LAST:event_botonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregarCiudad;
    private javax.swing.JButton BElminarCiudadRuta;
    private javax.swing.JComboBox<String> CBRuta1;
    private javax.swing.JTextField CCiudadSeleccionada;
    private javax.swing.JTextField CListaCiudad;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrarRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
