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

public class Lista <G> {
    //Atributos
    Nodo cabeza;
    int longitud;
    
    //Constructor
    public Lista() {
        cabeza = null;
        longitud = 0;
    }
    
    //Metodos
    public void insertarInicio(G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        nodo.siguiente = this.cabeza;
        this.cabeza = nodo;
        this.longitud++;
    }
    
    public void insertarFinal(G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            this.cabeza = nodo;
        } else {
            Nodo puntero = this.cabeza;
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nodo;
        }
        this.longitud++;
    }
    
    public void insertarEnIndice(int indice, G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            nodo.siguiente = this.cabeza;
            this.cabeza = nodo;
            this.longitud++;
        } else if (indice == 1) {
            this.insertarInicio(dato);
        } else {
            Nodo puntero = this.cabeza;
            int posicion = 1;
            while (puntero.siguiente != null && posicion < indice - 1) {
                puntero = puntero.siguiente;
                posicion++;
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
            this.longitud++;
        }
    }
    
    public void mostrarLista() {
        Nodo puntero = cabeza;
        while(puntero != null) {
            System.out.println(puntero.valor.toString());
            puntero = puntero.siguiente;
        }
    } 
}
