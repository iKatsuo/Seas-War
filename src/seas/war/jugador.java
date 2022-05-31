/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seas.war;

import GUI.Pantalla;

/**
 *
 * @author juanj
 */
public class jugador {
    String nombre;
    int cantidadVida;
    Pantalla pantalla;

    public jugador(String nombre,Pantalla  pantalla) {
        
        this.nombre = nombre;
        pantalla.getNombrejugador().setText("si funciona");
        this.pantalla=pantalla;
       pantalla.getjLabel10().setText("50");

        
    }
    
   public void verLabel (){
      // pantalla.jLjugador1.setIcon(icon);
   }
    
}
