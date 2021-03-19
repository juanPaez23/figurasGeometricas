/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.modelo;

/**
 *Clase hija encargada de realizar operaciones sobre las medidas del triangulo
 *tales como hallar su perímetro, área y clasificación.
 * 
 * @author Juan Camilo Paez Beltran
 * @author Eison Andrei Morales Pardo
 * @since 1.0
 * @version 1.0.0
 */

public class Triangulo extends FigurasPlanas{
    
    /**
     * Variables encargadas de almacenar el valor de los lados del triángulo
     */
    float ladoA;
    float ladoB;
    float ladoC;
    
    
    /**
     * Objeto encargado de almacenar la clasificación del triángulo
     */
    StringBuilder clasificacion=new StringBuilder();

    
    /**
     * Método usado para capturar las medidas de los lados del triángulo
     */
    @Override
    public void capturarMedidas() {
        
        System.out.println("Ingrese el valor del primer lado: ");
        ladoA = lector.nextFloat();
        System.out.println("Ingrese el valor del segundo lado: ");
        ladoB = lector.nextFloat();
        System.out.println("Ingrese el valor del tercer lado: ");
        ladoC = lector.nextFloat();
    }
    
    
    /**
     * Método usado para calcular el área del triángulo
     */
    @Override
    public double calcularArea(){
        float semiperimetro;
        
        //Cálculo del área del triángulo haciendo uso de la fórmula de Herón
        semiperimetro = (ladoA + ladoB + ladoC) / 2;
        super.setArea(Math.sqrt(semiperimetro*(semiperimetro-ladoA)*(semiperimetro-ladoB)*(semiperimetro-ladoC)));
        
        return super.getArea();
    }

    
    /**
     * Método usado para calcular el perímetro del triángulo
     */
    @Override    
    public double calcularPerimetro() {
        
        super.setPerimetro(ladoA + ladoB + ladoC);
        
        return super.getPerimetro();
    }

    
    /**
     * Método encargado de determinar la clasificacion del triangulo segun el valor de 
     * los lados ingresados por el usuario
     * @return La clasificacion a la que pertenece el triangulo
     */
    public StringBuilder determinarClasificacion() {
        if((ladoA==ladoB)&&(ladoA==ladoC)){
            clasificacion.append("Equilátero");
        }else{
            if((ladoA==ladoB)||(ladoA==ladoC)||(ladoB==ladoC)){
                clasificacion.append("Isósceles");
            }else{
                clasificacion.append("Escaleno");
            }
        }

        return clasificacion;
    }
    
    
}
