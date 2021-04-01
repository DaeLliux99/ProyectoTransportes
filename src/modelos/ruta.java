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
public class ruta {
    private int ID_ruta;
    private float distancia;
    private String Salida;
    private String LLegada;
    Lista<ciudad> ruta1 = new Lista(); 
    
    public ruta() {
        this.ID_ruta = 1;
    }
    
    public ruta(int ID_ruta, float distancia, String Salida, String LLegada, Lista<ciudad> ruta1) {
        this.ID_ruta = ID_ruta;
        this.distancia = distancia;
        this.Salida = Salida;
        this.LLegada = LLegada;
        this.ruta1 = ruta1;
    }


    public int getID_ruta() {
        return ID_ruta;
    }

    public void setID_ruta(int ID_ruta) {
        this.ID_ruta = ID_ruta;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
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

    public Lista<ciudad> getRuta1() {
        return ruta1;
    }

    public void setRuta1(Lista<ciudad> ruta1) {
        this.ruta1 = ruta1;
    }

    
    /*
    public ciudad getCiu() {
        return ciu;
    }

    public void setCiu(ciudad ciu) {
        this.ciu = ciu;
    }
    */
    
    public void ciudadesLista(){
        Lista<ciudad> temp = ruta1; 
        Nodo temp2 = temp.ObetenerNodoB();
        System.out.print("Ciudad: ");
        while(temp2 != null){
            System.out.print(temp2.valor.toString());
            temp2 = temp2.siguiente;
        }
        System.out.println("");
    }
    
    
    //METODO
    public void ingresarCiudad(ciudad ciudad1){
        ruta1.insertarFinal(ciudad1);
    }
    
    
    public String toString() {
        
        return ("\nDistancia Ruta: "+ getDistancia()+
                "\nSalida: "+getSalida()+
                "\nDestino: "+getLLegada());
        
    }
   
}
