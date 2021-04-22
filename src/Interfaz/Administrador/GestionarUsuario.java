
package Interfaz.Administrador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.ClassCollector;
import modelos.*;

public class GestionarUsuario extends javax.swing.JFrame {

    ClassCollector principal;
    boolean rol;
    int contador;
    String usuarioEliminar;
    String cargoEliminar;

    public GestionarUsuario(ClassCollector A) {
        initComponents();
        principal = A;
        insertar();

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Gestor de usuarios");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cusuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBrol = new javax.swing.JComboBox<>();
        bRegistrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Ccontraseña = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        Beliminar = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gestionar usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        Cusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(Cusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 200, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Rol");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jPanel1.add(CBrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 200, -1));

        bRegistrar.setText("Registrar");
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(bRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));
        jPanel1.add(Ccontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 200, -1));

        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
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
                "USUARIO", "CONTRASEÑA", "ROL"
            }
        ));
        tablaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaUsuario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, 170));

        Beliminar.setText("Eliminar Usuario");
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Beliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void insertar() {
        Cusuario.setText("");
        Ccontraseña.setText("");
        CBrol.addItem("Aministrador");
        CBrol.addItem("Empleado");
        mostrar();
    }

    private void limpiar() {
        for (int i = 0; i < 30; i++) {
            tablaUsuario.getModel().setValueAt(" ", i, 0);
            tablaUsuario.getModel().setValueAt(" ", i, 1);
            tablaUsuario.getModel().setValueAt(" ", i, 2);
        }
    }

    private void mostrar() {
        contador = 0;
        limpiar();
        for (Usuario b : principal.listaUsuarios) {
            tablaUsuario.getModel().setValueAt(b.getUsername(), contador, 0);
            tablaUsuario.getModel().setValueAt(b.getPassword(), contador, 1);
            tablaUsuario.getModel().setValueAt(b.isManagent() ? "Administrador" : "Empleado", contador, 2);
            contador++;
        }
    }


    private void CusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CusuarioActionPerformed

    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed
        // TODO add your handling code here:
        if (Cusuario.getText().trim().isEmpty() || Ccontraseña.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR EN LAS CASILLA", "NO PUEDE HABER CASILLAS EN BLANCO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            boolean repetido = false;

            String rolUsuario = (String) CBrol.getSelectedItem();

            if (rolUsuario.equals("Aministrador")) {
                rol = true;
            } else if (rolUsuario.equals("Empleado")) {
                rol = false;
            }
            for (Usuario u : principal.listaUsuarios) {
                if (u.getUsername().equals(Cusuario.getText())) {
                    repetido = true;
                    break;
                }
            }
            if (repetido) {
                JOptionPane.showMessageDialog(null, "USUARIO REPETIDO ", "ERROR AL REGISTRAR", JOptionPane.INFORMATION_MESSAGE);
                Cusuario.setText("");
                Ccontraseña.setText("");
            } else {
                Usuario nuevoUsuario = new Usuario(Cusuario.getText(), Ccontraseña.getText(), rol);
                principal.listaUsuarios.insertarFinal(nuevoUsuario);

                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO", "USUARIO REGISTRADO", JOptionPane.INFORMATION_MESSAGE);
                Cusuario.setText("");
                Ccontraseña.setText("");
                principal.listaUsuarios.mostrarLista();
                mostrar();
            }
        }

    }//GEN-LAST:event_bRegistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PanelDeControl UU = new PanelDeControl(principal);
        this.setVisible(false);
        UU.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed
        // TODO add your handling code here:
        if (usuarioEliminar.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada", "seleccione por favor", JOptionPane.INFORMATION_MESSAGE);
        } else {

            Usuario usuarioE = null;
            for (Usuario u : principal.listaUsuarios) {
                if (u.getUsername().equals(usuarioEliminar)) {
                    usuarioE = u;
                    break;
                }
            }
            principal.listaUsuarios.eliminar(usuarioE);

            Cusuario.setText("");
            Ccontraseña.setText("");
            principal.listaUsuarios.mostrarLista();
            mostrar();
        }


    }//GEN-LAST:event_BeliminarActionPerformed

    private void tablaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuarioMouseClicked
        // TODO add your handling code here:
        int fila = tablaUsuario.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tablaUsuario.getModel();

        if (fila > contador - 1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada", "Casilla vacia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            usuarioEliminar = (String) modelo.getValueAt(fila, 0);
            cargoEliminar = (String) modelo.getValueAt(fila, 2);
        }
    }//GEN-LAST:event_tablaUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Beliminar;
    private javax.swing.JComboBox<String> CBrol;
    private javax.swing.JPasswordField Ccontraseña;
    private javax.swing.JTextField Cusuario;
    private javax.swing.JButton bRegistrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaUsuario;
    // End of variables declaration//GEN-END:variables
}
