
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
public class ArregloEnteros {
    public static void main(String[] args) {
        //Declaracion del arraylist
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        //Añadir valores
        numeros.add(5);
        numeros.add(10);
        numeros.add(1);
        numeros.add(7);
        numeros.add(4);
        //Imprimir arraylist
        System.out.println(numeros);
        //Imprimir con for
        for (Integer i : numeros) {
            System.out.println(i);
        }
        //Añadir un valor en una posición
        numeros.add(2, 20);
        System.out.println(numeros);
        //Tamaño del arreglo
        System.out.println(numeros.size());
        //Borrar un elemento del arreglo
        numeros.remove(5);
        System.out.println(numeros);
        //Borrar un elemento del arreglo
        numeros.remove(Integer.valueOf(20));
        System.out.println(numeros);
    }
}
