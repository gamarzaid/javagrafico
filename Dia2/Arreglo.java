
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Arreglo {
    
    ArrayList<Integer> numeros = new ArrayList<>();

    public Arreglo() {
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }
    
    public void agregaValores(Integer numero){
        this.numeros.add(numero);
    }
    
    public void eliminaValores(Integer numero){
        this.numeros.remove(Integer.valueOf(numero));
    }
    
    public String imprimeValores(){
        return numeros.toString();
    }
    
}
