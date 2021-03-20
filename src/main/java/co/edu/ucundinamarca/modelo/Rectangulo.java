/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.modelo;

/**
 * Clase hija encargada de calcular el area y parametro de un rectangulo
 *
 * @author Juan Camilo Paez Beltran
 * @author Eison Andrei Morales Pardo
 * @since 1.0
 * @version 1.0.0
 */
public class Rectangulo extends FigurasPlanas {
    /**
     * Variable encargada de alojar los valores ingresados por el usuario 
     */
    float ladoLargo;
    float ladoCorto;
    
    
    /**
     * Método encargado de capturar las medidas de los dos lados opuestos del rectángulo
     */
    @Override
    public void capturarMedidas() {
        System.out.println("Por favor digitar las medidas del lado largo y corto del rectangulo (en centimetros)");
        System.out.println("Digitar el lado más largo del rectángulo: ");
        ladoLargo = lector.nextFloat();
        System.out.println("Digitar el lado más corto del rectángulo: ");
        ladoCorto = lector.nextFloat();
    }
    
    
    /**
     * Método usado para calcular el perímetro del rectángulo
     */
    @Override
    public double calcularPerimetro() {
        
        super.setPerimetro(2 * (ladoCorto + ladoLargo));
        
        return super.getPerimetro();
    }

    
    /**
     * Método usado para calcular el área del rectángulo
     */
    @Override
    public double calcularArea() {
        
        super.setArea(ladoCorto * ladoLargo);
        
        return super.getArea();
    }
    
    
    /**
     * Método encargado de calcular el valos de las diagonales del rectángulo
     */
    public void calcularDiagonales (){
        
        double diagonal;
        diagonal = Math.sqrt(Math.pow(ladoCorto,2) + Math.pow(ladoLargo,2));
        
        System.out.println("El valor de las diagonales del rectángulo ingresado es: " + formatoDecimal.format(diagonal) + " cm");
    }
    }
