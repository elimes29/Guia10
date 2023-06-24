/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Cine {
    private Pelicula pelicula;
    private Sala sala1;
    private ArrayList<Espectador> espectadores;
    private int precioEntrada;

    public Cine() {
    }

    public Cine(Pelicula pelicula, Sala sala1, ArrayList<Espectador> espectadores, int precioEntrada) {
        this.pelicula = pelicula;
        this.sala1 = sala1;
        this.espectadores = espectadores;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala1() {
        return sala1;
    }

    public void setSala1(Sala sala1) {
        this.sala1 = sala1;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala1=" + sala1 + ", espectadores=" + espectadores + ", precioEntrada=" + precioEntrada + '}';
    }


    
}
