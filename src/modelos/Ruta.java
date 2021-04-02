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
    Lista<Ciudad> ruta1 = new Lista();

    public Ruta() {
    }

    public Ruta(int ID_ruta, Lista<Ciudad> ruta1) {
        this.ID_ruta = ID_ruta;

        this.Salida = ruta1.obetenerPrimerObjeto().getCiudad();
        this.LLegada = ruta1.obetenerUltimoObjeto().getCiudad();
        this.ruta1 = ruta1;

        Lista<Ciudad> temp = ruta1;
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

    public Lista<Ciudad> getRuta1() {
        return ruta1;
    }

    public void setRuta1(Lista<Ciudad> ruta1) {
        this.ruta1 = ruta1;
    }

    public float getDistancia_Ruta() {
        return distancia_Ruta;
    }

    //Metodos:
    public void ciudadesLista() {
        Lista<Ciudad> temp = ruta1;
        Nodo<Ciudad> temp2 = temp.ObetenerPrimerNodo();
        System.out.print("Ciudad: ");
        while (temp2 != null) {
            System.out.print(temp2.valor.toString());
            temp2 = temp2.siguiente;
        }
        System.out.println("");
    }

    public Ciudad Busqueda_Ciudad(String Ciudad_Buscada) {
        boolean encontro = false;
        Nodo<Ciudad> temp = ruta1.ObetenerPrimerNodo();
        while (temp != null && !encontro) {
            if (temp.valor.getCiudad() == Ciudad_Buscada) {
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

    public String toString() {

        return ("\nId Ruta: " + this.getID_ruta()
                + "\n\tDistancia Ruta: " + this.distancia_Ruta
                + "\n\tSalida: " + this.getSalida()
                + "\n\tDestino: " + getLLegada());

    }

}
