/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import nodos.Nodo;

public class Lista_Doble<G> {

    //Atributos
    Nodo cabeza;
    Nodo ultimo;
    int longitud;

    //Constructor
    public Lista_Doble() {
        cabeza = null;
        ultimo = null;
        longitud = 0;
    }

    //Metodos
    public void insertarInicio(G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            this.cabeza = nodo;
            this.ultimo = nodo;
        } else {
            nodo.siguiente = this.cabeza;
            this.cabeza.anterior = nodo;
            this.cabeza = nodo;
            this.longitud++;
        }
    }

    public void insertarFinal(G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            this.cabeza = nodo;
            this.ultimo = nodo;
        } else {
            this.ultimo.siguiente = nodo;
            nodo.anterior = this.ultimo;
            this.ultimo = nodo;
        }
        this.longitud++;
    }

    public void insertarEnIndice(int indice, G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (indice < 0 || indice > this.longitud) {
            System.out.println("\nLa posición a insertar no existe ...\n");
        } else {
            if (this.cabeza == null) {
                //No hay datos por tanto sera el primero de todos
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
                while (puntero.siguiente != null && posicion < indice - 1) {//Antes era menos 1
                    puntero = puntero.siguiente;
                    posicion++;
                }
                nodo.siguiente = puntero.siguiente;
                puntero.siguiente.anterior = nodo;
                puntero.siguiente = nodo;
                nodo.anterior = puntero;
                this.longitud++;
            }
        }
    }
    
    public void EliminarXDato(G dato){
        if(this.cabeza == null){
            System.out.println("\nLa lista esta vacio, no se puede eliminar datos ...\n");
        }else{
            if(cabeza == ultimo && dato == cabeza.valor){
                cabeza = ultimo = null;
            }else if(cabeza.valor == dato){
                cabeza = cabeza.siguiente;
                cabeza.anterior = null;
            }else if(ultimo.valor == dato ){
                ultimo = ultimo.anterior;
                ultimo.siguiente = null;
            }else{
                Nodo temp1, temp2;
                temp1 = cabeza;
                temp2 = cabeza.siguiente;
                while(temp2 != null && temp2.valor != dato){
                    temp1 = temp1.siguiente;
                    temp2 = temp2.siguiente;
                }
                if(temp2 != null){
                    temp1.siguiente = temp2.siguiente;
                    temp2.siguiente.anterior = temp1;
                }
            }
        }
        this.longitud--;
    }
    

    public void mostrarLista() {
        Nodo puntero = cabeza;
        while (puntero != null) {
            System.out.println(puntero.valor.toString());
            puntero = puntero.siguiente;
        }
    }
}
