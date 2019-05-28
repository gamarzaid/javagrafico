/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
import java.util.Scanner;
public class MainEstudiante {
    public static void main(String[] args) {
        String nombre, cuenta;
        char genero;
        
        Estudiante alumno1 = new Estudiante();
        alumno1.setNombre("Luis Octavio");
        alumno1.setCuenta("12345");
        alumno1.setGenero('H');
        System.out.println(alumno1.toString());
        
        Estudiante alumno2 = new Estudiante("Gaby", "6789", 'M');
        System.out.println(alumno2);
        
    }
}
