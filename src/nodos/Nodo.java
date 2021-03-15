/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

/**
 *
 * @author User
 */
public class Nodo {//convertir  a genérico
    public String valor;
    public Nodo siguiente;

    public Nodo() {
        this.valor = null;
        this.siguiente = null;
    }

    public Nodo(String p) {
        valor = p;
        siguiente = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
