/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class RectanguloServicio {
    Scanner leer = new Scanner (System.in);
    public Rectangulo crearRectangulo(){
        int base,altura;
        Rectangulo rectang = new Rectangulo();
        System.out.println("Ingrese la BASE ");
        base=leer.nextInt();
        System.out.println("Ingrese la ALTURA ");
        altura=leer.nextInt();
        rectang.setAltura(altura);
        rectang.setBase(base);
        return rectang;
    }
    public int superficie(int base,int altura){
        int superficie;
        superficie=base*altura;
        return superficie;
    }
    public double perimetro(int base,int altura){
        double perimetro;
        perimetro=(base+altura)/2;
        return perimetro;
    }
    public void dibujar(int base, int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i != 0 && i != (altura - 1) && j != 0 && j != (base - 1)) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
                
            }System.out.println("");
        }
    }
}
