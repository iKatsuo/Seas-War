/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Commands.BaseCommand;
import Commands.CommandFactory;
import Commands.Message;
import Commands.nuevojugadorCommand;
import GUI.Pantalla;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import seas.war.Jugador;
import seas.war.Personaje;

/**
 *
 * @author diemo
 */
public class ThreadServer extends Thread {
    Socket socket;
    Server server;
    ObjectOutputStream writer;
    ObjectInputStream reader;
    public String name = "";
    private boolean isRunning = true;

    public ThreadServer(Socket socket, Server server) {
        this.socket = socket;
        this.server = server;
        this._init_();
    }

    private void _init_() {
        try {
            this.writer = new ObjectOutputStream(socket.getOutputStream());
            this.reader = new ObjectInputStream(socket.getInputStream());
        } catch (IOException ex) {
        }
    }

    public void run() {
        BaseCommand readCommand = null;
        while (isRunning) {

            try {
                // System.out.println("previous read command");
                readCommand = (BaseCommand) this.reader.readObject();
                // System.out.println("read command");

                // Creo que aca se verifica cual es el comando que se recibio para realizar la
                // accion que se necesite...

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }

            if (readCommand.isBroadcast()) {
                server.broadcast(readCommand);
            }

            if (readCommand.isNuevoJugador()) {
                nuevojugadorCommand command = (nuevojugadorCommand) readCommand;
                Jugador nuevo = command.getJugador();
                server.addJugador(nuevo);
            }

            else {
                server.screenRef.showServerMessage(readCommand.executeOnServer());
            }
        }

    }

}
