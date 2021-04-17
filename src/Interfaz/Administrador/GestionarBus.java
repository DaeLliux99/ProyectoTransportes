/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Administrador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.ClassCollector;
import modelos.Bus;
import modelos.Chofer;
import modelos.Ruta;

/**
 *
 * @author LEONARDO
 */
public class GestionarBus extends javax.swing.JFrame {

    ClassCollector principal;

    int dniChoferSelec;
    int idRutaSelec;
    int matriBusSelec;

    int contadorChofer;
    int contadorBus;
    int contadorRuta;

    public GestionarBus(ClassCollector A) {
        initComponents();
        principal = A;
        this.setLocationRelativeTo(null);
        mostrar();
        dniChoferSelec = -1;
        idRutaSelec = -1;
        matriBusSelec = -1;
    }

    private void mostrar() {
        contadorChofer = 0;
        limpiar();
        for (Chofer b : principal.listaChoferes) {
            if (b.isEstado()) {
                tablaChofer.getModel().setValueAt(b.getDniChofer(), contadorChofer, 0);
                tablaChofer.getModel().setValueAt(b.getNombre(), contadorChofer, 1);
                contadorChofer++;
            }
        }
        contadorBus = 0;
        for (Bus b : principal.listaBuses) {
            if (b.getChofer() == null) {
                tablaBuses.getModel().setValueAt(b.getMatricula(), contadorBus, 0);
                tablaBuses.getModel().setValueAt(b.getNumeroAsientos(), contadorBus, 1);
                contadorBus++;
            }
        }
        contadorRuta = 0;
        for (Ruta b : principal.listaRutas) {
            tablaRutas.getModel().setValueAt(b.getIdRuta(), contadorRuta, 0);
            tablaRutas.getModel().setValueAt(b.getPrecio(), contadorRuta, 1);
            tablaRutas.getModel().setValueAt(b.getRuta(), contadorRuta, 2);
            contadorRuta++;
        }
    }

    /*
    private void limpiar() {
        tablaChofer.removeAll();
        tablaBuses.removeAll();
        tablaRutas.removeAll();
    }*/
     
    private void limpiar() {
        for (int i = 0; i < 30; i++) {

            tablaBuses.getModel().setValueAt(" ", i, 0);
            tablaBuses.getModel().setValueAt(" ", i, 1);
            
            tablaChofer.getModel().setValueAt(" ", i, 0);
            tablaChofer.getModel().setValueAt(" ", i, 1);
            
            tablaRutas.getModel().setValueAt(" ", i, 0);
            tablaRutas.getModel().setValueAt(" ", i, 1);
            tablaRutas.getModel().setValueAt(" ", i, 2);   //

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRutas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaChofer = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBuses = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaRutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID ruta", "Precio", "Ruta"
            }
        ));
        tablaRutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRutasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaRutas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 420, 90));

        jLabel2.setText("Asignación de buses");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        tablaChofer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID chofer", "Nombre"
            }
        ));
        tablaChofer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaChoferMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaChofer);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 320, 90));

        tablaBuses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Matrícula", "# asientos"
            }
        ));
        tablaBuses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBusesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaBuses);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 250, 90));

        jLabel1.setText("Lista de choferes disponibles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setText("Lista de buses");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel4.setText("Lista de rutas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        botonSalir.setText("Atras");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 80, -1));

        jButton1.setText("Agregar Buses");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
        if (this.dniChoferSelec == -1 || this.idRutaSelec == -1 || this.matriBusSelec == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada", "No se encontro nada", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Chofer choferSelec = null;
        Bus busSelec = null;
        Ruta rutaSelec = null;
        for (Chofer c : principal.listaChoferes) {
            if (c.getDniChofer() == this.dniChoferSelec) {
                choferSelec = c;
                break;
            }
        }

        for (Ruta r : principal.listaRutas) {
            if (r.getIdRuta() == this.idRutaSelec) {
                rutaSelec = r;
                break;
            }
        }
        
        for (Bus b : principal.listaBuses) {
            if (b.getMatricula() == this.matriBusSelec) {
                busSelec = b;
                break;
            }
        }
        /* ESTO ES MIO
        busSelec.setIdChofer(choferSelec);
        busSelec.setRuta(rutaSelec);
        choferSelec.setEstado(false);
        mostrar();
        */

        //busSelec.setChofer(choferSelec);
        //busSelec.setRuta(rutaSelec);

        principal.listaBuses.BuscarXDato(busSelec).setChofer(choferSelec);
        principal.listaBuses.BuscarXDato(busSelec).setRuta(rutaSelec);

        //Bus nuevoBus = new Bus(1234, 20, 80, C, a1);
        
        
        principal.listaBuses.mostrarLista();

        limpiar();
        mostrar();

        JOptionPane.showMessageDialog(null, "BUS REGISTRADO", "BUS REGISTRADO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void tablaChoferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaChoferMouseClicked
        // TODO add your handling code here:
        int fila = tablaChofer.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tablaChofer.getModel();

        if (fila > contadorChofer - 1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada", "Casilla vacia", JOptionPane.INFORMATION_MESSAGE);
            dniChoferSelec = -1;
        } else {
            dniChoferSelec = (int) modelo.getValueAt(fila, 0);
        }
    }//GEN-LAST:event_tablaChoferMouseClicked

    private void tablaBusesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBusesMouseClicked
        // TODO add your handling code here:
        int fila = tablaBuses.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tablaBuses.getModel();

        if (fila > contadorBus - 1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada", "Casilla vacia", JOptionPane.INFORMATION_MESSAGE);
            matriBusSelec = -1;
        } else {
            matriBusSelec = (int) modelo.getValueAt(fila, 0);
        }
    }//GEN-LAST:event_tablaBusesMouseClicked

    private void tablaRutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRutasMouseClicked
        // TODO add your handling code here:
        int fila = tablaRutas.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tablaRutas.getModel();

        if (fila > contadorRuta - 1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada", "Casilla vacia", JOptionPane.INFORMATION_MESSAGE);
            idRutaSelec = -1;
        } else {
            idRutaSelec = (int) modelo.getValueAt(fila, 0);
        }
    }//GEN-LAST:event_tablaRutasMouseClicked

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        PanelDeControl UU = new PanelDeControl(principal);
        this.setVisible(false);
        UU.setVisible(true);
    }//GEN-LAST:event_botonSalirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaBuses;
    private javax.swing.JTable tablaChofer;
    private javax.swing.JTable tablaRutas;
    // End of variables declaration//GEN-END:variables
}
