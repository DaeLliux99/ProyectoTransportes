/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

/**
 *
 * @author Carlos Esteban
 * @param <G>
 */
public class Nodo <G> {
    public G valor;
    public Nodo siguiente;

    public Nodo() {
        this.valor = null;
        this.siguiente = null;
    }

    public Nodo(G p) {
        valor = p;
        siguiente = null;
    }

    public G getValor() {
        return valor;
    }

    public void setValor(G valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
