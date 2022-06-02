package seas.war;
import java.util.ArrayList;

import GUI.Pantalla;


public class Jugador {
   public String nombre;
   public int cantidadVida;
   public ArrayList<Personaje> Personajes;

   public Pantalla pantalla;

   public Jugador(String nombre, Pantalla pantalla) {

      this.nombre = nombre;
      this.cantidadVida = 100;
      this.pantalla = pantalla;

      this.Personajes = new ArrayList<Personaje>();

   }



}
