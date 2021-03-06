/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Collections;
import nodos.Nodo;
import modelos.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 *
 * @author Carlos Esteban
 * @param <G>
 */
public class Lista <G> implements Iterable<G>{

    //Atributos
    Nodo cabeza;
    Nodo ultimo;
    public int longitud;

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
    //Por practicidad
    public void insertarFinal(G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            this.cabeza = nodo;
            this.ultimo = nodo;
        } else {
            ultimo.siguiente = nodo;
            ultimo = nodo;
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

    public void eliminar(G dato){
        Nodo<G> temp, cabeza1=cabeza;
        if(cabeza==null){
            System.out.println("lista vacia");
        }else{
            if(cabeza1.valor==dato){
                cabeza1=cabeza1.siguiente;
                System.out.println("eliminado");
            }else{
                temp=cabeza1;
                cabeza1=cabeza1.siguiente;
                while(cabeza1!=null){
                    if(cabeza1.valor==dato && cabeza1.siguiente!=null){
                        temp.siguiente=cabeza1.siguiente;
                        System.out.println("eliminado");
                    }else if(cabeza1.valor==dato){
                        temp.siguiente=null;
                        System.out.println("eliminado");
                    }
                    temp=cabeza1;
                    cabeza1=cabeza1.siguiente;
                }
            }
        }
    }

    public G BuscarXDato(G dato) {
        if (this.cabeza == null) {
            System.out.println("\nLa lista est?? vacia, no hay datos para buscar ...\n");
        } else {
            Nodo temp = cabeza;
            Nodo temp2;
            boolean bandera = false;
            do {
                if (temp.valor == dato) {
                    bandera = true;
                }
                temp2 = temp;
                temp = temp.siguiente;
            } while (!bandera && temp != null);
            if (bandera) {
                return (G) temp2.getValor();
            } else {
                System.out.println("\nEl dato no existe\n");
            }           
        }
        return null;
    }
    
    public int obtenerLongitud(){
        return longitud;
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

    @Override
    public Iterator<G> iterator() {
        if (this.cabeza == null) {
            return Collections.<G>emptyList().iterator();
        }
        return new Iterator<G>() {
            private Nodo <G> nodoActual = null;
            @Override
            public boolean hasNext() {
                return nodoActual != ultimo;
            }

            @Override
            public G next() {
                if (nodoActual == null) {
                    nodoActual = cabeza;
                    return nodoActual.valor;
                }
                if (nodoActual.siguiente == null) {
                    throw new NoSuchElementException();
                }
                nodoActual = nodoActual.siguiente;
                return nodoActual.valor;
            }
            
        };
    }
}
