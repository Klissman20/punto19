/*
Diseñar una jerarquía de clases: Círculo, Cilindro y CilindroHueco. En esencia, se puede decir que un objeto cilindro 
es un objeto círculo con una altura, y un cilindro hueco es un cilindro con un espacio huevo dentro de él. 
La clase Círculo debe tener un dato Radio (tipo double) y unas funciones miembro LeerRadio, Area y Circunferencia, 
que obtienen el valor del radio y calculan el área del círculo y la longitud de la circunferencia. Escribir un programa 
que permita crear objetos Circulo, Cilindro y CilindroHueco y calcule la longitud de la circunferencia y las áreas del círculo, 
del cilindro y del cilindro hueco. 
 */
package punto19p1;

/**
 *
 * @author Usuario
 */
public class Punto19p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo Fig1 = new Circulo();
        Fig1.Leer_radio();
        Fig1.Area();
        Fig1.Longitud();
        Cilindro Fig = new Cilindro();
        Fig.Leer_radio();
        Fig.setAltura(10);
        Fig.AreaC();
        Fig.VolumenC();
        Cilindro_Hueco Fig2 = new Cilindro_Hueco();
        Fig2.Leer_radio();
        Fig2.setAltura(5);
        Fig2.setR_interno(3);
        Fig2.LogitudCH();
        Fig2.VolumenCH();
    }
    
}
