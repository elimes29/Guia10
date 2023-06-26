package entidad;


import entidad.Alumno;
import java.util.ArrayList;

/*
Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 */

/**
 *
 * @author usuario
 */
public class Voto {
    public Alumno Al;
    ArrayList<Alumno> voto;

    public Voto(Alumno Al, ArrayList<Alumno> voto) {
        this.Al = Al;
        this.voto = voto;
    }

    public Voto() {
    }

    public Alumno getAl() {
        return Al;
    }

    public void setAl(Alumno Al) {
        this.Al = Al;
    }

    public ArrayList<Alumno> getVoto() {
        return voto;
    }

    public void setVoto(ArrayList<Alumno> voto) {
        this.voto = voto;
    }
    
}
