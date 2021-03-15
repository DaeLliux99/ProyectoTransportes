/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import estructuras.Lista;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

public class Main {
    public static void main(String args[]) {
        Lista l= new Lista();
        l.insertarInicio("text 1");
        l.insertarInicio("text 2");
        l.insertarInicio("text 3");
        l.mostrarLista();
    }
}
