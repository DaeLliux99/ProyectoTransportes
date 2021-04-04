/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

//import estructuras.Lista;
import nodos.Nodo;

/**
 *
 * @author LEONARDO
 * @param <G>
 */
public class Busqueda_Binaria <G extends Comparable<G>> {
    
    private Nodo sacarMedio(Nodo inicio, Nodo fin) {
        if (inicio == null) {
            return null;
        }
        Nodo lento = inicio;
        Nodo rapido = inicio.siguiente;
        
        while (rapido != fin) {
            rapido = rapido.siguiente;
            if (rapido != fin) {
                lento = lento.siguiente;
                rapido = rapido.siguiente;
            }
        }
        return lento;
    }
    
    public G busquedaBinaria(Lista<? extends Comparable> lista, G valor) {
        Nodo inicio = lista.cabeza;
        Nodo fin = null;
        do {
            Nodo <G> medio = sacarMedio(inicio, fin);
            if (medio == null) {
                return null;
            }
            if (medio.valor.compareTo(valor) == 0) {
                return medio.valor;
            } else if (medio.valor.compareTo(valor) == 1) {
                inicio = medio.siguiente;
            } else if (medio.valor.compareTo(valor) == -1) {
                fin = medio;
            }
        } while (fin == null || fin != inicio);
        return null;
    }
}
