
package modelos;

import java.io.Serializable;

public class Horario implements Serializable{
    
    private String horaSalida;
    private String horaLlegada;

    public Horario(String Hora_Salida) {    
        this.horaSalida = Hora_Salida;      
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
