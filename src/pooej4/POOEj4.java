/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author hdsot
 */
public class POOEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int superficie,base,altura;
        double perimetro;
        RectanguloServicio rect = new RectanguloServicio();
        Rectangulo rectangu = rect.crearRectangulo();
        
        base=rectangu.getBase();
        altura=rectangu.getAltura();
        
        superficie=rect.superficie(base, altura);
        perimetro=rect.perimetro(base, altura);
        
        System.out.println("La SUPERFICIE es: "+ superficie);
        System.out.println("El PERIMETRO es: "+ perimetro);
        rect.dibujar(base, altura);
    }
    
}
