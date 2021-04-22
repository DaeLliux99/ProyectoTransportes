package modelos;

import java.io.Serializable;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sistema
 */
public class Ciudad implements Serializable{
    private int idCiudad;
    private String ciudad;
    private int distanciaSigteCiudad;
    
    public Ciudad(){
        
    }
    
    public Ciudad(int ID_ciudad, String ciudad, int distanciaSigteCiudad) {
        this.idCiudad = ID_ciudad;
        this.ciudad = ciudad;
        this.distanciaSigteCiudad = distanciaSigteCiudad;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getDistanciaSigteCiudad() {
        return distanciaSigteCiudad;
    }

    public void setDistanciaSigteCiudad(int distanciaSigteCiudad) {
        this.distanciaSigteCiudad = distanciaSigteCiudad;
    }

    public String toString() {
        return (getCiudad()+"-");
    }
}
