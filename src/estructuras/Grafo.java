/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructuras;
import java.util.*;
/**
 * 
 * @author CODIGO LAGARTO
 * @param <G>
 */
public class Grafo <G>{
    
    class Arista <G>{
        G destino;
        int peso;
        Arista(G destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }
    
    private Map<G, Lista<Arista>> map;
    
    public Grafo() {
        map = new HashMap<>();
    }
    
    public void agregarVertice(G v) {
        map.put(v, new Lista<>());
    }
    
    public void agregarArista(G inicio, G destino, int peso, boolean bidi) {
        if (!map.containsKey(inicio))
            agregarVertice(inicio);
        if (!map.containsKey(destino))
            agregarVertice(destino);
        map.get(inicio).insertarFinal(new Arista(destino, peso));
        if (bidi == true) {
            map.get(destino).insertarFinal(new Arista(inicio, peso));
        }
    }
    
    public int obtenerTotalVectores() {
        return map.keySet().size();
    }
    
    public int obtenerTotalAristas(boolean bidi) {
        int contador = 0;
        for (G v : map.keySet()) {
            contador += map.get(v).longitud;
        }
        if (bidi == true) {
            contador = contador / 2;
        }
        return contador;
    }
    
    public Lista<G> obtenerVertices() {
        Lista <G> lista = new Lista<>();
        for (G v : map.keySet()) {
            lista.insertarFinal(v);
        }
        return lista;
    }
    
    public Lista<G> obtenerDato(G dato) {
        Lista <G> lista = new Lista<>();
        for (Arista v: map.get(dato)) {
            lista.insertarFinal((G) v.destino);
        }
        return lista;
    }
    
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (G v: map.keySet()) {
            builder.append(v.toString() + ": ");
            /*Nodo puntero = map.get(v).cabeza;
            while (puntero != null) {
                builder.append(puntero.valor.toString() + " ");
                puntero = puntero.siguiente;
            }*/
            for (Arista w: map.get(v)) {
                 builder.append(w.destino.toString() + " ");
            }
            builder.append("\n");
        }
        return (builder.toString());
    }
}
