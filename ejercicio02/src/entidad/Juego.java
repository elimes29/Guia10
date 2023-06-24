/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
 */
package entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver arma;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> juadores, Revolver arma) {
        this.jugadores = juadores;
        this.arma = arma;
    }

    public ArrayList<Jugador> getJuadores() {
        return jugadores;
    }

    public void setJuadores(ArrayList<Jugador> juadores) {
        this.jugadores = juadores;
    }

    public Revolver getArma() {
        return arma;
    }

    public void setArma(Revolver arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Juego{" + "juadores=" + jugadores + ", arma=" + arma + '}';
    }
/*
    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
    */
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.arma = r;

    }

    /*
    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
     */
    public void ronda() {
        Scanner leer = new Scanner(System.in);
        boolean band = true;
        System.out.println("------------INICIO DEL JUEGO-------------------");
        
        do {
            for (Jugador jugador : jugadores) {
                if (!jugador.disparo(arma)) {
                    System.out.println("El juador " + jugador.getNombre() + " sigue juando");
                    System.out.println("----------CONTINIA JUEGO---------------");

                } else {
                    System.out.println("El juador " + jugador.getNombre() + " se mojó");
                    System.out.println("-------------FIN DEL JUEGO---------------");
                    band = false;
                    break;
                }
            }


        } while (band);

    }
}
