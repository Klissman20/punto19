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
public class Cilindro_Hueco extends Cilindro{
    private double r_interno,lonCH,volCH;

    public void setR_interno(double r_interno) {
        this.r_interno = r_interno;
    }
    
    public void LogitudCH(){
        lonCH = 2*3.1416*((radio*radio)*(r_interno*r_interno))+2*3.1416*radio*altura+2*3.1416*r_interno*altura;
        System.out.println("Longitud Cilindro Hueco: "+lonCH);
    }
    
    public void VolumenCH(){
        volCH = 3.1416*((radio*radio)*(r_interno*r_interno))*altura;
        System.out.println("Volumen Cilindro Hueco: "+volCH);
    }
    
}
