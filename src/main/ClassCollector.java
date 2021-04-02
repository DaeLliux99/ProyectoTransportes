
package main;

import estructuras.*;
import modelos.*;
import nodos.*;


public class ClassCollector {

    public Lista<Ciudad> Lista_ciudades = new Lista<>();
    public Lista<Ciudad> Lista_ciudades2 = new Lista<>();
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
        //int matricula, int NumAsientos, int PesoMaximo, Chofer ID_chofer, Lista<Pasajero> Lista_Pasajero 
        
        
        Chofer C = new Chofer(730,"Pepito");
        
        Bus B = new Bus(1234,20,80,C);
        
        Ruta r = new Ruta(1, Lista_ciudades,B,28);
        
        
        
        Lista_rutas.insertarInicio(r);
        
        
        
        Lista_ciudades2.insertarInicio(new Ciudad(002, "AA", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(003, "BB", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(004, "CC", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(005, "AB", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(006, "TT", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(007, "RR", 50));
        Ruta r2 = new Ruta(2, Lista_ciudades2,B,30);
        Lista_rutas.insertarInicio(r2);
        
    }
}
