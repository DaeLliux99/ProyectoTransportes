/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructuras;

import nodos.Nodo;

/**
 * 
 * @author Carlos Esteban
 * @param <G>
 */
public class Cola <G>{
    Nodo cabeza;
    int longitud;

    public Cola() {
        this.cabeza = null;
        this.longitud = 0;
    }
    
    public void push(G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            this.cabeza = nodo;
        } else {
            Nodo<G> puntero = this.cabeza;
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nodo;
        }
        this.longitud++;
    }
    
    public G pop() {
        if (cabeza == null) {
            return null;
        }
        Nodo<G> nodo = this.cabeza;
        this.cabeza = this.cabeza.siguiente;
        nodo.siguiente = null;
        this.longitud--;
        return nodo.valor;
    }
    
    public void mostrarCola() {
        Nodo puntero = cabeza;
        while(puntero != null) {
            System.out.println(puntero.valor.toString());
            puntero = puntero.siguiente;
        }
    } 
}
