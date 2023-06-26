/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidad.Alumno;
import java.util.Comparator;

/**
 *
 * @author usuario
 */
public class Comparadores {
    
    public static Comparator<Alumno> ordenaXVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t1, Alumno t2) {
           return t2.numVotos.compareTo(t1.numVotos);
        }
    };
            
}
