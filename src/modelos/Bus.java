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
    private int NumAsientos;
    private int PesoMaximo;
    private Chofer ID_chofer;

    Lista<Pasajero> Lista_Pasajero = new Lista<>();

    //Recordar que la lista debe ser meno o igual a la cantidad de asientos
    //colocar un if afuera cuando se llene para que no se llene de mas
    public Bus(int matricula, int NumAsientos, int PesoMaximo, Chofer ID_chofer, Lista<Pasajero> Lista_Pasajero ) {
    this.matricula = matricula;
    this.NumAsientos = NumAsientos;
    this.PesoMaximo = PesoMaximo;
    this.ID_chofer= ID_chofer;
    this.Lista_Pasajero = Lista_Pasajero;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getNumAsientos() {
        return NumAsientos;
    }
     
    public void setNumAsientos(int NumAsientos) {
        this.NumAsientos = NumAsientos;
    }
     
    public int getPesoMaximo() {
        return PesoMaximo;
    }
     
    public void setPesoMaximo(int PesoMaximo) {
        this.PesoMaximo = PesoMaximo;
    }

    public Chofer getID_chofer() {
        return ID_chofer;
    }

    public void setID_chofer(Chofer ID_chofer) {
        this.ID_chofer = ID_chofer;
    }
       
    
}
