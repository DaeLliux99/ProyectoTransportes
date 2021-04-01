/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InicializandoDatos;

import modelos.*;
import estructuras.*;
/**
 *
 * @author LEONARDO
 */
public class ListaRutas {
    Lista<ruta> r1 = new Lista();
    
    public void insertarRuta(ruta r){
        r1.insertarFinal(r);
    }
    
}
