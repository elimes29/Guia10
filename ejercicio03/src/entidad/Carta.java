/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author usuario
 */
public class Carta {
    private Integer numero;
    private String palo;
    private String carta;

    public Carta(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
        this.carta = numero+palo;
    }

    public Carta() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }

    @Override
    public String toString() {
        return "Carta{" + "carta=" + carta + '}';
    }

    
}

