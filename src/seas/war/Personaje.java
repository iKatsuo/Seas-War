package seas.war;

public class Personaje {
    private String nombre;
    private int poder;
    private int resistencia;
    private int sanacion;
    private int nCasillas;
    private int vida;

    public Personaje(String nombre, int poder, int resistencia, int sanacion, int nCasillas, int vida){
        this.nombre = nombre;
        this.poder = poder;
        this.resistencia = resistencia;
        this.sanacion = sanacion;
        this.nCasillas = nCasillas;
        this.vida = vida;
    }

}
