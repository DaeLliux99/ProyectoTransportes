
package modelos;

import java.io.Serializable;

public class Pasajero implements Serializable{
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
    
    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
}
