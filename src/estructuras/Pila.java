/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructuras;
import java.io.Serializable;
import nodos.Nodo;

/**
 * 
 * @author Carlos Esteban
 * @param <G>
 */
public class Pila <G> implements Serializable{
    Nodo cabeza;
    int longitud;

    public Pila() {
        this.cabeza = null;
        this.longitud = 0;
    }
    
    public void push(G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        nodo.siguiente = this.cabeza;
        this.cabeza = nodo;
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
    
    public void mostrarPila() {
        Nodo puntero = cabeza;
        while(puntero != null) {
            System.out.println(puntero.valor.toString());
            puntero = puntero.siguiente;
        }
    } 
}
