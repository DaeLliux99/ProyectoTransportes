/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import estructuras.Lista;
import modelos.Alumno;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

public class Main {
    public static void main(String args[]) {
        Lista<Alumno> l = new Lista<>();
        l.insertarInicio(new Alumno("Esteban", 20));
        l.insertarInicio(new Alumno("Aea", 10));
        l.insertarInicio(new Alumno("OWO", 11));
        l.insertarInicio(new Alumno("UwU", 33));
        l.mostrarLista();
        Lista<Integer> l2 = new Lista<>();
        l2.insertarInicio(12);
        l2.insertarInicio(21);
        l2.insertarInicio(23);
        l2.insertarInicio(24);
        l2.mostrarLista();
    }
}
