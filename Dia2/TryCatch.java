/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class TryCatch {
    public static void main(String[] args) {
        int num1, num2, resultado;
        
        try{
            num1 = 10;
            num2 = 0;

            resultado = num1 / num2;
            System.out.println(resultado);
        }
        catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println("No se puede dividir entre cero!!!");
        }
    }
    
}
