/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author LEONARDO
 */
public class Chofer {
    private int DNI_chofer;
    private String Nombre;
    private boolean estado=true; //true = disponible false= no disponible

    public Chofer(int DNI_chofer, String Nombre) {
        this.DNI_chofer = DNI_chofer;
        this.Nombre = Nombre;
    }

    public int getDNI_chofer() {
        return DNI_chofer;
    }

    public void setDNI_chofer(int DNI_chofer) {
        this.DNI_chofer = DNI_chofer;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
   
    
    
    
}
