/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio002;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leerS = new Scanner(System.in);
        Juego ruleta = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
            
            System.out.println("Ingrese el nombre del jugador "+(i+1));
            String nombre = leerS.nextLine();
            Jugador j = new Jugador();
            j.setId((i+1));
            j.setMojado(false);
            j.setNombre(nombre+" "+(i+1));
            jugadores.add(j);
        }

        Revolver arma = new Revolver();
        arma.llenarRevolver(arma);

        ruleta.llenarJuego(jugadores, arma);
        ruleta.ronda();
        
    }
    
}
