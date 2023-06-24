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
public class Espectador {
    private String nombre;
    private int edad;
    private int dinero;
    private boolean entro;

    public boolean isEntro() {
        return entro;
    }

    public void setEntro(boolean entro) {
        this.entro = entro;
    }

    public Espectador(String nombre, int edad, int dinero, boolean entro) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.entro = entro;
    }

    public Espectador() {
    }

    public Espectador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", entro=" + entro + '}';
    }


}
