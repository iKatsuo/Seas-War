package seas.war;

public class Personaje {
    int poder;
    int resistencia;
    int sanacion;
    int nCasillas;
    int vida=0;

    public Personaje(int poder, int resistencia, int sanacion, int nCasillas, int vida){
        this.poder = poder;
        this.resistencia = resistencia;
        this.sanacion = sanacion;
        this.nCasillas = nCasillas;
        this.vida=vida;
    }

}
