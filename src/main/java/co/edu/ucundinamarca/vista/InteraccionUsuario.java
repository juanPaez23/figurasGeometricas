/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.vista;

import co.edu.ucundinamarca.modelo.Circulo;
import co.edu.ucundinamarca.modelo.Cuadrado;
import co.edu.ucundinamarca.modelo.FigurasPlanas;
import co.edu.ucundinamarca.modelo.IFuncionAuxiliar;
import co.edu.ucundinamarca.modelo.Rectangulo;
import co.edu.ucundinamarca.modelo.Triangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Clase encargada de interactuar con el usuario y ejecutar las clases pertenecientes al paquete "Modelo"
 * @author Eison Andrei Morales Pardo
 * @author Juan Camilo Páez Beltran 
 * @since 1.0
 * @version 1.0.4
 */
public class InteraccionUsuario implements IFuncionAuxiliar{
    
    /**
     * Objeto de la clase Scanner encargado de capturar los valores ingresados por el usuario
     */
    Scanner lector = new Scanner(System.in);
    /**
     * Objeto encargado de darle formato a los números con valores decimales
     */
    DecimalFormat formatoDecimal = new DecimalFormat("#0.000");
    
    Circulo circulo = new Circulo();
    Cuadrado cuadrado = new Cuadrado();
    Rectangulo rectangulo = new Rectangulo();
    Triangulo triangulo = new Triangulo();
    
    /**
     * Metodo encargado para realizar el menu para la interaccion con el usuario.
     */
    @Override
    public void imprimir() {
        
        byte opcion; 
        byte s=0;
        System.out.println("Bienvenidos");
        System.out.println("Este programa calcula el área y perímetro de las figuras geométricas (Circulo, Cuadrado, Rectangulo, Triangulo)");
        do{
        System.out.println("Escoge una opcion:\n\t 1.Hacer el calculo del circulo.\n\t 2.Hacer el calculo del cuadrado.\n\t 3.Hacer el calculo del rectangulo.\n\t 4.Hacer el calculo triangulo.\n\t 5.Imprimir las últimas operaciones realizadas sobre cada figura.");
        opcion = lector.nextByte();
         //Se hace una funcion switch para realizar un menu para que el usuario tenga iteraccion y pueda escoger una opcion
        switch(opcion){
        case 1 :
            imprimirCirculo();
               break;
        case 2 :
            ImprimirCuadrado();
               break;
        case 3: 
            imprimirRectangulo();
               break;   
        case 4: 
            imprimirTriangulo();
               break; 
        case 5: 
            imprimirTodasLasFiguras();
               break; 
        default:
               System.out.println("Opcion desconocida, Por favor vuelve a ingresar otra opcion");
        break;
       }
         System.out.println("\n\t ¿Deseas escoger otra opción? \n\t\t 1.Si.\n\t\t 2.No.  ");  
         s=lector.nextByte();
      } while (s==1);
    }
        
    /**
     * Metodo que se encarga de imprimir las funciones de la clase Circulo.
     */
    public void imprimirCirculo(){
    
            System.out.println("Ingresa el radio del circulo");
            circulo.capturarMedidas();
            System.out.println("El resultado del perimetro es: "+formatoDecimal.format(circulo.calcularPerimetro())+" cm");
            System.out.println("El resultado del area es: "+formatoDecimal.format(circulo.calcularArea())+ " cm^2");
            circulo.calcularArcos();
            circulo.imprimir();
    }
    
    /**
     * Metodo que se encarga de imprimir las funciones de la clase Cuadro.
     */
    public void ImprimirCuadrado(){
    
            System.out.println("Por favor digitar las medidas del lado del cuadrado");
            cuadrado.capturarMedidas();
            System.out.println("El resultado del perimetro es: "+formatoDecimal.format(cuadrado.calcularPerimetro())+" cm");
            System.out.println("El resultado del area es: "+formatoDecimal.format(cuadrado.calcularArea())+" cm^2");
            cuadrado.calcularDiagonales();
    }
    /**
     * Metodo que se encarga de imprimir las funciones de la clase Rectangulo.
     */
    public void imprimirRectangulo(){
    
            rectangulo.capturarMedidas();
            System.out.println("El resultado del perimetro es: "+formatoDecimal.format(rectangulo.calcularPerimetro())+" cm");
            System.out.println("El resultado del area es: "+formatoDecimal.format(rectangulo.calcularArea())+" cm^2");
            rectangulo.calcularDiagonales();
    }
    /**
     * Metodo que se encarga de imprimir las funciones de la clase Triangulo.
     */
    public void imprimirTriangulo(){
    
            triangulo.capturarMedidas();
            System.out.println("El resultado del perimetro es: "+ formatoDecimal.format(triangulo.calcularPerimetro())+" cm");
            System.out.println("El resultado del area es: "+ formatoDecimal.format(triangulo.calcularArea())+" cm^2");
            System.out.println("La clasificacion del triangulo es: "+triangulo.determinarClasificacion());
    }
    
    /**
     * Metodo encargado de realizar el polimorfismos e imprimir la informacion de todas las figuras en general.
     */
    public void imprimirTodasLasFiguras(){
    
            FigurasPlanas[] vector= new FigurasPlanas[4];
            vector[0]= circulo;
            vector[1]= cuadrado;
            vector[2]= rectangulo;
            vector[3]= triangulo;
            for(FigurasPlanas figuras : vector){
                System.out.println("--------------------------------------------------------------------------------");
                if(figuras instanceof Circulo) {
                    System.out.println("\t Circulo\n");
                ((Circulo) figuras).imprimir();
            } else if(figuras  instanceof Cuadrado) {
                System.out.println("\t Cuadrado\n");
                ((Cuadrado) figuras).calcularDiagonales();
            }  else if(figuras instanceof Rectangulo) {
                System.out.println("\t Rectangulo\n");
                ((Rectangulo) figuras).calcularDiagonales();
            }else if(figuras instanceof Triangulo){
                System.out.println("\t Triangulo\n");
                    System.out.println("La clasificacion de triangulo es: "+((Triangulo) figuras).determinarClasificacion());
            }
            
            System.out.println("\nPerímetro: "+formatoDecimal.format(figuras.calcularPerimetro())+" cm");
            System.out.println("Área: "+formatoDecimal.format(figuras.calcularArea())+" cm^2");
        }
            }
    }
