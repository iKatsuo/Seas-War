/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import GUI.Pantalla;
import java.io.Serializable;
import java.util.ArrayList;


public class ChatCommand extends BaseCommand implements Serializable{

    public ChatCommand(String commandName, String[] args) {
        super(commandName, args ,true, false ,false,false);
    }

   
    @Override
    public String executeOnServer() {
        return "Enviado: " + CommandUtils.concatArray(getArgs());
    }

    @Override
    public String executeOnClient() {
        return "Recibido: " + CommandUtils.concatArray(getArgs());
    }
    
    
    
}
