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
public class Empresa extends Cliente{
    private int NumeroPersonas;

    public Empresa(int NumeroPersonas, int ID, String nombre, String lugar_Salida, String lugar_Destino, boolean paquetes, int pesoPaquetes) {
        super(ID, nombre, lugar_Salida, lugar_Destino, paquetes, pesoPaquetes);
        this.NumeroPersonas = NumeroPersonas;
    }

    public int getNumeroPersonas() {
        return NumeroPersonas;
    }

    public void setNumeroPersonas(int NumeroPersonas) {
        this.NumeroPersonas = NumeroPersonas;
    }
    
    public String toString() {
        return ("Nombre: "+getNombre()+
                "\nRUC: "+getID()+
                "\nCantidad de asiento: "+getNumeroPersonas()+
                "\nSalida:"+getLugar_Salida()+
                "\nDestino:"+getLugar_Destino()+
                "\nPaquete:"+((isPaquetes())? "Si":"No")+
                "\nPeso del Paquete:"+ getPesoPaquetes());
    }
    
}
