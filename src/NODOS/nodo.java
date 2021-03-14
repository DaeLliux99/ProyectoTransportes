/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NODOS;

/**
 *
 * @author User
 */
public class nodo {//convertir  a genérico
    public String  valor;
    public nodo siguiente;

    public nodo() {
        this.valor = null;
        this.siguiente = null;
    }

    public nodo(String p) {
        valor=p;
        siguiente=null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
