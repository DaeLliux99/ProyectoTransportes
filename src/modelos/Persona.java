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
public class Persona extends Cliente {

    private int Asiento;

    public Persona(int Asiento, int ID, String nombre, String lugar_Salida, String lugar_Destino, boolean paquetes, int pesoPaquetes) {
        super(ID, nombre, lugar_Salida, lugar_Destino, paquetes, pesoPaquetes);
        this.Asiento = Asiento;
    }

    public int getAsiento() {
        return Asiento;
    }

    public void setAsiento(int Asiento) {
        this.Asiento = Asiento;
    }

    public String toString() {
        return ("Nombre: "+getNombre()+
                "\nDNI: "+getID()+
                "\nNumero de asiento: "+getAsiento()+
                "\nSalida:"+getLugar_Salida()+
                "\nDestino:"+getLugar_Destino()+
                "\nPaquete:"+((isPaquetes())? "Si":"No")+
                "\nPeso del Paquete:"+ getPesoPaquetes());
    }
    
    
}
