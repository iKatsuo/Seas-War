package Commands;

import GUI.Pantalla;

import java.io.Serializable;
import seas.war.Jugador;

public class nuevojugadorCommand extends BaseCommand implements Serializable{
    

    public nuevojugadorCommand(String commandName, String[] args, Pantalla pantalla) {
        super(commandName, args, true);
        Jugador jugador = new Jugador(args[1], pantalla); 
        
        
    }

    // Hola como estan
    @Override
    public String executeOnServer() {
        return "Enviado: creado nuevo jugador" + CommandUtils.concatArray(getArgs());
    }

    @Override
    public String executeOnClient() {
        return "Recibido: creado  " + CommandUtils.concatArray(getArgs());
    }
    
 

    
}
