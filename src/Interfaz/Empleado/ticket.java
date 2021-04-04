/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Empleado;

import estructuras.Cola;
import java.awt.Dimension;
import main.ClassCollector;
import modelos.Bus;
import modelos.Pasajero;

public class ticket extends javax.swing.JFrame {

    int dni;
    Bus bus;
    ClassCollector principal;

    public ticket(int documento, Bus b, ClassCollector A) {
        initComponents();
        principal = A;
        dni = documento;
        bus = b;
        busquedaPasajero();
        this.setSize(new Dimension(470, 522));
        this.setMinimumSize(new Dimension(470, 522));
        this.setLocationRelativeTo(null);
    }

    public void busquedaPasajero() {
        Cola<Pasajero> a = bus.getColaPasajero();

        for (Pasajero p : a) {
            if (p.getIdPasajero() == dni) {
                CCosto.setText("" + bus.getRuta().getPrecio());
                CAsiento.setText("" + p.getAsiento());
                CDNI.setText("" + dni);
                CDescripccion.setText(p.getDescripcionPaquetes());
                CDestino.setText(p.getLugarDestino());
                CEquipaje.setText(p.isPaquetes() ? "Si" : "No");
                CNombresyAp.setText(p.getNombre());
                CNumeroTicket.setText("" + 1015874);
                CSalida.setText(bus.getRuta().getSalida());
                Cmatricula.setText("" + bus.getMatricula());
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CNumeroTicket = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CEquipaje = new javax.swing.JTextField();
        CAsiento = new javax.swing.JTextField();
        CNombresyAp = new javax.swing.JTextField();
        CSalida = new javax.swing.JTextField();
        CDestino = new javax.swing.JTextField();
        CNombresyAp4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CDescripccion = new javax.swing.JTextArea();
        BtnImprimir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CDNI = new javax.swing.JTextField();
        CCosto = new javax.swing.JTextField();
        Cmatricula = new javax.swing.JTextField();

        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("TICKET Nº");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 130, 50));

        jLabel2.setText("Matricula del bus:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setText("Asiento Nº:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setText("Nombres y apellidos:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setText("Destino:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setText("Salida:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        CNumeroTicket.setEditable(false);
        CNumeroTicket.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CNumeroTicket.setText("00012323");
        CNumeroTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNumeroTicketActionPerformed(evt);
            }
        });
        jPanel2.add(CNumeroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 230, -1));

        jLabel7.setText("Importe(S/):");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel8.setText("Equipaje:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel9.setText("Descripccion:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        CEquipaje.setEditable(false);
        CEquipaje.setText("Si");
        CEquipaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEquipajeActionPerformed(evt);
            }
        });
        jPanel2.add(CEquipaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 230, -1));

        CAsiento.setEditable(false);
        CAsiento.setText("75465210");
        CAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAsientoActionPerformed(evt);
            }
        });
        jPanel2.add(CAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 230, -1));

        CNombresyAp.setEditable(false);
        CNombresyAp.setText("Nestor Soto");
        jPanel2.add(CNombresyAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 230, -1));

        CSalida.setEditable(false);
        CSalida.setText("casa");
        jPanel2.add(CSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 230, -1));

        CDestino.setEditable(false);
        CDestino.setText("UNMSM");
        jPanel2.add(CDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 230, -1));

        CNombresyAp4.setEditable(false);
        jPanel2.add(CNombresyAp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 230, -1));

        CDescripccion.setEditable(false);
        CDescripccion.setColumns(20);
        CDescripccion.setRows(5);
        CDescripccion.setText("esto es temporal");
        jScrollPane1.setViewportView(CDescripccion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 400, 100));

        BtnImprimir.setText("Imprimir");
        BtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImprimirActionPerformed(evt);
            }
        });
        jPanel2.add(BtnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        jButton2.setText("Realizar nueva compra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        jLabel10.setText("DNI de cliente:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        CDNI.setEditable(false);
        CDNI.setText("75465210");
        CDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDNIActionPerformed(evt);
            }
        });
        jPanel2.add(CDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 230, -1));

        CCosto.setEditable(false);
        CCosto.setText("20");
        jPanel2.add(CCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 230, -1));

        Cmatricula.setEditable(false);
        jPanel2.add(Cmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 230, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImprimirActionPerformed
        int numeroticket = Integer.parseInt(CNumeroTicket.getText());
        int dni = Integer.parseInt(CAsiento.getText());
        String nombres = CNombresyAp.getText();
        String salida = CSalida.getText();
        String llegada = CDestino.getText();
        int numeroAsiento = Integer.parseInt(CAsiento.getText());
        int importe = Integer.parseInt(CEquipaje.getText());
        String equipaje = CEquipaje.getText();
        String descripcion = CDescripccion.getText();
    }//GEN-LAST:event_BtnImprimirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Horarios h = new Horarios(principal);
        this.setVisible(false);
        h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CEquipajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEquipajeActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_CEquipajeActionPerformed

    private void CAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAsientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAsientoActionPerformed

    private void CDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CDNIActionPerformed

    private void CNumeroTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNumeroTicketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNumeroTicketActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnImprimir;
    private javax.swing.JTextField CAsiento;
    private javax.swing.JTextField CCosto;
    private javax.swing.JTextField CDNI;
    private javax.swing.JTextArea CDescripccion;
    private javax.swing.JTextField CDestino;
    private javax.swing.JTextField CEquipaje;
    private javax.swing.JTextField CNombresyAp;
    private javax.swing.JTextField CNombresyAp4;
    private javax.swing.JTextField CNumeroTicket;
    private javax.swing.JTextField CSalida;
    private javax.swing.JTextField Cmatricula;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
