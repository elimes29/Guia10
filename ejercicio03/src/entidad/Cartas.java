/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Cartas {
    private ArrayList<Carta> maso;
    private ArrayList<Carta> moton;

    public Cartas() {
    }

    public Cartas(ArrayList<Carta> maso) {
        this.maso = maso;
    }

    public Cartas(ArrayList<Carta> maso, ArrayList<Carta> moton) {
        this.maso = maso;
        this.moton = moton;
    }

    public ArrayList<Carta> getMaso() {
        return maso;
    }

    public void setMaso(ArrayList<Carta> maso) {
        this.maso = maso;
    }

    public ArrayList<Carta> getMoton() {
        return moton;
    }

    public void setMoton(ArrayList<Carta> moton) {
        this.moton = moton;
    }

    @Override
    public String toString() {
        return "Cartas{" + "maso=" + maso + ", moton=" + moton + '}';
    }
    
    
}
