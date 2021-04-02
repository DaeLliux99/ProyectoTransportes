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
public class Horarios {
    private Bus bus;
    private String Hora_Salida;
    private String Hora_Llegada;

    public Horarios(Bus bus, String Hora_Salida, String Hora_Llegada) {
        this.bus = bus;
        this.Hora_Salida = Hora_Salida;
        this.Hora_Llegada = Hora_Llegada;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public String getHora_Salida() {
        return Hora_Salida;
    }

    public void setHora_Salida(String Hora_Salida) {
        this.Hora_Salida = Hora_Salida;
    }

    public String getHora_Llegada() {
        return Hora_Llegada;
    }

    public void setHora_Llegada(String Hora_Llegada) {
        this.Hora_Llegada = Hora_Llegada;
    }
 
}
