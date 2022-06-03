package Commands;

import GUI.Pantalla;
import Server.ServerFrame;

import java.io.Serializable;
import java.util.ArrayList;
import seas.war.Jugador;

public class nuevojugadorCommand extends BaseCommand implements Serializable{
     public Jugador jugador;
    

    public nuevojugadorCommand(String commandName, String[] args) {
        
        super(commandName, args, true,true ,false);
      
       
        
    }

    @Override
    public String executeOnServer() {
        return "Enviado: creado nuevo jugador" + CommandUtils.concatArray(getArgs());
    }

    @Override
    public String executeOnClient() {
        return "Recibido: creado  " + CommandUtils.concatArray(getArgs());
    }
    
    public  Jugador getJugador(){
        return jugador;
    }

   

    
}
