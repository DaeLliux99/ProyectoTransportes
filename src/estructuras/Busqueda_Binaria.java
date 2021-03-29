/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

//import estructuras.Lista;
import nodos.Nodo;

/**
 *
 * @author LEONARDO
 */
public class Busqueda_Binaria {

    public void PreparandoBusqueda(Lista T, int valorBuscado) {
        int inferior = 1; //Primer dato
        int superior = T.longitud;
    }

    public void BusquedaBinaria(Lista T, int valorBuscado, int lo, int hi) {
        if (lo > hi) {
            System.out.println("\nNo se encontro el archivo ...\n");
        }
        int medio = (lo + hi) / 2;

        Nodo puntero = T.cabeza;
        int buscador = 1;
        while (buscador < medio && puntero != null) {
            puntero = puntero.siguiente;
            buscador++;
        }
        if (puntero == null) {
            System.out.println("\nNo se encontro el archivo ...\n");
        }

        if (valorBuscado == (int) puntero.valor) {
            System.out.println("\nEl elemento " + valorBuscado + " ha sido encontrado en la posicion : " + buscador + " \n");
        }
        if (valorBuscado < (int) puntero.valor) {
            BusquedaBinaria(T, valorBuscado, lo, (medio - 1));
        }
        if (valorBuscado > (int) puntero.valor) {
            BusquedaBinaria(T, valorBuscado, (medio + 1), hi);
        }

    }

}
