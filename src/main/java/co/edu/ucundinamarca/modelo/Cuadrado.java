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
 * @version 1.1.0
 */
public class Cuadrado extends FigurasPlanas {
    
    /**
     * Variable encargada de alojar el valor ingresado por el usuario 
     */
    private float lado;

    /**
     * Constructor de la clase hija Cuadrado
     * @param lado
     * @param perimetro
     * @param area 
     */
    public Cuadrado(float lado, double perimetro, double area) {
        
        super(perimetro, area);
        this.lado = lado;
    }

    
    /**
     * Método usado para calcular el perímetro del cuadrado
     */
    @Override
    public double calcularPerimetro() {

        lado = super.getMedida();
        super.setPerimetro(4 * lado);

        return super.getPerimetro();
    }


    /**
     * Método usado para calcular el área del cuadrado
     */
    @Override
    public double calcularArea() {

        super.setArea(Math.pow(lado, 2));

        return super.getArea();
    }

    /**
     * Método encargado de calcular el valor de las diagonales del cuadrado
     */
    public void calcularDiagonales (){
        double diagonal;

        diagonal = Math.sqrt(2)* lado;

        System.out.println("El valor de las diagonales del cuadrado ingresado es: " + formatoDecimal.format(diagonal) + " cm");
    }
    
    /**
     * Método encargado de imprimir la descripción del cuadrado
    */
    @Override
    public void imprimir() {
        System.out.println("\n Lado del cuadrado: "+lado+" cm");
    }
}