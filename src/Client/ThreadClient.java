/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Commands.BaseCommand;
import Server.Server;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Message;

/**
 *
 * @author diemo
 */
public class ThreadClient extends Thread{
    Client client;
    //ObjectOutputStream writer;
    ObjectInputStream reader;
    private boolean isRunning = true;

    public ThreadClient(Client client) {
        this.client = client;
        try {
            reader = new ObjectInputStream(client.socket.getInputStream());
        } catch (IOException ex) {
            //Logger.getLogger(ThreadClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    public void run(){
        BaseCommand readMessage = null;
        while (isRunning) {
            
            try {
                readMessage = (BaseCommand)this.reader.readObject();
            } catch (IOException ex) {    
            } catch (ClassNotFoundException ex) {}
            
            
            //client.screenRef.showClientMessage(readMessage.executeOnClient());
            client.screenRef2.showClientMessage(readMessage.executeOnClient());
            
//            if (readMessage.getName().toUpperCase().equals("CHAT")){
//                System.out.println("recibido " + readMessage.toString());
//                client.screenRef.showClientMessage("Recibido: " + readMessage.toString());
//            }else if (readMessage.getName().toUpperCase().equals("ATTACK")){
//                client.screenRef.showClientMessage("ATAQUE: " + readMessage.toString());
//            }
        }
    }
}
