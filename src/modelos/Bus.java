/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import estructuras.*;

/**
 *
 * @author LEONARDO
 */
public class Bus {

    private String matricula;
    private int idBus;
    private int numeroAsientos;
    private int pesoMaximo;
    private int ocupado = 0;
    private boolean disponible = true;

    private Chofer chofer;
    private Ruta ruta;
    private Horario horario;

    Cola<Pasajero> colaPasajero = new Cola<>();

    public Bus(String matricula, int idBus, int NumAsientos, int PesoMaximo) {
        this.matricula = matricula;
        this.idBus = idBus;
        this.numeroAsientos = NumAsientos;
        this.pesoMaximo = PesoMaximo;
        this.chofer = null;
        this.ruta = null;
    }

    public Bus(String matricula, int idBus, int NumAsientos, int PesoMaximo, Chofer ID_chofer, Ruta ruta) {
        this.matricula = matricula;
        this.idBus = idBus;
        this.numeroAsientos = NumAsientos;
        this.pesoMaximo = PesoMaximo;
        this.chofer = ID_chofer;
        this.chofer.setEstado(false);
        this.ruta = ruta;
    }

    /*
    public Bus(int idBus, int NumAsientos, int PesoMaximo, Chofer ID_chofer, Cola<Pasajero> Cola_Pasajero) {
        this.idBus = idBus;
        this.numeroAsientos = NumAsientos;
        this.pesoMaximo = PesoMaximo;
        this.chofer = ID_chofer;
        this.chofer.setEstado(false);
        this.colaPasajero = Cola_Pasajero;
    }
     */
    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int PesoMaximo) {
        this.pesoMaximo = PesoMaximo;
    }

    public int getOcupado() {
        return ocupado;
    }

    public void setOcupado(int Ocupado) {
        this.ocupado = Ocupado;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
        this.chofer.setEstado(false);
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Cola<Pasajero> getColaPasajero() {
        return colaPasajero;
    }

    public void setColaPasajero(Cola<Pasajero> colaPasajero) {
        this.colaPasajero = colaPasajero;
    }

    public void ocuparAsiento() {
        ocupado++;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Horario getHorario() {
        return horario;
    }

    
    
    
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Bus{" + "matricula=" + matricula + ", idBus=" + idBus + ", numeroAsientos=" + numeroAsientos + ", pesoMaximo=" + pesoMaximo + ", ocupado=" + ocupado + ", disponible=" + disponible + ", chofer=" + chofer + ", ruta=" + ruta + ", horario=" + horario + ", colaPasajero=" + colaPasajero + '}';
    }

    
}
