
package Interfaz.Administrador;

import main.ClassCollector;
import modelos.*;
import estructuras.*;
import static java.lang.Math.round;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionarHorario extends javax.swing.JFrame {

    ClassCollector principal;
    int contadorBus;
    int idBus;
    String salidaTXT;

    public GestionarHorario(ClassCollector A) {
        initComponents();
        principal = A;
        mostrar();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Registro de horarios");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHorario = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        ChoraS = new javax.swing.JTextField();
        ChoraL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Chofer", "Id Bus", "Id Ruta", "Ruta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaHorarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaHorario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 550, 120));

        jLabel8.setText("Seleccionar Bus");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        ChoraS.setText(" ");
        ChoraS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoraSActionPerformed(evt);
            }
        });
        getContentPane().add(ChoraS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 70, -1));

        ChoraL.setEditable(false);
        ChoraL.setText(" ");
        getContentPane().add(ChoraL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 80, -1));

        jLabel9.setText("Hora de salida");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel10.setText("Hora de llegada");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jLabel1.setText("Registrar Horario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void limpiar() {
        for (int i = 0; i < 30; i++) {
            tablaHorario.getModel().setValueAt(" ", i, 0);
            tablaHorario.getModel().setValueAt(" ", i, 1);
            tablaHorario.getModel().setValueAt(" ", i, 2);
            tablaHorario.getModel().setValueAt(" ", i, 3);
        }
    }

    private void mostrar() {
        limpiar();
        principal.listaBuses.mostrarLista();
        contadorBus = 0;
        for (Bus b : principal.listaBuses) {
            if (b.getChofer() != null) {
                tablaHorario.getModel().setValueAt(b.getChofer().getDniChofer(), contadorBus, 0);
                tablaHorario.getModel().setValueAt(b.getIdBus(), contadorBus, 1);
                tablaHorario.getModel().setValueAt(b.getRuta().getIdRuta(), contadorBus, 2);
                tablaHorario.getModel().setValueAt(b.getRuta().mostrarCiudadesRuta(), contadorBus, 3);
                contadorBus++;
            }
        }
    }

    private String calcularTiempo(int distancia) {  
        int minutos = round(distancia % 60);
        int hora = round(distancia / 60);
        return hora + ":" + minutos;
    }

    private String sumarTiempo(int distancia, String tiempo) {
        String t = tiempo.replace(" ", "");
        String[] cadenaHora = calcularTiempo(distancia).split(":");
        String[] cadenaMinuto = t.split(":");

        int hora = Integer.parseInt(cadenaHora[0]) + Integer.parseInt(cadenaMinuto[0]);
        int minuto = Integer.parseInt(cadenaHora[1]) + Integer.parseInt(cadenaMinuto[1]);
        if (minuto > 59) {
            hora = hora + round(minuto % 60);
            minuto = round(minuto / 60);
        }
        return hora + ":" + minuto;
    }


    private void ChoraSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoraSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoraSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (salidaTXT != null && !ChoraS.getText().trim().isEmpty()) {
            Bus busTemporal = principal.listaBuses.ObetenerPorIndiceObjeto(idBus - 1);
            
            System.out.println(busTemporal.getIdBus());
            Horario h = new Horario(ChoraS.getText());
            busTemporal.setHorario(h);
            
            System.out.println(busTemporal.getHorario().getHoraSalida()); 
            
            ChoraL.setText(sumarTiempo((int) busTemporal.getRuta().getDistanciaRuta(), ChoraS.getText()));
            busTemporal.getHorario().setHoraLlegada(ChoraL.getText());
            JOptionPane.showMessageDialog(null, "EXITO ", "Se ha calculado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado nada", "No se puede realizaar registro", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHorarioMouseClicked
        // TODO add your handling code here:
        int fila = tablaHorario.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tablaHorario.getModel();
        if (fila > contadorBus - 1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada", "Casilla vacia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            salidaTXT = String.valueOf(modelo.getValueAt(fila, 0));
            idBus = (int) modelo.getValueAt(fila, 1);
        }
    }//GEN-LAST:event_tablaHorarioMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        PanelDeControl UU = new PanelDeControl(principal);
        this.setVisible(false);
        UU.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ChoraL;
    private javax.swing.JTextField ChoraS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaHorario;
    // End of variables declaration//GEN-END:variables
}
