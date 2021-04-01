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
public class Pasajero {
    protected int ID_pasajero;
    protected String nombre;
    protected String lugar_Destino;
    protected boolean paquetes;
    protected String descripcion_Paquete;

    public Pasajero(int ID_pasajero, String nombre, String lugar_Destino, boolean paquetes, String descripcion_Paquete) {
        this.ID_pasajero = ID_pasajero;
        this.nombre = nombre;
        this.lugar_Destino = lugar_Destino;
        this.paquetes = paquetes;
        this.descripcion_Paquete = descripcion_Paquete;
    }

    public int getID_pasajero() {
        return ID_pasajero;
    }

    public void setID_pasajero(int ID_pasajero) {
        this.ID_pasajero = ID_pasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar_Destino() {
        return lugar_Destino;
    }

    public void setLugar_Destino(String lugar_Destino) {
        this.lugar_Destino = lugar_Destino;
    }

    public boolean isPaquetes() {
        return paquetes;
    }

    public void setPaquetes(boolean paquetes) {
        this.paquetes = paquetes;
    }

    public String getDescripcion_Paquete() {
        return descripcion_Paquete;
    }

    public void setDescripcion_Paquete(String descripcion_Paquete) {
        this.descripcion_Paquete = descripcion_Paquete;
    }
    
/*
    public String toString() {
        return ("Nombre: "+getNombre()+
                "\nDNI: "+getID()+
                "\nNumero de asiento: "+getAsiento()+
                "\nSalida:"+getLugar_Salida()+
                "\nDestino:"+getLugar_Destino()+
                "\nPaquete:"+((isPaquetes())? "Si":"No")+
                "\nPeso del Paquete:"+ getPesoPaquetes());
    }
*/
}
