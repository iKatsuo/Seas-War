package seas.war;
import java.util.ArrayList;

import GUI.Pantalla;


public class Jugador {
   public String nombre;
   private int cantidadVida;
   public static Personaje[] Personajes = new Personaje[3];
   public static int pRegistrados = 0; //Personajes registrados

   public Pantalla pantalla;

   public Jugador(String nombre, Pantalla pantalla) {

      this.nombre = nombre;
      this.cantidadVida = 100;
      this.pantalla = pantalla;

   }

   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public int getCantidadVida() {
       return cantidadVida;
   }

   public void setCantidadVida(int cantidadVida) {
       this.cantidadVida = cantidadVida;
   }

   public int getpRegistrados() {
       return pRegistrados;
   }


   public static void addPersonaje(Personaje nuevo){
      if(pRegistrados < 3){
         Personajes[pRegistrados] = nuevo;
         pRegistrados++;
      }

   }

}
