package Commands;

import GUI.Pantalla;
import Server.ServerFrame;
import seas.war.Jugador;
import seas.war.Personaje;

public class NuevoPersonajeCommand extends BaseCommand {

    public NuevoPersonajeCommand(String commandName, String[] args, Pantalla pantalla) {
        super(commandName, args, true, false);

        int poder = Integer.parseInt(args[2]);
        int resistencia = Integer.parseInt(args[3]);
        int sanacion = Integer.parseInt(args[4]);
        int nCasillas = Integer.parseInt(args[5]);

        Personaje nuevo = new Personaje(args[1], poder, resistencia, sanacion, nCasillas, 100);
        Jugador.addPersonaje(nuevo);
        
    }

    @Override
    public String executeOnServer() {
        return "Enviado: creado nuevo jugador" + CommandUtils.concatArray(getArgs());
    }

    @Override
    public String executeOnClient() {
        return "Recibido: creado  " + CommandUtils.concatArray(getArgs());
    }
}
