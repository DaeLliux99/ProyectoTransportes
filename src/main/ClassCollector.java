/*

Autores:

    Chachi Meza, Leonardo Juan      18200060
    Palomino Martinez, Luis Alberto 18200173
    Carlos Joyo, Esteban Adrian     18200233
    Soto Piñares, Nestor Raul       18200116

 */
package main;

import estructuras.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public Region reg = new Region();

    public ClassCollector() {
        //String username, String password, boolean managent 
        try {
            ObjectInputStream leyendoUsuarios = new ObjectInputStream(new FileInputStream("/archivos/usuarios.dat"));
            listaUsuarios = (Lista) leyendoUsuarios.readObject();
            leyendoUsuarios.close();
            ObjectInputStream leyendoChoferes = new ObjectInputStream(new FileInputStream("/archivos/choferes.dat"));
            listaChoferes = (Lista) leyendoChoferes.readObject();
            leyendoChoferes.close();
            ObjectInputStream leyendoRutas = new ObjectInputStream(new FileInputStream("./archivos/rutas.dat"));
            listaRutas = (Lista) leyendoRutas.readObject();
            leyendoRutas.close();
            ObjectInputStream leyendoBuses = new ObjectInputStream(new FileInputStream("./archivos/buses.dat"));
            listaBuses = (Lista) leyendoBuses.readObject();
            leyendoBuses.close();
            ObjectInputStream leyendoCiudades = new ObjectInputStream(new FileInputStream("./archivos/ciudades.dat"));
            listaCiudades = (Lista) leyendoCiudades.readObject();
            leyendoCiudades.close();
            ObjectInputStream leyendoRegion = new ObjectInputStream(new FileInputStream("./archivos/region.dat"));
            reg = (Region) leyendoRegion.readObject();
            leyendoRegion.close();
        } catch (IOException e) {
            initObjetos();
            guardarFichero();
            System.out.println("OwO");
        } catch (ClassNotFoundException ex) {
            System.out.println("UwU");
        }
    }

    private void initObjetos() {

        Usuario u1 = new Usuario("username", "password", true);
        Usuario u2 = new Usuario("abc", "abc", false);

        listaUsuarios.insertarFinal(u1);
        listaUsuarios.insertarFinal(u2);

        Chofer C = new Chofer(730, "Pepito");
        Chofer C2 = new Chofer(555, "Jose");
        Chofer C3 = new Chofer(70644074, "Palomino Martines Luis");
        Chofer C4 = new Chofer(73089734, "Chachi Meza, Leonardo");
        Chofer C5 = new Chofer(1234567, "Carlos Esteban");

        listaChoferes.insertarFinal(C);
        listaChoferes.insertarFinal(C2);
        listaChoferes.insertarFinal(C3);
        listaChoferes.insertarFinal(C4);
        listaChoferes.insertarFinal(C5);

        Ruta a1 = new Ruta(listaRutas.idControlador + 1);
        listaRutas.insertarFinal(a1);
        Ruta a2 = new Ruta(listaRutas.idControlador + 1);
        listaRutas.insertarFinal(a2);

        Bus B = new Bus("N35T0R", listaBuses.idControlador + 1, 20, 80, C, a1);
        listaBuses.insertarFinal(B);
        Bus B2 = new Bus("L30N4RD0", listaBuses.idControlador + 1, 15, 50, C2, a2);
        listaBuses.insertarFinal(B2);
        Bus B3 = new Bus("35T3B4N", listaBuses.idControlador + 1, 25, 40);
        listaBuses.insertarFinal(B3);
        Bus B4 = new Bus("P4L0M1N0", listaBuses.idControlador + 1, 30, 60);
        listaBuses.insertarFinal(B4);

        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Lima"));        //0
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Huancayo"));    //1
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Pichanaki"));   //2
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Trujillo"));    //3
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Puno"));        //4
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Cajamarca"));   //5
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Arequipa"));    //6
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Tarapoto"));    //7
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Iquitos"));     //8
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Chiclayo"));    //9
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "La libertad")); //10
      
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(0));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(1));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(2));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(3));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(4));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(5));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(6));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(7));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(8));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(9));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(10));

        reg.agregarCamino(1, 4, 1222);
        reg.agregarCamino(2, 3, 864);
        reg.agregarCamino(1, 3, 861);
        reg.agregarCamino(5, 1, 1161);
        reg.agregarCamino(2, 4, 1147);
        
        reg.agregarCamino(0, 1, 304);
        reg.agregarCamino(1, 2, 255);
        reg.agregarCamino(2, 3, 863);
        reg.agregarCamino(3, 4, 1852);
        reg.agregarCamino(4, 5, 2154); 
        
        reg.agregarCamino(6, 1, 1191);
        reg.agregarCamino(1, 7, 957);
        reg.agregarCamino(7, 8, 300);
        reg.agregarCamino(8, 9, 775);
        reg.agregarCamino(9, 10, 335);
        

        listaRutas.BuscarXDato(a1).insertarCiudad(listaCiudades.ObetenerPorIndiceObjeto(0),reg);
        listaRutas.BuscarXDato(a1).insertarCiudad(listaCiudades.ObetenerPorIndiceObjeto(1),reg);
        listaRutas.BuscarXDato(a1).insertarCiudad(listaCiudades.ObetenerPorIndiceObjeto(2),reg);
        listaRutas.BuscarXDato(a1).insertarCiudad(listaCiudades.ObetenerPorIndiceObjeto(3),reg);
        listaRutas.BuscarXDato(a1).insertarCiudad(listaCiudades.ObetenerPorIndiceObjeto(4),reg);
        listaRutas.BuscarXDato(a1).insertarCiudad(listaCiudades.ObetenerPorIndiceObjeto(5),reg);

        listaRutas.BuscarXDato(a2).insertarCiudad(listaCiudades.ObetenerPorIndiceObjeto(6),reg);
        listaRutas.BuscarXDato(a2).insertarCiudad(listaCiudades.ObetenerPorIndiceObjeto(1),reg);
        listaRutas.BuscarXDato(a2).insertarCiudad(listaCiudades.ObetenerPorIndiceObjeto(7),reg);
        listaRutas.BuscarXDato(a2).insertarCiudad(listaCiudades.ObetenerPorIndiceObjeto(8),reg);
        listaRutas.BuscarXDato(a2).insertarCiudad(listaCiudades.ObetenerPorIndiceObjeto(9),reg);
        listaRutas.BuscarXDato(a2).insertarCiudad(listaCiudades.ObetenerPorIndiceObjeto(10),reg);

        System.out.println(reg.toString());
        Ciudad c = reg.buscarCiudad(1);
        Lista<Ciudad> ccc = reg.obtenerCiudadesAdya(c);
        ccc.mostrarLista();
    }

    public void guardarFichero() {
        try {
            ObjectOutputStream escribiendoUsuarios = new ObjectOutputStream(new FileOutputStream("./archivos/usuarios.dat"));
            escribiendoUsuarios.writeObject(listaUsuarios);
            escribiendoUsuarios.close();
            ObjectOutputStream escribiendolistaChoferes = new ObjectOutputStream(new FileOutputStream("./archivos/choferes.dat"));
            escribiendolistaChoferes.writeObject(listaChoferes);
            escribiendolistaChoferes.close();
            ObjectOutputStream escribiendolistaRutas = new ObjectOutputStream(new FileOutputStream("./archivos/rutas.dat"));
            escribiendolistaRutas.writeObject(listaRutas);
            escribiendolistaRutas.close();
            ObjectOutputStream escribiendolistaBuses = new ObjectOutputStream(new FileOutputStream("./archivos/buses.dat"));
            escribiendolistaBuses.writeObject(listaBuses);
            escribiendolistaBuses.close();
            ObjectOutputStream escribiendolistaCiudades = new ObjectOutputStream(new FileOutputStream("./archivos/ciudades.dat"));
            escribiendolistaCiudades.writeObject(listaCiudades);
            escribiendolistaCiudades.close();
            ObjectOutputStream escribiendoRegion = new ObjectOutputStream(new FileOutputStream("./archivos/region.dat"));
            escribiendoRegion.writeObject(reg);
            escribiendoRegion.close();
        } catch (IOException e) {
            System.out.println("Calla mrd");
        }
    }
}
