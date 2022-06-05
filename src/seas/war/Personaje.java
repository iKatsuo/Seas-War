package seas.war;

import java.net.Socket;

import Client.ThreadClient;
import Server.Server;
import Server.ThreadServer;

public class Personaje{
    private String nombre;
    private int poder;
    private int resistencia;
    private int sanacion;
    private int nCasillas;
    private int vida;

    public Personaje(/*Socket socket, Server server,*/String nombre, int poder, int resistencia, int sanacion, int nCasillas, int vida){
      //  super(socket, server);
        this.nombre = nombre;
        this.poder = poder;
        this.resistencia = resistencia;
        this.sanacion = sanacion;
        this.nCasillas = nCasillas;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }


    public void mostrar() {
        
        System.out.println("n"+nombre);
        System.out.println("p"+poder);
        System.out.println("r"+resistencia);
        System.out.println("s"+sanacion);
        System.out.println("nCasilla"+nombre);
        System.out.println("vida"+vida);
    }

}
