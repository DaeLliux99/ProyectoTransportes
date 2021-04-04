package main;

import estructuras.*;
import modelos.*;
import nodos.*;

public class ClassCollector {

    public Lista<Ciudad> Lista_ciudades = new Lista<>();
    //public Lista<Ciudad> Lista_ciudades2 = new Lista<>();

    public Lista<Ruta> Lista_rutas = new Lista<>();
    public Lista<Chofer> Lista_choferes = new Lista<>();
    public Lista<Bus> Lista_buses = new Lista<>();
    public Cola<Pasajero> Cola_clientes = new Cola<>();
    public Pila<Horario> Pila_Horarios = new Pila<>();

    public ClassCollector() {

        Chofer C = new Chofer(730, "Pepito");
        Chofer C2 = new Chofer(555, "Jose");

        Bus B = new Bus(1234, 20, 80, C);
        Bus B2 = new Bus(4321, 15, 50, C2);

        Lista_buses.insertarFinal(B);
        Lista_buses.insertarFinal(B2);

        Ruta a1 = new Ruta(1, B, 40);
        Ruta a2 = new Ruta(2, B2, 50);

        Lista_rutas.insertarInicio(a1);
        Lista_rutas.insertarInicio(a2);

        Lista_rutas.BuscarXDato(a1).ingresarCiudad(new Ciudad(001, "AB", 10));
        Lista_rutas.BuscarXDato(a1).ingresarCiudad(new Ciudad(002, "CD", 20));
        Lista_rutas.BuscarXDato(a1).ingresarCiudad(new Ciudad(003, "EF", 30));
        Lista_rutas.BuscarXDato(a1).ingresarCiudad(new Ciudad(004, "FG", 40));
        Lista_rutas.BuscarXDato(a1).ingresarCiudad(new Ciudad(005, "HI", 50));
        Lista_rutas.BuscarXDato(a1).ingresarCiudad(new Ciudad(006, "JK", 60));

        Lista_rutas.BuscarXDato(a2).ingresarCiudad(new Ciudad(001, "AA", 10));
        Lista_rutas.BuscarXDato(a2).ingresarCiudad(new Ciudad(002, "BB", 20));
        Lista_rutas.BuscarXDato(a2).ingresarCiudad(new Ciudad(003, "CC", 30));
        Lista_rutas.BuscarXDato(a2).ingresarCiudad(new Ciudad(004, "AB", 40));
        Lista_rutas.BuscarXDato(a2).ingresarCiudad(new Ciudad(005, "TT", 50));
        Lista_rutas.BuscarXDato(a2).ingresarCiudad(new Ciudad(006, "RR", 60));
        
        Region reg = new Region();
        reg.agregarCiudad(new Ciudad(001, "AA", 10));
        reg.agregarCiudad(new Ciudad(002, "CD", 20));
        reg.agregarCiudad(new Ciudad(003, "EF", 30));
        reg.agregarCiudad(new Ciudad(004, "FG", 40));
        reg.agregarCiudad(new Ciudad(005, "HI", 50));
        reg.agregarCamino(1, 4, 50);
        reg.agregarCamino(2, 3, 50);
        reg.agregarCamino(1, 3, 50);
        reg.agregarCamino(5, 1, 50);
        reg.agregarCamino(2, 4, 50);
        System.out.println(reg.toString());
        Ciudad c = reg.buscarCiudad(1);
        Lista <Ciudad> ccc = reg.obtenerCiudadesAdya(c);
        ccc.mostrarLista();
        /*
        Lista_rutas.BuscarXDato(a1).getCiudades_Ruta().insertarFinal(new Ciudad(001, "AB", 10));
        Lista_rutas.BuscarXDato(a1).getCiudades_Ruta().insertarFinal(new Ciudad(002, "CD", 20));
        Lista_rutas.BuscarXDato(a1).getCiudades_Ruta().insertarFinal(new Ciudad(003, "EF", 30));
        Lista_rutas.BuscarXDato(a1).getCiudades_Ruta().insertarFinal(new Ciudad(004, "FG", 40));
        Lista_rutas.BuscarXDato(a1).getCiudades_Ruta().insertarFinal(new Ciudad(005, "HI", 50));
        Lista_rutas.BuscarXDato(a1).getCiudades_Ruta().insertarFinal(new Ciudad(006, "JK", 60));
         
        Lista_rutas.BuscarXDato(a2).getCiudades_Ruta().insertarFinal(new Ciudad(001, "AA", 10));
        Lista_rutas.BuscarXDato(a2).getCiudades_Ruta().insertarFinal(new Ciudad(002, "BB", 20));
        Lista_rutas.BuscarXDato(a2).getCiudades_Ruta().insertarFinal(new Ciudad(003, "CC", 30));
        Lista_rutas.BuscarXDato(a2).getCiudades_Ruta().insertarFinal(new Ciudad(004, "AB", 40));
        Lista_rutas.BuscarXDato(a2).getCiudades_Ruta().insertarFinal(new Ciudad(005, "TT", 50));
        Lista_rutas.BuscarXDato(a2).getCiudades_Ruta().insertarFinal(new Ciudad(006, "RR", 60));
         */
        
        /*
        
        
        Lista_ciudades.insertarInicio(new Ciudad(001, "AB", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "CD", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "EF", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "FG", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "HI", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "JK", 50));      
        
        
        
       
        
        
        Ruta r = new Ruta(1, Lista_ciudades,B,28);
        
        //NO ES NECESARIO HACER NUEVAS LISTAS
       // Lista_rutas.obetenerPrimerObjeto().getRuta1().insertarInicio(dato);
       
        Lista_rutas.insertarInicio(r);
        
        
        
        Lista_ciudades2.insertarInicio(new Ciudad(002, "AA", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(003, "BB", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(004, "CC", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(005, "AB", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(006, "TT", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(007, "RR", 50));
        Ruta r2 = new Ruta(2, Lista_ciudades2,B2,30);
        
        Lista_rutas.insertarInicio(r2);
        
        
        Lista_buses.insertarFinal(B);
        Lista_buses.insertarFinal(B2);
         */
    }
}
