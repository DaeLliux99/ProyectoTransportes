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
            ObjectInputStream leyendoUsuarios = new ObjectInputStream(new FileInputStream("C:\\Users\\Carlos Esteban\\Desktop\\usuarios.dat"));
            listaUsuarios = (Lista) leyendoUsuarios.readObject();
            leyendoUsuarios.close();
            ObjectInputStream leyendoChoferes = new ObjectInputStream(new FileInputStream("C:\\Users\\Carlos Esteban\\Desktop\\choferes.dat"));
            listaChoferes = (Lista) leyendoChoferes.readObject();
            leyendoChoferes.close();
            ObjectInputStream leyendoRutas = new ObjectInputStream(new FileInputStream("C:\\Users\\Carlos Esteban\\Desktop\\rutas.dat"));
            listaRutas = (Lista) leyendoRutas.readObject();
            leyendoRutas.close();
            ObjectInputStream leyendoBuses = new ObjectInputStream(new FileInputStream("C:\\Users\\Carlos Esteban\\Desktop\\buses.dat"));
            listaBuses = (Lista) leyendoBuses.readObject();
            leyendoBuses.close();
            ObjectInputStream leyendoCiudades = new ObjectInputStream(new FileInputStream("C:\\Users\\Carlos Esteban\\Desktop\\ciudades.dat"));
            listaCiudades = (Lista) leyendoCiudades.readObject();
            leyendoCiudades.close();
            ObjectInputStream leyendoRegion = new ObjectInputStream(new FileInputStream("C:\\Users\\Carlos Esteban\\Desktop\\region.dat"));
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

        Bus B = new Bus("N35T0R",listaBuses.idControlador+1, 20, 80, C, a1);
        listaBuses.insertarFinal(B);
        Bus B2 = new Bus("L30N4RD0",listaBuses.idControlador+1, 15, 50, C2, a2);
        listaBuses.insertarFinal(B2);
        Bus B3 = new Bus("35T3B4N",listaBuses.idControlador+1, 25, 40);
        listaBuses.insertarFinal(B3);
        Bus B4 = new Bus("P4L0M1N0",listaBuses.idControlador+1, 30, 60);
        listaBuses.insertarFinal(B4);

        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Lima", 10));//0
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Huancayo", 20));//1
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Pichanaki", 30));//2
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Trujillo", 40));//3
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Puno", 50));//
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Cajamarca", 60));
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Arequipa", 70));
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Tarapoto", 80));
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Iquitos", 90));//8
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "Chiclayo", 100));//9
        listaCiudades.insertarFinal(new Ciudad(listaCiudades.longitud, "La libertad", 110));//10

        listaRutas.BuscarXDato(a1).ingresarCiudad(listaCiudades.ObetenerPorIndiceObjeto(0));
        listaRutas.BuscarXDato(a1).ingresarCiudad(listaCiudades.ObetenerPorIndiceObjeto(1));
        listaRutas.BuscarXDato(a1).ingresarCiudad(listaCiudades.ObetenerPorIndiceObjeto(2));
        listaRutas.BuscarXDato(a1).ingresarCiudad(listaCiudades.ObetenerPorIndiceObjeto(3));
        listaRutas.BuscarXDato(a1).ingresarCiudad(listaCiudades.ObetenerPorIndiceObjeto(4));
        listaRutas.BuscarXDato(a1).ingresarCiudad(listaCiudades.ObetenerPorIndiceObjeto(5));

        listaRutas.BuscarXDato(a2).ingresarCiudad(listaCiudades.ObetenerPorIndiceObjeto(6));
        listaRutas.BuscarXDato(a2).ingresarCiudad(listaCiudades.ObetenerPorIndiceObjeto(1));
        listaRutas.BuscarXDato(a2).ingresarCiudad(listaCiudades.ObetenerPorIndiceObjeto(7));
        listaRutas.BuscarXDato(a2).ingresarCiudad(listaCiudades.ObetenerPorIndiceObjeto(8));
        listaRutas.BuscarXDato(a2).ingresarCiudad(listaCiudades.ObetenerPorIndiceObjeto(9));
        listaRutas.BuscarXDato(a2).ingresarCiudad(listaCiudades.ObetenerPorIndiceObjeto(10));

        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(5));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(1));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(2));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(3));
        reg.agregarCiudad(listaCiudades.ObetenerPorIndiceObjeto(4));
        reg.agregarCamino(1, 4, 50);
        reg.agregarCamino(2, 3, 50);
        reg.agregarCamino(1, 3, 50);
        reg.agregarCamino(5, 1, 50);
        reg.agregarCamino(2, 4, 50);

        System.out.println(reg.toString());
        Ciudad c = reg.buscarCiudad(1);
        Lista<Ciudad> ccc = reg.obtenerCiudadesAdya(c);
        ccc.mostrarLista();
    }
    
    public void guardarFichero() {
        try {
            ObjectOutputStream escribiendoUsuarios = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Carlos Esteban\\Desktop\\usuarios.dat"));
            escribiendoUsuarios.writeObject(listaUsuarios);
            escribiendoUsuarios.close();
            ObjectOutputStream escribiendolistaChoferes = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Carlos Esteban\\Desktop\\choferes.dat"));
            escribiendolistaChoferes.writeObject(listaChoferes);
            escribiendolistaChoferes.close();
            ObjectOutputStream escribiendolistaRutas = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Carlos Esteban\\Desktop\\rutas.dat"));
            escribiendolistaRutas.writeObject(listaRutas);
            escribiendolistaRutas.close();
            ObjectOutputStream escribiendolistaBuses = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Carlos Esteban\\Desktop\\buses.dat"));
            escribiendolistaBuses.writeObject(listaBuses);
            escribiendolistaBuses.close();
            ObjectOutputStream escribiendolistaCiudades = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Carlos Esteban\\Desktop\\ciudades.dat"));
            escribiendolistaCiudades.writeObject(listaCiudades);
            escribiendolistaCiudades.close();
            ObjectOutputStream escribiendoRegion = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Carlos Esteban\\Desktop\\region.dat"));
            escribiendoRegion.writeObject(reg);
            escribiendoRegion.close();
        } catch (IOException e) {
            System.out.println("Calla mrd");
        }
    }
}
