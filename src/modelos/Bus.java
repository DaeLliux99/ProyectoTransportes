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
public class Bus {
    private int IDBus;
    private int NumAsientos;
    private int PesoMaximo;
  
    public Bus(int IDBus, int NumAsientos, int PesoMaximo) {
    this.IDBus = IDBus;
    this.NumAsientos = NumAsientos;
    this.PesoMaximo = PesoMaximo;
    }
    
    public int getIDBus() {
        return IDBus;
    }

    public void setIDBus(int IDBus) {
        this.IDBus = IDBus;
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
    
    
    
}
