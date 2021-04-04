/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import estructuras.*;

/**
 * 
 * @author CODIGO LAGARTO
 */
public class Region {
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
            if (c.getID_ciudad() == idCiudadInicio) {
                inicio = c;
            }
            if (c.getID_ciudad() == idCiudadFinal) {
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
            if (c.getID_ciudad() == idCiudad) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return reg.toString();
    }
    
}
