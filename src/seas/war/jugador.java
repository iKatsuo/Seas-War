package seas.war;
import GUI.Pantalla;


public class Jugador {
   String nombre;
   int cantidadVida;
   Pantalla pantalla;

   public Jugador(String nombre, Pantalla pantalla) {

      this.nombre = nombre;
      pantalla.getNombrejugador().setText("Si funciona");
      this.pantalla = pantalla;
      pantalla.getjLabel10().setText("50");

   }

   public void verLabel() {
      // pantalla.jLjugador1.setIcon(icon);
   }

}
