/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import GUI.Pantalla;
import Server.ServerFrame;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author diemo
 */
public class PrivateChatCommand  extends BaseCommand implements Serializable{

    public PrivateChatCommand(String commandName, String[] args) {
        super(commandName, args, false, false,true,false);
    }


    @Override
    public String executeOnServer() {
      return "Para "+ getArgs()[1] + ": "+ CommandUtils.concatArray(getArgs());
                  
    }

    @Override
    public String executeOnClient() {
        return "Para "+ getArgs()[1] + ": "+ CommandUtils.concatArray(getArgs());
        //return "Recibido: " + CommandUtils.concatArray(getArgs());
    }
 

    
}
