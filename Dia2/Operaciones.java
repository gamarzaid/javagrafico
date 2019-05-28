/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Operaciones {
    private double num1;
    private double num2;
    private double resultado;

    public Operaciones() {
        this.num1 = 0.0;
        this.num2 = 0.0;
        this.resultado = 0.0;
    }

    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double suma(double n1, double n2){
        return n1+n2;
    }
    
    public double resta(double n1, double n2){
        return n1-n2;
    }
    
    public double multiplicacion(double n1, double n2){
        return n1*n2;
    }
    
    public double division(double n1, double n2){
        try{
            resultado = n1 / n2;
        }
        catch(ArithmeticException e){
            System.out.println("No se permite división entre cero.");
        }
        return resultado;
    }
    
    
    
    
    
}
