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
        this.bus = bus;
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
        for (Ciudad c: ciudades_Ruta) {
            System.out.println(c.toString());
        }
        System.out.println("");
    }    
    
    public String obtenerPrimerCiudad(){
        return ciudades_Ruta.obetenerPrimerObjeto().getCiudad();
    }
    
    public String obtenerUltimaCiudad(){
        return ciudades_Ruta.obetenerUltimoObjeto().getCiudad();
    }
    
    public Ciudad Busqueda_Ciudad(String Ciudad_Buscada) {
        for (Ciudad c: ciudades_Ruta) {
            if (c.getCiudad().equals(Ciudad_Buscada)) {
                return c;
            }
        }
        return null;
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
