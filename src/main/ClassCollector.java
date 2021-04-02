/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import estructuras.*;
import modelos.*;
import nodos.*;

/**
 *
 * @author Carlos Esteban
 */
public class ClassCollector {

    Lista<Ciudad> Lista_ciudades = new Lista<>();
    Lista<Ruta> Lista_rutas = new Lista<>();
    Lista<Chofer> Lista_choferes = new Lista<>();
    Lista<Bus> Lista_buses = new Lista<>();
    Cola<Pasajero> Cola_clientes = new Cola<>();
    Pila<Horario> Pila_Horarios = new Pila<>();

    public ClassCollector() {
        Lista_ciudades.insertarInicio(new Ciudad(001, "AB", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "CD", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "EF", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "FG", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "HI", 50));
        Lista_ciudades.insertarInicio(new Ciudad(001, "JK", 50));
        Ciudad B = new Ciudad(001, "AB", 50);
        Ruta r = new Ruta(1, Lista_ciudades);
        Lista_rutas.insertarInicio(r);
        
        
        /*
        //Para la interfaz codigo   --- hACER SIMIL para cada clase
        Nodo<Ruta> temp = Lista_rutas.ObetenerPrimerNodo();
        while(temp != null){
            if(temp.valor.getID_ruta() == ruta){
                return temp.valor;
            }
            temp = temp.siguiente;
        }
        
        
        //REVISAR POR SI ACASO
        public Ruta Busqueda_Ruta(int Ruta_Buscada){
        Nodo<Ruta> temp = ruta1.ObetenerPrimerNodo();
        while(temp != null){
            if(temp.valor.getID_ruta()== Ruta_Buscada){
                return temp.valor;
            }
            temp = temp.siguiente;
        }  
        System.out.println("\nNo se ha encontrado la ciudad en los archivos ....");
        return null;
        }
        
        
         */

    }

    public static void main(String args[]) {
        ClassCollector A = new ClassCollector();

        A.Lista_rutas.obetenerPrimerObjeto().ciudadesLista();
        A.Lista_ciudades.eliminar(A.Lista_rutas.obetenerPrimerObjeto().Busqueda_Ciudad("EF"));
        A.Lista_rutas.obetenerPrimerObjeto().ciudadesLista();
        
    }
    /*
    /*
        Alumno A = new Alumno("jjj", 20);
        
        
        Lista<Alumno> l = new Lista<>();
        System.out.println("Lista de Alumnos: ");
        l.insertarInicio(A);
        l.insertarInicio(new Alumno("Esteban", 20));
        l.insertarInicio(new Alumno("Aea", 10));
        l.insertarInicio(new Alumno("OWO", 11));
        l.insertarInicio(new Alumno("UwU", 33));
        l.mostrarLista();
        //l.ObetenerNodo().getClass().;
        System.out.println("");
        //l.eliminar(A);
        System.out.println("");
        l.mostrarLista();
        l.ObetenerNodo().equals(A);
        System.out.println(l.ObetenerNodo().equals(A));

        System.out.println("Lista de Numeros: ");
        Lista<Integer> l2 = new Lista<>();
        l2.insertarInicio(12);
        l2.insertarInicio(21);
        l2.insertarInicio(23);
        l2.insertarInicio(24);
        l2.mostrarLista();
        System.out.println("");

        System.out.println("Pila de Alumnos: ");
        Pila<Alumno> l3 = new Pila<>();
        l3.push(new Alumno("Esteban", 20));
        l3.push(new Alumno("Adrian", 11));
        l3.push(new Alumno("Carlos", 12));
        l3.push(new Alumno("Jorge", 13));
        l3.mostrarPila();
        System.out.println("Pop:" + l3.pop().toString());
        System.out.println("");

        System.out.println("Cola de Alumnos: ");
        Cola<Alumno> l4 = new Cola<>();
        l4.push(new Alumno("Esteban", 20));
        l4.push(new Alumno("Adrian", 11));
        l4.push(new Alumno("Carlos", 12));
        l4.push(new Alumno("Jorge", 13));
        l4.mostrarCola();
        System.out.println("Pop:" + l4.pop().toString());

        System.out.println("");
        System.out.println("");
        Lista_Doble<Integer> l5 = new Lista_Doble<>();
        l5.insertarInicio(11);
        l5.insertarInicio(12);
        l5.insertarFinal(15);
        l5.insertarFinal(16);
        System.out.println("");
        l5.mostrarLista();
        System.out.println("");
        l5.insertarEnIndice(3,13);
        l5.insertarEnIndice(2,14);
        System.out.println("");
        l5.mostrarLista();
        System.out.println("");
        l5.EliminarXDato(15);
        System.out.println("");
        l5.mostrarLista();
        System.out.println("");
        
     */

 /*
        ruta r = new ruta();
        ciudad c = new ciudad();
        r.ingresarCiudad(c);
        r.ingresarCiudad(c);
        r.ingresarCiudad(c);
        r.ingresarCiudad(c);
        r.ingresarCiudad(c);
        r.ingresarCiudad(c);
        
        Lista<ruta> r1 = new Lista<>();
        
        r1.insertarFinal(r);
        r1.mostrarLista();
        //System.out.println(r1.ObetenerNodo().);
        r1.ObetenerNodo().valor.getClass();
        System.out.println(r1.ObetenerNodo().valor.equals(r1));
     */
    //int ID_ruta, float distancia, String Salida, String LLegada
    /*
        
        //int ID_ciudad, String ciudad, int distanciaSigteCiudad
        Lista<ciudad> c = new Lista<>();
        
        c.insertarInicio(new ciudad(001,"AB",50));
        c.insertarInicio(new ciudad(001,"CD",50));
        c.insertarInicio(new ciudad(001,"EF",50));
        c.insertarInicio(new ciudad(001,"FG",50));
        c.insertarInicio(new ciudad(001,"HI",50));
        c.insertarInicio(new ciudad(001,"JK",50));
        
        
        Lista<ruta> l = new Lista<>();
        
        System.out.println("Lista de ruta: ");
        ruta r = new ruta(1,500,"La merced","Acobanba",c);
        l.insertarInicio(r);
        //l.insertarInicio(new ruta(2,400,"Pucusana","Lima"));
        //l.insertarInicio(new ruta(3,300,"A","C"));
        //l.insertarInicio(new ruta(4,200,"B","D"));
        
        l.mostrarLista();
        ruta A = (ruta) l.ObetenerNodo();
        A.ciudadesLista();
        
    
     */
}
