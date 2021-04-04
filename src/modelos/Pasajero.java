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
    protected int idPasajero;
    protected String nombre;
    protected String lugarDestino;
    protected boolean paquetes;
    protected String descripcionPaquetes;
    protected int asiento;

    public Pasajero(int ID_pasajero, String nombre, String lugar_Destino, boolean paquetes, String descripcion_Paquete, int asiento) {
        this.idPasajero = ID_pasajero;
        this.nombre = nombre;
        this.lugarDestino = lugar_Destino;
        this.paquetes = paquetes;
        this.descripcionPaquetes = descripcion_Paquete;
        this.asiento=asiento;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public boolean isPaquetes() {
        return paquetes;
    }

    public void setPaquetes(boolean paquetes) {
        this.paquetes = paquetes;
    }

    public String getDescripcionPaquetes() {
        return descripcionPaquetes;
    }

    public void setDescripcionPaquetes(String descripcionPaquetes) {
        this.descripcionPaquetes = descripcionPaquetes;
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

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
}
