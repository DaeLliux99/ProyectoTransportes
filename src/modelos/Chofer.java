/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;

/**
 *
 * @author LEONARDO
 */
public class Chofer implements Comparable<Chofer>, Serializable{
    private int dniChofer;
    private String nombre;
    private boolean estado=true; //true = disponible false= no disponible

    public Chofer(int DNI_chofer, String Nombre) {
        this.dniChofer = DNI_chofer;
        this.nombre = Nombre;
    }

    public int getDniChofer() {
        return dniChofer;
    }

    public void setDniChofer(int dniChofer) {
        this.dniChofer = dniChofer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Chofer{" + "dniChofer=" + dniChofer + ", nombre=" + nombre + ", estado=" + estado+ '}';
    }

    @Override
    public int compareTo(Chofer o) {
        if (this.dniChofer == o.dniChofer) {
            return 0;
        }
        return -1;
    }

}
