package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import estructuras.Lista;
import java.io.Serializable;
import nodos.*;

/**
 *
 * @author Leonardo
 */
public class Ruta implements Serializable {

    private int idRuta;
    private String salida;
    private String llegada;
    private float distanciaRuta = 0;

    private float precio = 0;

    Lista<Ciudad> ciudadesRuta = new Lista<>();

    public Ruta(int id) {
        idRuta = id;
    }
/*
    public Ruta(int ID_ruta, float precio) {
        this.idRuta = ID_ruta;
        this.precio = precio;
    }
*/
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //Metodos:
    public void ciudadesLista() {
        for (Ciudad c : ciudadesRuta) {
            System.out.println(c.toString());
        }
        System.out.println("");
    }

    public String obtenerPrimerCiudad() {
        return ciudadesRuta.obetenerPrimerObjeto().getCiudad();
    }

    public String obtenerUltimaCiudad() {
        return ciudadesRuta.obetenerUltimoObjeto().getCiudad();
    }

    public Ciudad Busqueda_Ciudad(String Ciudad_Buscada) {
        for (Ciudad c : ciudadesRuta) {
            if (c.getCiudad().equalsIgnoreCase(Ciudad_Buscada)) {
                return c;
            }
        }
        return null;
    }

    public void ingresarCiudad(Ciudad C) {
        ciudadesRuta.insertarFinal(C);
        precio = (float) (precio + C.getDistanciaSigteCiudad() * 0.5);
        distanciaRuta = distanciaRuta + C.getDistanciaSigteCiudad();
    }

    public String mostrarCiudadesRuta() {
        StringBuilder builder = new StringBuilder();
        for (Ciudad c : ciudadesRuta) {
            builder.append(c.getCiudad() + " - ");
            builder.append("\n");
        }
        return (builder.toString());
    }

    public String toString() {

        return ("\nId Ruta: " + this.getIdRuta()
                + "\n\tDistancia Ruta: " + this.distanciaRuta
                + "\n\tSalida: " + this.getSalida()
                + "\n\tDestino: " + getLlegada());

    }

    public String getRuta() {
        return ciudadesRuta.getListaString();
    }

}
