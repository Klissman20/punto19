/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto19p1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circulo {
    double radio;
    private double area,perimetro;
    Scanner lector = new Scanner (System.in);
    
    public void Leer_radio(){
        System.out.println("Ingrese el radio: ");
        radio = lector.nextDouble();
    }
    
    public void Area(){
        area = 3.1416*(radio*radio);
        System.out.println("El area es: "+area);
    }
    
    public void Longitud(){
        perimetro = 2*3.1416*radio;
        System.out.println("El perimetro es: "+perimetro);
    }
    
}
