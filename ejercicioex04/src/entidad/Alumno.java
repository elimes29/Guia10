/*
El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos
 */
package entidad;

/**
 *
 * @author usuario
 */
public class Alumno {
  public String nombreCompleto;
  public int dni;
  public Integer numVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, int dni, Integer numVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.numVotos = numVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumVotos() {
        return numVotos;
    }

    public void setNumVotos(Integer numVotos) {
        this.numVotos = numVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", numVotos=" + numVotos + '}';
    }
  
}
