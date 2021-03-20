/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import estructuras.*;
import modelos.Alumno;


/**
 * 
 * @author Carlos Esteban
 */

public class Main {
    public static void main(String args[]) {
        Lista<Alumno> l = new Lista<>();
        System.out.println("Lista de Alumnos: ");
        l.insertarInicio(new Alumno("Esteban", 20));
        l.insertarInicio(new Alumno("Aea", 10));
        l.insertarInicio(new Alumno("OWO", 11));
        l.insertarInicio(new Alumno("UwU", 33));
        l.mostrarLista();
        System.out.println("");
        
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
    }
}
