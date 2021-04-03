/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

/**
 * 
 * @author Carlos Esteban
 */
public class Alumno implements Comparable <Alumno>{
    private String nombre;
    private String DNI;
    private int codigo;

    public Alumno(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public Alumno(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return (" Alumno: "+ this.nombre +
                " Codigo: "+ this.codigo);
    }

    @Override
    public int compareTo(Alumno o) {
        if (this.codigo < o.codigo) return -1;
        if (this.codigo > o.codigo) return 1;
        return 0;
    }
}
