/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto19p1;

/**
 *
 * @author Usuario
 */
public class Cilindro extends Circulo{
    double altura;
    private double areac,vol;

    public void setAltura(double altura) {
        this.altura = altura;
    }
        
    public void AreaC(){
        areac = 2*3.1416*radio*altura + 2*3.1416*(radio*radio);
        System.out.println("El area del cilindro es: "+areac);
    }
    
    public void VolumenC (){
        vol = 3.1416*(radio*radio)*altura;
        System.out.println("El Volumen del cilindro es: "+vol);
    }
    
}
