package main;

import estructuras.*;
import modelos.*;
import nodos.*;

public class ClassCollector {

    public Lista<Ciudad> listaCiudades = new Lista<>();
    //public Lista<Ciudad> Lista_ciudades2 = new Lista<>();
    public Lista<Ruta> listaRutas = new Lista<>();
    public Lista<Chofer> listaChoferes = new Lista<>();
    public Lista<Bus> listaBuses = new Lista<>();
    public Cola<Pasajero> colaClientes = new Cola<>();
    public Pila<Horario> pilaHorario = new Pila<>();

    public ClassCollector() {

        Chofer C = new Chofer(730, "Pepito");
        Chofer C2 = new Chofer(555, "Jose");

        Ruta a1 = new Ruta(1, /*B,*/ 40);
        Ruta a2 = new Ruta(2, /*B2,*/ 50);
        
        Bus B = new Bus(1234, 20, 80, C,a1);
        Bus B2 = new Bus(4321, 15, 50, C2,a2);

        listaBuses.insertarFinal(B);
        listaBuses.insertarFinal(B2);
        

        listaRutas.insertarInicio(a1);
        listaRutas.insertarInicio(a2);

        listaRutas.BuscarXDato(a1).ingresarCiudad(new Ciudad(001, "AB", 10));
        listaRutas.BuscarXDato(a1).ingresarCiudad(new Ciudad(002, "CD", 20));
        listaRutas.BuscarXDato(a1).ingresarCiudad(new Ciudad(003, "EF", 30));
        listaRutas.BuscarXDato(a1).ingresarCiudad(new Ciudad(004, "FG", 40));
        listaRutas.BuscarXDato(a1).ingresarCiudad(new Ciudad(005, "HI", 50));
        listaRutas.BuscarXDato(a1).ingresarCiudad(new Ciudad(006, "JK", 60));

        listaRutas.BuscarXDato(a2).ingresarCiudad(new Ciudad(001, "AA", 10));
        listaRutas.BuscarXDato(a2).ingresarCiudad(new Ciudad(002, "BB", 20));
        listaRutas.BuscarXDato(a2).ingresarCiudad(new Ciudad(003, "CC", 30));
        listaRutas.BuscarXDato(a2).ingresarCiudad(new Ciudad(004, "AB", 40));
        listaRutas.BuscarXDato(a2).ingresarCiudad(new Ciudad(005, "TT", 50));
        listaRutas.BuscarXDato(a2).ingresarCiudad(new Ciudad(006, "RR", 60));
        
        /*
        listaRutas.BuscarXDato(a1).getCiudades_Ruta().insertarFinal(new Ciudad(001, "AB", 10));
        listaRutas.BuscarXDato(a1).getCiudades_Ruta().insertarFinal(new Ciudad(002, "CD", 20));
        listaRutas.BuscarXDato(a1).getCiudades_Ruta().insertarFinal(new Ciudad(003, "EF", 30));
        listaRutas.BuscarXDato(a1).getCiudades_Ruta().insertarFinal(new Ciudad(004, "FG", 40));
        listaRutas.BuscarXDato(a1).getCiudades_Ruta().insertarFinal(new Ciudad(005, "HI", 50));
        listaRutas.BuscarXDato(a1).getCiudades_Ruta().insertarFinal(new Ciudad(006, "JK", 60));
         
        listaRutas.BuscarXDato(a2).getCiudades_Ruta().insertarFinal(new Ciudad(001, "AA", 10));
        listaRutas.BuscarXDato(a2).getCiudades_Ruta().insertarFinal(new Ciudad(002, "BB", 20));
        listaRutas.BuscarXDato(a2).getCiudades_Ruta().insertarFinal(new Ciudad(003, "CC", 30));
        listaRutas.BuscarXDato(a2).getCiudades_Ruta().insertarFinal(new Ciudad(004, "AB", 40));
        listaRutas.BuscarXDato(a2).getCiudades_Ruta().insertarFinal(new Ciudad(005, "TT", 50));
        listaRutas.BuscarXDato(a2).getCiudades_Ruta().insertarFinal(new Ciudad(006, "RR", 60));
         */

 /*
        
        
        listaCiudades.insertarInicio(new Ciudad(001, "AB", 50));
        listaCiudades.insertarInicio(new Ciudad(001, "CD", 50));
        listaCiudades.insertarInicio(new Ciudad(001, "EF", 50));
        listaCiudades.insertarInicio(new Ciudad(001, "FG", 50));
        listaCiudades.insertarInicio(new Ciudad(001, "HI", 50));
        listaCiudades.insertarInicio(new Ciudad(001, "JK", 50));      
        
        
        
       
        
        
        Ruta r = new Ruta(1, listaCiudades,B,28);
        
        //NO ES NECESARIO HACER NUEVAS LISTAS
       // listaRutas.obetenerPrimerObjeto().getRuta1().insertarInicio(dato);
       
        listaRutas.insertarInicio(r);
        
        
        
        Lista_ciudades2.insertarInicio(new Ciudad(002, "AA", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(003, "BB", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(004, "CC", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(005, "AB", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(006, "TT", 50));
        Lista_ciudades2.insertarInicio(new Ciudad(007, "RR", 50));
        Ruta r2 = new Ruta(2, Lista_ciudades2,B2,30);
        
        listaRutas.insertarInicio(r2);
        
        
        listaBuses.insertarFinal(B);
        listaBuses.insertarFinal(B2);
         */
    }
}
