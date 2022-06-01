package seas.war;
import java.util.ArrayList;

import GUI.Pantalla;


public class Jugador {
   String nombre;
   int cantidadVida;
   ArrayList<Personaje> Personajes;

   Pantalla pantalla;

   public Jugador(String nombre, Pantalla pantalla) {

      this.nombre = nombre;
      this.cantidadVida = 100;
      this.pantalla = pantalla;

      this.Personajes = new ArrayList<Personaje>();

   }



}
