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
public class Cliente {
    protected int ID;
    protected String nombre;
    protected String lugar_Salida;
    protected String lugar_Destino;
    protected boolean paquetes;
    protected int pesoPaquetes;

    public Cliente(int ID, String nombre, String lugar_Salida, String lugar_Destino, boolean paquetes, int pesoPaquetes) {
        this.ID = ID;
        this.nombre = nombre;
        this.lugar_Salida = lugar_Salida;
        this.lugar_Destino = lugar_Destino;
        this.paquetes = paquetes;
        this.pesoPaquetes = pesoPaquetes;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar_Salida() {
        return lugar_Salida;
    }

    public void setLugar_Salida(String lugar_Salida) {
        this.lugar_Salida = lugar_Salida;
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

    public int getPesoPaquetes() {
        return pesoPaquetes;
    }

    public void setPesoPaquetes(int pesoPaquetes) {
        this.pesoPaquetes = pesoPaquetes;
    }

    
        
    
    
}
