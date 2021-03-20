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
import java.util.Scanner;

/**
 * Clase encargada de interactuar con el usuario y ejecutar las clases pertenecientes al paquete "Modelo"
 * @author Eison Andrei Morales Pardo
 * @author Juan Camilo Páez Beltran 
 * @since 1.0
 * @version 1.0.4
 */
public class InteraccionUsuario implements IFuncionAuxiliar{

    Scanner lector = new Scanner(System.in);
    
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
        System.out.println("Este programa calcula las figuras geometricas (Circulo, Cuadrado, Rectangulo, Triangulo)");
        do{
        System.out.println("Escoge una opcion:\n 1.Hacer el calculo del circulo.\n 2.Hacer el calculo del cuadrado.\n 3.Hacer el calculo del rectangulo.\n 4.Hacer el calculo triangulo.\n 5.Hacer todas las opciones.");
        opcion = lector.nextByte();
         //Se hace una funcion switch para realizar un menu para que el usuario tenga iteraccion y pueda escoger una opcion
        switch(opcion){
        case 1 :
            imprimirCirculo();
               break;
        case 2 :
            ImprimirCuadro();
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
               System.out.println("Opcion desconocida, Porfavor vuelve a ingresar otra opcion");
        break;
       }
         System.out.println("deseas escoger otra opcion. \n 1.si.\n 2.no.  ");  
         s=lector.nextByte();
      } while (s==1);
    }
        
    /**
     * Metodo que se encarga de imprimir las funciones de la clase Circulo.
     */
    public void imprimirCirculo(){
    
            System.out.println("Por favor digitar las medidas del radio del circulo");
            circulo.capturarMedidas();
            System.out.println("El resultado del perimetro es: "+circulo.calcularPerimetro());
            System.out.println("El resultado del area es: "+circulo.calcularArea());
            circulo.calcularArcos();
    }
    
    /**
     * Metodo que se encarga de imprimir las funciones de la clase Cuadro.
     */
    public void ImprimirCuadro(){
    
            System.out.println("Por favor digitar las medidas del lado del cuadrado");
            cuadrado.capturarMedidas();
            System.out.println("El resultado del perimetro es: "+cuadrado.calcularPerimetro());
            System.out.println("El resultado del area es: "+cuadrado.calcularArea());
            cuadrado.calcularDiagonales();
    }
    /**
     * Metodo que se encarga de imprimir las funciones de la clase Rectangulo.
     */
    public void imprimirRectangulo(){
    
            rectangulo.capturarMedidas();
            System.out.println("El resultado del perimetro es: "+rectangulo.calcularPerimetro());
            System.out.println("El resultado del area es: "+rectangulo.calcularArea());
            rectangulo.calcularDiagonales();
    }
    /**
     * Metodo que se encarga de imprimir las funciones de la clase Triangulo.
     */
    public void imprimirTriangulo(){
    
            triangulo.capturarMedidas();
            System.out.println("El resultado del perimetro es: "+triangulo.calcularPerimetro());
            System.out.println("El resultado del area es: "+triangulo.calcularArea());
            System.out.println("La clasificacion del triangulo es:"+triangulo.determinarClasificacion());
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
                System.out.println("\n Perimetro: "+figuras.calcularPerimetro());
                System.out.println("Area: "+figuras.calcularArea());
                if(figuras instanceof Circulo) {
                ((Circulo) figuras).calcularArcos();
            } else if(figuras  instanceof Cuadrado) {
                ((Cuadrado) figuras).calcularDiagonales();
            }  else if(figuras instanceof Rectangulo) {
                ((Rectangulo) figuras).calcularDiagonales();
            }else if(figuras instanceof Triangulo){
                    System.out.println("La clasificacion de triangulo es: "+((Triangulo) figuras).determinarClasificacion());
            }
        }
            }
    }
