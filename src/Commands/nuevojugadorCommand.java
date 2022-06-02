package Commands;

import GUI.Pantalla;
import Server.ServerFrame;

import java.io.Serializable;
import java.util.ArrayList;
import seas.war.Jugador;

public class nuevojugadorCommand extends BaseCommand implements Serializable{
    Jugador jugador;

    public nuevojugadorCommand(String commandName, String[] args, Pantalla pantalla) {
        super(commandName, args, false, true);
        jugador = new Jugador(args[1], pantalla); 
        
    }

    @Override
    public String executeOnServer() {
        return "Enviado: creado nuevo jugador" + CommandUtils.concatArray(getArgs());
    }

    @Override
    public String executeOnClient() {
        return "Recibido: creado  " + CommandUtils.concatArray(getArgs());
    }
    
    public Jugador getJugador(){
        return jugador;
    }

    
}
