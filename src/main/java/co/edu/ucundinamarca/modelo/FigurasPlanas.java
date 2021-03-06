/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.modelo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *Clase padre encargada de realizar operaciones sobre figuras geometricas planas
 *tales como hallar su perímetro y su área.
 * 
 * @author Juan Camilo Paez Beltran
 * @author Eison Andrei Morales Pardo
 * @since 1.0
 * @version 1.1.0
 */

public abstract class FigurasPlanas implements IFuncionAuxiliar {
    
    /**
     * Variable encargada de alojar el valor del perimetro de la figura geometrica
     */
    private double perimetro;
    /**
     * Variable encargada de alojar el valor del area de la figura geometrica
     */
    private double area;
    /**
     * Variable encargada de alojar el valor del lado de la figura geometrica
     */
    private float medida;
    
    /**
     * Objeto de la clase Scanner encargado de capturar los valores ingresados por el usuario
     */
    Scanner lector = new Scanner(System.in);

    /**
     * Objeto encargado de darle formato a los números con valores decimales
     */
    DecimalFormat formatoDecimal = new DecimalFormat("#0.000");
    
    /**
     * Constructor de la clase FigurasPlanas
     */
    public FigurasPlanas() {
    }

    
    /**
     * Constructor de la clase FigurasPlanas
     * @param perimetro
     * @param area 
     */
    public FigurasPlanas(double perimetro, double area) {
        this.perimetro = perimetro;
        this.area = area;
    }
    
    
    
    /**
     * Método usado para capturar las medidas necesarias para cada figura geométrica plana
     */
    public void capturarMedidas (){
    
        System.out.println("Digitar la medida (en centimetros): ");
        medida = lector.nextFloat();
    }
    
    
    /**
     * Método abstracto de implementación única en las clases hija usado para calcular perímetro
     * @return El perimetro calculado
     */
    public abstract double calcularPerimetro ();
    
    /**
     * Método abstracto de implementación única en las clases hija usado para calcular área
     * @return El area calculada
     */
    public abstract double calcularArea ();

    /**
     * Método para leer la variable privada perimetro
     * @return Valor de perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * Método para leer la variable privada area
     * @return Valor de area
     */
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

      /**
     * Método para leer la variable privada medida
     * @return Valor de medida
     */
    public float getMedida() {
        return medida;
    }

    public void setMedida(float medida) {
        this.medida = medida;
    }

 
    
       
}
