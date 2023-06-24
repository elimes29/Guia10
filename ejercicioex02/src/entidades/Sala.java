/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Sala {
    private String[][] sala;

    public Sala() {
    }

    public Sala(String[][] sala) {
        this.sala = sala;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Sala{" + "sala=" + Arrays.toString(sala) + '}';
    }
    
    
}
