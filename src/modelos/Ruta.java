package modelos;

import estructuras.Lista;
import java.io.Serializable;
import nodos.*;

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

    public void insertarCiudad(Ciudad C, Region reg) {
        Ciudad ultimo = ciudadesRuta.obetenerUltimoObjeto();
        ciudadesRuta.insertarFinal(C);
        if (ciudadesRuta.longitud > 1) {
            precio = (float) (precio + reg.obtenerDistancia(ultimo, C) * 0.06);
            distanciaRuta = distanciaRuta + reg.obtenerDistancia(ultimo, C);
        }
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
