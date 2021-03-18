/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.modelo;

import java.util.Scanner;

/**
 *Clase padre encargada de realizar operaciones sobre figuras geometricas planas
 *tales como hallar su perímetro y su área.
 * 
 * @author Juan Camilo Paez Beltran
 * @author Eison Andrei Morales Pardo
 * @since 1.0
 * @version 1.0.0
 */

public class figurasPlanas {
    
    /**
     * Variable encargada de alojar el valor del perimetro de la figura geometrica
     */
    double perimetro;
    /**
     * Variable encargada de alojar el valor del area de la figura geometrica
     */
    double area;
    /**
     * Variable encargada de alojar el numero de lados de la figura
     */
    byte numeroLados;
    
    /**
     * Objeto de la clase Scanner encargado de capturar los valores ingresados por el usuario
     */
    Scanner lector = new Scanner(System.in);
    
    /**
     * Metodo encargado de solicitar las medidas de las figuras geométricas al usuario
     * y almacenarlas en su respectiva variable
     */
    public void capturarMedidas (){
    
    }
    
    /**
     * Metodo encargado calcular y retornar el valor del perímetro de la figura
     * @return El perimetro calculado
     */
    public double calcularPerimetro (){
    
    return perimetro;
    }
    
    /**
     * Metodo encargado de calcular y retornar el valor del área de la figura
     * @return El area calculada
     */
    public double calcularArea (){
    
    return area;
    }
}
