/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import GUI.Pantalla;
import Utils.CommandUtils;
import java.io.Serializable;
import seas.war.jugador;

/**
 *
 * @author juanj
 */
public class nuevojugadorCommand   extends BaseCommand implements Serializable{
    

    public nuevojugadorCommand(String commandName, String[] args,Pantalla pantalla) {
        super(commandName, args, true);
        jugador jugador=new jugador(args[1],pantalla);
        
        
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
