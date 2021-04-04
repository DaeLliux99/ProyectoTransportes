package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import estructuras.Lista;
import nodos.*;

/**
 *
 * @author Sistema
 */
public class Ruta {

    private int idRuta;
    private String salida;
    private String llegada;
    private float distanciaRuta = 0;
    //private Bus bus;
    private float precio;
    
    
    Lista<Ciudad> ciudadesRuta = new Lista<>();

    public Ruta() {
    }

    public Ruta(int ID_ruta/*, Bus bus*/, float precio) {
        this.idRuta = ID_ruta;
        this.precio = precio;
        //this.salida = ciudadesRuta.obetenerPrimerObjeto().getCiudad();
        //this.llegada = ciudadesRuta.obetenerUltimoObjeto().getCiudad();       
        //this.bus = bus;
/*
        Lista<Ciudad> temp = ruta1;
        Nodo<Ciudad> temp2 = temp.ObetenerPrimerNodo();
        while (temp2 != null) {
            distanciaRuta = distanciaRuta + temp2.valor.getDistanciaSigteCiudad();
            temp2 = temp2.siguiente;
        }*/
    }

    

    public Ruta(int ID_ruta, Lista<Ciudad> ciudades_Ruta/*, Bus bus*/, float precio) {
        this.idRuta = ID_ruta;
        this.precio = precio;
        this.salida = ciudades_Ruta.obetenerPrimerObjeto().getCiudad();
        this.llegada = ciudades_Ruta.obetenerUltimoObjeto().getCiudad();
        this.ciudadesRuta = ciudades_Ruta;
        //this.bus = bus;

        Lista<Ciudad> temp = ciudades_Ruta;
        Nodo<Ciudad> temp2 = temp.ObetenerPrimerNodo();
        while (temp2 != null) {
            distanciaRuta = distanciaRuta + temp2.valor.getDistanciaSigteCiudad();
            temp2 = temp2.siguiente;
        }
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String Salida) {
        this.salida = Salida;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public Lista<Ciudad> getCiudadesRuta() {
        return ciudadesRuta;
    }

    public void setCiudadesRuta(Lista<Ciudad> ruta1) {
        this.ciudadesRuta = ruta1;
    }

    public void setDistanciaRuta(float distanciaRuta) {
        this.distanciaRuta = distanciaRuta;
    }
    
    public float getDistanciaRuta() {
        return distanciaRuta;
    }
/*
    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
*/
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

    
    //Metodos:
    public void ciudadesLista() {
        Lista<Ciudad> temp = ciudadesRuta;
        Nodo<Ciudad> temp2 = temp.ObetenerPrimerNodo();
        System.out.print("Ciudad: ");
        while (temp2 != null) {
            System.out.print(temp2.valor.toString());
            temp2 = temp2.siguiente;
        }
        System.out.println("");
    }
    
    public String mostrarCiudadesRuta() {
        Lista<Ciudad> temp = ciudadesRuta;
        Nodo<Ciudad> temp2 = temp.ObetenerPrimerNodo();
        System.out.print("Ciudad: ");
        String ciudad = "";
        while (temp2 != null) {
            ciudad = ciudad+ " "+ temp2.valor.toString();
            //System.out.print(temp2.valor.toString());
            temp2 = temp2.siguiente;
        }
        System.out.println("");
        return ciudad;
    }
    
    
    public String obtenerPrimerCiudad(){
        return ciudadesRuta.obetenerPrimerObjeto().getCiudad();
    }
    
    public String obtenerUltimaCiudad(){
        return ciudadesRuta.obetenerUltimoObjeto().getCiudad();
    }
    

    /*
    public Ciudad Busqueda_Ciudad(String Ciudad_Buscada) {
        boolean encontro = false;
        Nodo<Ciudad> temp = ruta1.ObetenerPrimerNodo();
        while (temp != null && !encontro) {
            if ((temp.valor.getCiudad()).equals(Ciudad_Buscada)) {
                encontro = true;
                System.out.println("Se encontro ");
            }
            temp = temp.siguiente;
        }
        if (encontro) {
            return temp.valor;
        } else {
            System.out.println("\nNo se ha encontrado la ciudad en los archivos ....");
            return null;
        }

    }
     */
    public Ciudad Busqueda_Ciudad(String Ciudad_Buscada) {
        boolean encontro = false;
        Nodo<Ciudad> temp = ciudadesRuta.ObetenerPrimerNodo();
        Ciudad c = null;
        while (temp != null && !encontro) {
            if (temp.valor.getCiudad().equals(Ciudad_Buscada)) {
                encontro = true;
                c = temp.valor;
            }
            temp = temp.siguiente;
        }
        if (encontro == true) {
            return c;
        } else {
            return null;
        }
    }
    
    public void ingresarCiudad(Ciudad C){
        ciudadesRuta.insertarInicio(C);
    } 

    public String toString() {

        return ("\nId Ruta: " + this.getIdRuta()
                + "\n\tDistancia Ruta: " + this.distanciaRuta
                + "\n\tSalida: " + this.getSalida()
                + "\n\tDestino: " + getLlegada());

    }

}
