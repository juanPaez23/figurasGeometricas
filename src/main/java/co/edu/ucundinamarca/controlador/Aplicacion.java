/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.controlador;

import co.edu.ucundinamarca.modelo.Circulo;



/**
 * Clase encargada de realizar la ejecución del programa.
 * 
 * @author Eison Andrei Morales Pardo
 * @author Juan Camilo Páez Beltran 
 * @since 1.0
 * @version 1.0.0
 */

public class Aplicacion {
    /**
     * Método encargado de ejecutar el programa
     * @param args 
     */
    public static void main(String[] args) {
      
        Circulo objeto1= new Circulo();
        
        objeto1.capturarMedidas();
        System.out.println("Su perimetro es: "+objeto1.calcularPerimetro());
        System.out.println("Su area es: "+objeto1.calcularArea());
    }}
