/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import NODOS.nodo;

/**
 *
 * @author User
 */
public class lista {
    nodo inicio=null;
    
    public void insertar(String p) {
        nodo aux,q;
        q = inicio;
        aux= new nodo(p);
        if (q == null) {
            inicio = aux;
        } else {
            aux.siguiente=inicio;
            inicio=aux;
        }
    }
    public void mostrarLista(){
        nodo aux= inicio;
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
