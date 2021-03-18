/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.modelo;

import java.util.Scanner;

/**
 * Clase hija encargada de calcular el area y parametro de un circulo
 *
 * @author Juan Camilo Paez Beltran
 * @author Eison Andrei Morales Pardo
 * @since 1.0
 * @version 1.0.0
 */
public class Circulo extends figurasPlanas {
    /**
     * Variable encargada de alojar el valor arrojado por el usuario 
     */
    float radio;
    
    
    /**
     * Metodo encargado de solicitar los valores al usuario y capturarlos
     */
    @Override
    public void capturarMedidas() {
        
        System.out.println("Digitar el radio del circulo: ");
        radio = lector.nextFloat();
        
    }
    
    
    
    
    @Override
    public double calcularPerimetro() {
        
        perimetro = (2*Math.PI*radio);
        
        return perimetro; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularArea() {
        
        area = Math.PI*Math.pow(radio, 2);
        
        return area; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
