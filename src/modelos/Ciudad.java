package modelos;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sistema
 */
public class Ciudad {
    private int ID_ciudad;
    private String ciudad;
    private int distanciaSigteCiudad;
    
    public Ciudad(){
        
    }
    
    public Ciudad(int ID_ciudad, String ciudad, int distanciaSigteCiudad) {
        this.ID_ciudad = ID_ciudad;
        this.ciudad = ciudad;
        this.distanciaSigteCiudad = distanciaSigteCiudad;
    }

    public int getID_ciudad() {
        return ID_ciudad;
    }

    public void setID_ciudad(int ID_ciudad) {
        this.ID_ciudad = ID_ciudad;
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
