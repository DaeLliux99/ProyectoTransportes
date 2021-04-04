package main;

import estructuras.*;
import modelos.*;
import nodos.*;

public class ClassCollector {

    public Lista<Ciudad> listaCiudades = new Lista<>();
    //public Lista<Ciudad> Lista_ciudades2 = new Lista<>();
    public Lista<Ruta> listaRutas = new Lista<>();
    public Lista<Usuario> listaUsuarios = new Lista<>();
    public Lista<Chofer> listaChoferes = new Lista<>();
    public Lista<Bus> listaBuses = new Lista<>();
    public Cola<Pasajero> colaClientes = new Cola<>();
    public Pila<Horario> pilaHorario = new Pila<>();

    public ClassCollector() {
        //String username, String password, boolean managent
        Usuario u1 = new Usuario("username","password",true);
        Usuario u2 = new Usuario("abc","abc",false);
        
        listaUsuarios.insertarFinal(u1);
        listaUsuarios.insertarFinal(u2);

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

        
    }
}
