/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import GUI.Pantalla;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diemo
 */
public class Client {
    private final int PORT = 35500;
    private final String SERVER_IP = "localhost";
    public Socket socket;
    public ObjectOutputStream writer;
    public ClientFrame screenRef;
    public Pantalla screenRef2;
    private boolean isConnected = false;
    private ThreadClient theadClient; 

    public Client(ClientFrame screenRef) {
        this.screenRef = screenRef;
    }

    

    public Client(Pantalla screenRef) {
        this.screenRef2 = screenRef;
    }
    
    
    public void connect(){
        try {
            if (!isConnected){
                this.socket = new Socket(SERVER_IP , PORT);
                this.writer = new ObjectOutputStream(socket.getOutputStream());
               // this.screenRef.showClientMessage("Conectado al server");
                this.screenRef2.showClientMessage("Conectado al server de la consola");
                this.theadClient = new ThreadClient(this);
                this.theadClient.start();
                this.isConnected = true;
            }
            //threadClient
        } catch (IOException ex) {
            
        }
    }
    
    
}
