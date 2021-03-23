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
 * @version 1.1.0
 */
public class Circulo extends FigurasPlanas {
     /**
     * Variable encargada de alojar el valor ingresado por el usuario 
     */
        private float radio;
        
    /**
     * Constructor de la clase hija Circulo
     * @param radio
     * @param perimetro
     * @param area 
     */   
    public Circulo(float radio, double perimetro, double area) {
        super(perimetro, area);
        this.radio = radio;
    }
        
     /**
     * Objeto encargado de alojar la descripcion de los arcos del circulo calculados
     */
    StringBuilder arcosCirculo = new StringBuilder();
  
    /**
     * Método usado para calcular el perímetro del círculo
     */


    @Override
    public double calcularPerimetro() {
         radio = super.getMedida();
        super.setPerimetro(2*Math.PI*radio);
        
        return super.getPerimetro();
    }

    
    /**
     * Método usado para calcular el área del círculo
     */
    @Override
    public double calcularArea() {
        
        super.setArea(Math.PI*Math.pow(radio, 2));
        
        return super.getArea();
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
                arcoMayor = (super.getPerimetro() * angulo) / 360;
                arcoMenor = super.getPerimetro() - arcoMayor;
            }else{
                arcoMenor = (super.getPerimetro() * angulo) / 360;
                arcoMayor = super.getPerimetro() - arcoMenor;
            }
            }
        }  
        if(angulo != 0){
        arcosCirculo.append("En este círculo para un ángulo de ").append(angulo).append("°\n Sus arcos son:\n Mayor: ").append(formatoDecimal.format(arcoMayor)).append(" cm\n Menor: ").append(formatoDecimal.format(arcoMenor)).append(" cm");
        }else
            arcosCirculo.append("No se calcularon arcos");
        }

    /**
     * Método encargado de imprimir la descripción del cálculo de los arcos mayor y menor del círculo
    */
    @Override
    public void imprimir() {
        System.out.println(arcosCirculo.toString());
        System.out.println("\n Radio: "+radio+" cm");
    }

 
    }
