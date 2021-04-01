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
public class Lista<G> {

    //Atributos
    Nodo cabeza;
    Nodo ultimo;
    int longitud;

    //Constructor
    public Lista() {
        cabeza = null;
        longitud = 0;
    }

    //Metodos
    public void insertarInicio(G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            cabeza = nodo;
            ultimo = nodo;
        } else {
            nodo.siguiente = this.cabeza;
            this.cabeza = nodo;
        }
        this.longitud++;
    }

    public void insertarFinal(G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            this.cabeza = nodo;
            this.ultimo = nodo;
        } else {
            ultimo.siguiente = nodo;
        }
        this.longitud++;
    }

    public void insertarEnIndice(int indice, G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            this.cabeza = nodo;
            this.ultimo = nodo;
            this.longitud++;
        } else if (indice == 1) {
            this.insertarInicio(dato);
        } else if (indice == this.longitud) {
            this.insertarFinal(dato);
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

    public void eliminar(G dato) {
        if (cabeza == null) {
            System.out.println("\nLa lista esta vacia. No hay datos que eliminar\n");
        } else {

            /*
            Nodo temp1 = cabeza, temp2 = cabeza;
            boolean encontro = false;
            while (temp2 != null && !encontro) {
                if (temp2.valor == dato) {
                    encontro = true;
                }
                temp1 = temp2;
                temp2 = temp2.siguiente;
            }
            if(encontro== true && temp2.siguiente !=null){
                temp1.siguiente = temp1.siguiente.siguiente;
                System.out.println("\nValor eliminado: "+temp2.valor);
            }else{
                System.out.println("\nValor eliminado: "+temp2.valor);
                temp2 = null;
                temp1 = null;
            }
             */
        }
    }
    
    
    public void BuscarXDato(){
        
    }
    

    public G obetenerPrimerObjeto() {
        Object obj = cabeza.getValor();
        return (G) obj;
    }
    
    public G obetenerUltimoObjeto() {
        Object obj = ultimo.getValor();
        return (G) obj;
    }
    
    
    public Nodo ObetenerPrimerNodo() {
        Nodo obj = cabeza;
        return obj;
    }
    
    public Nodo ObetenerUltimoNodo() {
        Nodo obj = ultimo;
        return obj;
    }

    public void mostrarLista() {
        Nodo puntero = cabeza;
        while (puntero != null) {
            System.out.println(puntero.valor.toString());
            puntero = puntero.siguiente;
        }
    }
}
