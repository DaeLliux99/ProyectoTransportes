package Interfaz.Empleado;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import main.ClassCollector;
import estructuras.*;
import modelos.*;
import nodos.Nodo;

/**
 *
 * @author T1000
 */
public class RegistroV2 extends javax.swing.JFrame {

    ClassCollector Principal;
    int ID_bus;

    public RegistroV2(String Salida, String llegada, int bus, ClassCollector A) {

        initComponents();
        Principal = A;
        ID_bus = bus;
        CSalida.setText(Salida);
        Cllegada.setText(llegada);
        llenar();
        sacar();
        setLocationRelativeTo(null);

    }

    public void limpiar() {
        Cdni.setText("");
        Cnombre.setText("");
        Cllegada.setText("");
        CSalida.setText("");
        //combo_tipodoc.setSelectedItem("Seleccionar Tipo Documento");

    }

    public Bus encontrarBus() {
        
        Nodo<Bus> temp = Principal.Lista_buses.ObetenerPrimerNodo();
        while (temp != null) {
            if (temp.valor.getMatricula() == ID_bus) {             
                return temp.getValor();
            }
            System.out.println(ID_bus);
            System.out.println(temp.valor.getMatricula());
            temp = temp.siguiente;
        }       
        return null;
    }
    
    public void llenar(){
        Bus busUsado =encontrarBus() ;
        for(int i=0; i<busUsado.getNumAsientos();i++){
            asiento.addItem(i+1);
        }
    }
    
    public void sacar(){
        Bus busUsado =encontrarBus() ;
        if(busUsado.getCola_Pasajero()==null){
            System.out.println("vacio");
        }else{
            Cola<Pasajero> a=busUsado.getCola_Pasajero();
            Pasajero b;
            for(int i=0; i<a.getLongitud(); i++){
                b=a.pop();
                asiento.removeItem(b.getAsiento());
                a.push(b);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regcliente = new javax.swing.JButton();
        cancelcli = new javax.swing.JButton();
        salirclijButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Cdni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cllegada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CSalida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoEquipaje = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        asiento = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regcliente.setText("Registrar");
        regcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regclienteActionPerformed(evt);
            }
        });
        getContentPane().add(regcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 358, 92, -1));

        cancelcli.setText("Cancelar");
        cancelcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelcliActionPerformed(evt);
            }
        });
        getContentPane().add(cancelcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 358, -1, -1));

        salirclijButton3.setText("Salir");
        salirclijButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirclijButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(salirclijButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 368, 0, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REGISTRAR PERSONAS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 500, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 358, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdniActionPerformed(evt);
            }
        });
        jPanel1.add(Cdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 142, -1));

        jLabel1.setText("Documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel5.setText("Nombres y apellidos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 28, -1, -1));

        Cnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnombreActionPerformed(evt);
            }
        });
        jPanel1.add(Cnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 250, -1));

        jLabel6.setText("Destino");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        Cllegada.setEditable(false);
        Cllegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CllegadaActionPerformed(evt);
            }
        });
        jPanel1.add(Cllegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 250, -1));

        jLabel7.setText("Salida");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        CSalida.setEditable(false);
        CSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSalidaActionPerformed(evt);
            }
        });
        jPanel1.add(CSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, -1));

        TextoEquipaje.setColumns(20);
        TextoEquipaje.setRows(5);
        jScrollPane1.setViewportView(TextoEquipaje);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 450, 110));

        jLabel2.setText("Descripción Equipaje");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jPanel1.add(asiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabel3.setText("Asiento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 500, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regclienteActionPerformed
        
        int dni = Integer.parseInt(Cdni.getText());
        boolean equipaje = false;

        if (TextoEquipaje != null) {
            equipaje = true;
        }
        Bus busUsado =encontrarBus() ;
        
        if(busUsado.getOcupado() < busUsado.getNumAsientos() && asiento.getSelectedItem()!=null){
            Pasajero p1 = new Pasajero(dni,Cnombre.getText(),Cllegada.getText(),equipaje,TextoEquipaje.getText(), (int)asiento.getSelectedItem());
            busUsado.getCola_Pasajero().push(p1);     
            busUsado.ocuparAsiento();
        }else if(asiento.getSelectedItem()==null){
            JOptionPane.showMessageDialog(null, "No selecciono asiento, no se registro pasajero", "No selecciono asiento, no se registro pasajero", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Bus lleno", "Bus lleno", JOptionPane.INFORMATION_MESSAGE);
        }
         
 
        Horarios UU = new Horarios(Principal);
        this.setVisible(false);
        UU.setVisible(true);
         


    }//GEN-LAST:event_regclienteActionPerformed

    private void cancelcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelcliActionPerformed

        
        Horarios UU = new Horarios(Principal);
        this.setVisible(false);
        UU.setVisible(true);

    }//GEN-LAST:event_cancelcliActionPerformed

    private void salirclijButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirclijButton3ActionPerformed
        this.dispose();

    }//GEN-LAST:event_salirclijButton3ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
       System.exit(0);
        
    }//GEN-LAST:event_salirActionPerformed

    private void CdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdniActionPerformed

    }//GEN-LAST:event_CdniActionPerformed

    private void CnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnombreActionPerformed

    private void CllegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CllegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CllegadaActionPerformed

    private void CSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CSalidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CSalida;
    private javax.swing.JTextField Cdni;
    private javax.swing.JTextField Cllegada;
    private javax.swing.JTextField Cnombre;
    private javax.swing.JTextArea TextoEquipaje;
    private javax.swing.JComboBox asiento;
    private javax.swing.JButton cancelcli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regcliente;
    private javax.swing.JButton salir;
    private javax.swing.JButton salirclijButton3;
    // End of variables declaration//GEN-END:variables

}
