
package main;

import estructuras.*;
import modelos.*;
import nodos.*;


public class ClassCollector {

    public Lista<Ciudad> Lista_ciudades = new Lista<>();
    public Lista<Ruta> Lista_rutas = new Lista<>();
    public Lista<Chofer> Lista_choferes = new Lista<>();
    public Lista<Bus> Lista_buses = new Lista<>();
    public Cola<Pasajero> Cola_clientes = new Cola<>();
    public Pila<Horario> Pila_Horarios = new Pila<>();

    public ClassCollector() {
        Lista_ciudades.insertarInicio(new Ciudad(001, "AB", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "CD", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "EF", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "FG", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "HI", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "JK", 50));
        
        
        Ruta r = new Ruta(1, Lista_ciudades);
        Lista_rutas.insertarInicio(r);
        
    }
}
