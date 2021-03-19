/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.modelo;

/**
 * Clase hija encargada de calcular el area y parametro de un cuadrado
 *
 * @author Juan Camilo Paez Beltran
 * @author Eison Andrei Morales Pardo
 * @since 1.0
 * @version 1.0.0
 */
public class Cuadrado extends FigurasPlanas {
    /**
     * Variable encargada de alojar el valor ingresado por el usuario 
     */
    float lado;
    
    
    /**
     * Método sobreescrito de la clase padre
     */
    @Override
    public void capturarMedidas() {
        
        System.out.println("Digitar la medida del lado del cuadrado (en centimetros): ");
        lado = lector.nextFloat();
        
    }
    
    
    /**
     * Método sobreescrito de la clase padre
     */
    @Override
    public double calcularPerimetro() {
        
        perimetro = 4 * lado;
        
        return perimetro;
    }

    
    /**
     * Método sobreescrito de la clase padre
     */
    @Override
    public double calcularArea() {
        
        area = Math.pow(lado, 2);
        
        return area;
    }
    
    /**
     * Método encargado de calcular el valos de las diagonales del cuadrado
     */
    public void calcularDiagonales (){
        double diagonal;
        
        diagonal = Math.sqrt(2)* lado;
        
        System.out.println("El valor de las diagonales del cuadrado ingresado es: " + diagonal + "cm^2");
    }
  }
