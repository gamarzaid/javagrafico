/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Estudiante {
    
    private String nombre;
    private String cuenta;
    private char genero;
    
    public Estudiante(){
        this.nombre = "";
        this.cuenta = "";
        this.genero = ' ';
    }
    
    public Estudiante(String nombre, String cuenta, char genero){
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.genero = genero;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setCuenta(String cuenta){
        this.cuenta = cuenta;
    }
    
    public String getCuenta(){
        return cuenta;
    }
    
    public void setGenero(char genero){
        this.genero = genero;
    }
    
    public char getGenero(){
        return genero;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", cuenta=" + cuenta + ", genero=" + genero + '}';
    }
    
}
