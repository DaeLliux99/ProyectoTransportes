/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import NODOS.Nodo;

/**
 *
 * @author User
 */

public class lista {
    Nodo inicio=null;
    
    public void insertar(String p) {
        Nodo aux,q;
        q = inicio;
        aux= new Nodo(p);
        if (q == null) {
            inicio = aux;
        } else {
            aux.siguiente=inicio;
            inicio=aux;
        }
    }
    public void mostrarLista(){
        Nodo aux= inicio;
        while(aux!=null){
            
            System.out.println(aux.valor);
            aux=aux.siguiente;
        }
    }
    public static void main(String[] args) {
        lista l= new lista();
        l.insertar("text 1");
        l.insertar("text 2");
        l.insertar("text 3");
        l.mostrarLista();
    }
}
