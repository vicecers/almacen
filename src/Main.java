/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vicec
 */
public class Main {
    public static void main(String[] args) {
        Bebida b;
        Datos d = new Datos(10, 10);
        
        b = new AguaMineral("Los andes", 2, 80, "Villa Vicencio");
        
        d.agregarBebida(b);
        
        b = new BebidaAzucarada(2, true, 2, 150, "Manaos");
        
        d.agregarBebida(b);
        
        
        d.mostrarBebida(b);
        d.eliminarBebida(1);
        d.mostrarBebida(b);
        
        d.calcularPrecioBebidas();
                        
    }
}
