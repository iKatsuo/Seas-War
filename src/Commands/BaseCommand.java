/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import GUI.Pantalla;
import java.io.Serializable;


/**
 *
 * @author diemo
 */
public abstract class BaseCommand implements iCommand, Serializable{
    
    private String[] args;
   
    private boolean isBroadcast;
    private boolean isNuevoJugador;
    private boolean isPrivateChat;
    private boolean isNuevoPersonaje;
    private String commandName;

    public BaseCommand(String commandName, String[] args,boolean isBroadcast, boolean isNuevoJugador,boolean isPrivateChat, boolean nuevoPersona) {
        
        this.args = args;
       
        this.isBroadcast = isBroadcast;
        this.commandName = commandName;
        this.isNuevoJugador = isNuevoJugador;
        this.isPrivateChat=isPrivateChat;
    }
    
    public String[] getArgs() {
        return args;
    }

    

   
    public void setArgs(String[] args) {
        this.args = args;
    }

    public String getCommandName(){
        return this.commandName;
    }
    
    public boolean isBroadcast(){
        return isBroadcast;
    }

    public boolean isNuevoJugador(){
        return isNuevoJugador;
    }
     public boolean isPrivateChat(){
        return isPrivateChat;
    }

    public boolean isIsBroadcast() {
        return isBroadcast;
    }

    public boolean isIsNuevoJugador() {
        return isNuevoJugador;
    }

    
    public boolean isIsPrivateChat() {
        return isPrivateChat;
    }
    
    public boolean isNuevoPersonaje() {
        return isNuevoPersonaje;
    }

    
    public abstract String executeOnServer();
    public abstract String executeOnClient(); 
    
    
}
