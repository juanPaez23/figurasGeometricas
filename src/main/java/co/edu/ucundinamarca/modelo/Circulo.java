/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.modelo;

/**
 * Clase hija encargada de calcular el area y parametro de un circulo
 *
 * @author Juan Camilo Paez Beltran
 * @author Eison Andrei Morales Pardo
 * @since 1.0
 * @version 1.0.0
 */
public class Circulo extends FigurasPlanas {
    /**
     * Variable encargada de alojar el valor ingresado por el usuario 
     */
    float radio;
    
    
    /**
     * Método sobreescrito de la clase padre
     */
    @Override
    public void capturarMedidas() {
        
        System.out.println("Digitar el radio del circulo: ");
        radio = lector.nextFloat();
        
    }
    
    
    /**
     * Método sobreescrito de la clase padre
     */
    @Override
    public double calcularPerimetro() {
        
        perimetro = (2*Math.PI*radio);
        
        return perimetro;
    }

    
    /**
     * Método sobreescrito de la clase padre
     */
    @Override
    public double calcularArea() {
        
        area = Math.PI*Math.pow(radio, 2);
        
        return area;
    }
    
    
    /**
     * Método encargado de capturar el valor de un ángulo y calcular 
     * sus correspondientes arco menor y mayor
     */
    public void calcularArcos (){
    
        double arcoMayor=0;
        double arcoMenor=0;
        byte decision;
        float angulo=0;
        
        System.out.println("¿Desea conocer el arco mayor y menor para un ángulo dentro de este circulo?\n 1).Si\t 2).No");
        decision = lector.nextByte();
        
        if(decision==1){
            System.out.println("Ingrese el valor del ángulo\n Nota: Recuerde que es un valor entre 1 y 359");
            angulo = lector.nextFloat();
            
            if(angulo<1 || angulo>359){
                System.out.println("¡¡Información incorrecta!!\n No podemos calcular los arcos a partir de la misma");
            }else{
            if(angulo>=180){
                arcoMayor = (perimetro * angulo) / 360;
                arcoMenor = perimetro - arcoMayor;
            }else{
                arcoMenor = (perimetro * angulo) / 360;
                arcoMayor = perimetro - arcoMenor;
            }
            }
        }  
        System.out.println("En este círculo para un ángulo de "+ angulo +"°\n Sus arcos son:\n Mayor: "+arcoMayor+"\n Menor: "+arcoMenor);
     }
    }
