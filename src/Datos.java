/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vicec
 */
public class Datos {

    private Bebida[][] estanteria;

    public Datos() {
        this.estanteria = new Bebida[5][5];
    }

    public Datos(int filas, int columnas) {
        this.estanteria = new Bebida[filas][columnas];
    }

    //Metodo agraga agrega bebida
    public void agregarBebida(Bebida b) {
        boolean encontrado=false;

        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
              if(  estanteria[i][j]== null){
                    estanteria[i][j]=  b; 
                    encontrado=true;
              }          
            }
        }
        
        if(encontrado){
            System.out.println("Se agrego la bebida");
        }else{
            System.out.println("No se agrego la bebida");
        }
        
    }

}
