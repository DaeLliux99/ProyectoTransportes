package modelos;

import java.io.Serializable;

public class Ciudad implements Serializable{
    private int idCiudad;
    private String ciudad;

    public Ciudad(int ID_ciudad, String ciudad) {
        this.idCiudad = ID_ciudad;
        this.ciudad = ciudad;     
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

    public String toString() {
        return (getCiudad()+"-");
    }
}
