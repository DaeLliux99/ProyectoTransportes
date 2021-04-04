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
    
    private int ID_ruta;
    private String Salida;
    private String LLegada;
    private float distancia_Ruta = 0;
    private Bus bus;
    private float precio;
       
    Lista<Ciudad> ciudades_Ruta = new Lista<>();

    public Ruta() {
    }

    public Ruta(int ID_ruta, Bus bus, float precio) {
        this.ID_ruta = ID_ruta;
        this.precio = precio;
        //this.Salida = ciudades_Ruta.obetenerPrimerObjeto().getCiudad();
        //this.LLegada = ciudades_Ruta.obetenerUltimoObjeto().getCiudad();       
        this.bus = bus;
/*
        Lista<Ciudad> temp = ruta1;
        Nodo<Ciudad> temp2 = temp.ObetenerPrimerNodo();
        while (temp2 != null) {
            distancia_Ruta = distancia_Ruta + temp2.valor.getDistanciaSigteCiudad();
            temp2 = temp2.siguiente;
        }*/
    }

    

    public Ruta(int ID_ruta, Lista<Ciudad> ciudades_Ruta, Bus bus, float precio) {
        this.ID_ruta = ID_ruta;
        this.precio = precio;
        this.Salida = ciudades_Ruta.obetenerPrimerObjeto().getCiudad();
        this.LLegada = ciudades_Ruta.obetenerUltimoObjeto().getCiudad();
        this.ciudades_Ruta = ciudades_Ruta;
        this.bus = bus;

        Lista<Ciudad> temp = ciudades_Ruta;
        Nodo<Ciudad> temp2 = temp.ObetenerPrimerNodo();
        while (temp2 != null) {
            distancia_Ruta = distancia_Ruta + temp2.valor.getDistanciaSigteCiudad();
            temp2 = temp2.siguiente;
        }
    }

    public int getID_ruta() {
        return ID_ruta;
    }

    public void setID_ruta(int ID_ruta) {
        this.ID_ruta = ID_ruta;
    }

    public String getSalida() {
        return Salida;
    }

    public void setSalida(String Salida) {
        this.Salida = Salida;
    }

    public String getLLegada() {
        return LLegada;
    }

    public void setLLegada(String LLegada) {
        this.LLegada = LLegada;
    }

    public Lista<Ciudad> getCiudades_Ruta() {
        return ciudades_Ruta;
    }

    public void setCiudades_Ruta(Lista<Ciudad> ruta1) {
        this.ciudades_Ruta = ruta1;
    }

    public void setDistancia_Ruta(float distancia_Ruta) {
        this.distancia_Ruta = distancia_Ruta;
    }
    
    public float getDistancia_Ruta() {
        return distancia_Ruta;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

    
    //Metodos:
    public void ciudadesLista() {
        Lista<Ciudad> temp = ciudades_Ruta;
        Nodo<Ciudad> temp2 = temp.ObetenerPrimerNodo();
        System.out.print("Ciudad: ");
        while (temp2 != null) {
            System.out.print(temp2.valor.toString());
            temp2 = temp2.siguiente;
        }
        System.out.println("");
    }
    
    public String mostrarCiudadesRuta() {
        Lista<Ciudad> temp = ciudades_Ruta;
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
        return ciudades_Ruta.obetenerPrimerObjeto().getCiudad();
    }
    
    public String obtenerUltimaCiudad(){
        return ciudades_Ruta.obetenerUltimoObjeto().getCiudad();
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
        Nodo<Ciudad> temp = ciudades_Ruta.ObetenerPrimerNodo();
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
        ciudades_Ruta.insertarInicio(C);
    } 

    public String toString() {

        return ("\nId Ruta: " + this.getID_ruta()
                + "\n\tDistancia Ruta: " + this.distancia_Ruta
                + "\n\tSalida: " + this.getSalida()
                + "\n\tDestino: " + getLLegada());

    }

}
