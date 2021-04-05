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

    private int matricula;
    private int numeroAsientos;
    private int pesoMaximo;
    private Chofer idChofer;
    private int ocupado = 0;
    
    private Ruta ruta;
   
    Cola<Pasajero> colaPasajero = new Cola<>();

    public Bus(int matricula, int NumAsientos, int PesoMaximo, Chofer ID_chofer, Ruta ruta) {
        this.matricula = matricula;
        this.numeroAsientos = NumAsientos;
        this.pesoMaximo = PesoMaximo;
        this.idChofer = ID_chofer;
        this.ruta = ruta;
    }

    public Bus(int matricula, int NumAsientos, int PesoMaximo, Chofer ID_chofer, Cola<Pasajero> Cola_Pasajero) {
        this.matricula = matricula;
        this.numeroAsientos = NumAsientos;
        this.pesoMaximo = PesoMaximo;
        this.idChofer = ID_chofer;
        this.colaPasajero = Cola_Pasajero;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public Chofer getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(Chofer idChofer) {
        this.idChofer = idChofer;
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
    
    

}
