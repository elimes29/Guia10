/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author usuario
 */
public class Pelicula {
    private String título;
    private String duracion;
    private int edadMínima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String título, String duracion, int edadMínima, String director) {
        this.título = título;
        this.duracion = duracion;
        this.edadMínima = edadMínima;
        this.director = director;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getEdadMínima() {
        return edadMínima;
    }

    public void setEdadMínima(int edadMínima) {
        this.edadMínima = edadMínima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "t\u00edtulo=" + título + ", duracion=" + duracion + ", edadM\u00ednima=" + edadMínima + ", director=" + director + '}';
    }

   
    
}
