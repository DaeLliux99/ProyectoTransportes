/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import nodos.Nodo;

/**
 *
 * @author Carlos Esteban
 * @param <G>
 */
public class Cola<G> implements Iterable<G>{

    Nodo cabeza;
    Nodo ultimo;
    int longitud;

    public Cola() {
        this.cabeza = null;
        this.longitud = 0;
    }

    public void push(G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            this.cabeza = nodo;
            this.ultimo = nodo;
        } else {
            Nodo<G> puntero = this.cabeza;
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nodo;
            ultimo=nodo;
        }
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

    public void mostrarCola() {
        Nodo puntero = cabeza;
        while (puntero != null) {
            System.out.println(puntero.valor.toString());
            puntero = puntero.siguiente;
        }
    }

    public int getLongitud() {
        return longitud;
    }

    public Iterator<G> iterator() {
        if (this.cabeza == null) {
            return Collections.<G>emptyList().iterator();
        }
        return new Iterator<G>() {
            private Nodo<G> nodoActual = null;

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
