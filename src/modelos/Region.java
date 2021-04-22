

package modelos;

import estructuras.*;
import java.io.Serializable;


public class Region implements Serializable{
    Grafo<Ciudad> reg;
    
    public Region() {
        reg = new Grafo<>();
    }
    
    public void agregarCiudad(Ciudad ciudad) {
        reg.agregarVertice(ciudad);
    }
    
    public void agregarCamino(int idCiudadInicio, int idCiudadFinal, int distancia) {
        Ciudad inicio = null, fin = null;
        Lista<Ciudad> listaCiudades = reg.obtenerVertices();
        for (Ciudad c: listaCiudades) {
            if (c.getIdCiudad() == idCiudadInicio) {
                inicio = c;
            }
            if (c.getIdCiudad() == idCiudadFinal) {
                fin = c;
            }
        }
        if (inicio == fin || inicio == null || fin == null) {
            System.out.println("No se pudo agregar :C");
        } else {
            reg.agregarArista(inicio, fin, distancia, false);
        }
    }
    
    public Lista<Ciudad> obtenerCiudades() {
        return reg.obtenerVertices();
    }
    
    public Lista<Ciudad> obtenerCiudadesAdya(Ciudad ciudad) {
        return reg.obtenerDato(ciudad);
    }
    
    public Ciudad buscarCiudad(int idCiudad) {
        for (Ciudad c: reg.obtenerVertices()) {
            if (c.getIdCiudad() == idCiudad) {
                return c;
            }
        }
        return null;
    }
    
    public int obtenerDistancia(Ciudad ciudadA,Ciudad ciudadB ) {
        return reg.obtenerPeso(ciudadA, ciudadB);
    }

    @Override
    public String toString() {
        return reg.toString();
    }
    
}
