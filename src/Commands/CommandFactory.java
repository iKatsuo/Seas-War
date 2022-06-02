/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import GUI.Pantalla;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommandFactory { 
    
    
    public static BaseCommand getCommand(String name, String[] args,Pantalla pantalla){
        
        switch (name.toUpperCase()) {
            case "CHAT":
                return new ChatCommand(name, args);
            case "PRIVATECHAT":
                return new PrivateChatCommand(args[1], args);
            case "ATACAR":
                return new ChatCommand(name, args);
            case "NUEVOJUGADOR":
                return new nuevojugadorCommand(name, args, pantalla);
            case "NUEVOPERSONAJE":
                return new NuevoPersonajeCommand(name, args, pantalla);
            
            default:
                return new ErrorCommand("Error", args);

        }

        
        
        
    }
    
    
    
}

