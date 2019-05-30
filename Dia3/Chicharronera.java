/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Chicharronera {
    private double a;
    private double b;
    private double c;

    public Chicharronera() {
    }

    public Chicharronera(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public String CalculaRaices(){
        double discriminante = b * b - 4.0 * a* c;
        String resultado = "";
        if(discriminante > 0.0){
            double x1 = (-b + Math.pow(discriminante, 0.5))/(2.0 *a);
            double x2 = (-b - Math.pow(discriminante, 0.5))/(2.0 *a);
            resultado = String.format("Las raíces son x1 = %.4f y x2 = %.4f", x1, x2);
        }
        else if(discriminante == 0.0){
            double x1 = -b / (2.0 * a);
            resultado = "Solución única x1 = " + x1;
        }
        else{
            resultado = "No tiene solución en los reales.";
        }
        return resultado;
    }
    
}
