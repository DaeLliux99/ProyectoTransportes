
package estructuras;
import java.util.*;
import nodos.Nodo;
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
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (G v: map.keySet()) {
            builder.append(v.toString() + ": ");
            Nodo puntero = map.get(v).cabeza;
            while (puntero != null) {
                builder.append(puntero.valor.toString() + " ");
                puntero = puntero.siguiente;
            }
            builder.append("\n");
        }
        return (builder.toString());
    }
}
