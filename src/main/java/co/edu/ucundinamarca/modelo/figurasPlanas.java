/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.modelo;

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
    float perimetro;
    /**
     * Variable encargada de alojar el valor del area de la figura geometrica
     */
    float area;
    /**
     * Variable encargada de alojar el numero de lados de la figura
     */
    byte numeroLados;
    
    
    
    /**
     * Metodo encargado de capturar las medidas de las figuras geométricas,
     * calcular y retornar el valor de su perímetro
     * @return El perimetro calculado
     */
    public float calcularPerimetro (){
    
    return perimetro;
    }
    
    /**
     * Metodo encargado de capturar las medidas de las figuras geométricas,
     * calcular y retornar el valor de su perímetro
     * @return El area calculada
     */
    public float calcularArea (){
    
    return area;
    }
}
