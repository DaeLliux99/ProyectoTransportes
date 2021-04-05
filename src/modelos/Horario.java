/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

public class Horario {
    private Bus bus;
    private String horaSalida;
    private String horaLlegada;

    public Horario(Bus bus, String Hora_Salida, String Hora_Llegada) {
        this.bus = bus;
        this.horaSalida = Hora_Salida;
        this.horaLlegada = Hora_Llegada;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
 
}
