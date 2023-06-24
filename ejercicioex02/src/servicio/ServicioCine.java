/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import entidades.Sala;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioCine {

    Sala s1 = new Sala();
    ArrayList<Espectador> espectadores = new ArrayList<>();
    ArrayList<Espectador> espectadoresSala = new ArrayList<>();
    Pelicula p1 = new Pelicula();
    Cine c = new Cine();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearSala() {
        String[][] sala = new String[8][6];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j] = " ";
            }
            s1.setSala(sala);
        }

    }

    public void mostrarSala() {
        System.out.println("   A  B  C  D  E  F");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 6; j++) {
                System.out.print(" " + s1.getSala()[i][j] + " ");
            }
            System.out.println("");

        }
    }

    public void crearPelicula() {
        System.out.println("Ingrese el tílulo de la pelícual");
        String titulo = leer.next();
        System.out.println("Ingrese la duración de la pelicula");
        String duracion = leer.next();
        System.out.println("Ingrese la edad mínima de la pelicula");
        int edad = leer.nextInt();
        System.out.println("Ingrese el director de la pelicula");
        String director = leer.next();

        p1.setDirector(director);
        p1.setDuracion(duracion);
        p1.setEdadMínima(edad);
        p1.setTítulo(titulo);

        System.out.println(p1);
    }

    public void crearEspectadores() {

        System.out.println("Cuantas personas hay en la taquilla?");
        int num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            String nombre = "E" + (i + 1);
            int edad = (int) (Math.random() * 45+5);
            int dinero = (int) (Math.random() * 10);
            boolean entra = false;
            Espectador e = new Espectador(nombre, edad, dinero, entra);
            espectadores.add(e);
        }


    }

    public void armarCine() {
        crearSala();
        crearPelicula();
        crearEspectadores();
        //Ingresando valores de pelicula en el cine
        c.setPelicula(p1);

        //Asignado valor de la entrada en 2 unidades de moneda
        System.out.println("Cul es el precio de la entrada?");
        int pr = leer.nextInt();
        c.setPrecioEntrada(pr);

        //Lenando sala con espectadores.
        
        int cont = 0;
        
        for (Espectador esp : espectadores) {
            if (esp.getDinero() >= c.getPrecioEntrada()) {
                if (esp.getEdad() >= p1.getEdadMínima()) {
                    //preguntando si hay espacio en la sala
                    if (cont<48) {
                        // se le puede asignar silla
                        boolean ban = true;
                        do {
                            int i = (int) (Math.random() * 8);
                            int j = (int) (Math.random() * 6);
                            if (s1.getSala()[i][j].equalsIgnoreCase(" ")) {
                                s1.getSala()[i][j] = "X";
                                 esp.setEntro(true);//indicamos que espectador entro en la sala
                                ban = false;
                                cont++;
                                System.out.println("Espectador "+ esp.getNombre()+" entró a sala y es usuario en sala # "+cont+ " en ella.");
                                mostrarSala();
                            }
                        } while (ban);
                    }else{// salir del ciclo for de espectadores en cola
                        break;
                    }     
                }else{
                    System.out.println("El espectador "+esp.getNombre()+" no tiene la edad minima reqerida");
                }
            }else{
                System.out.println("El espectador "+esp.getNombre()+" no tiene el dinero suficiente");
            }
        }
        
        //Asignamos a una nueva lista solo los espectadores que entraron a la sala
        for (Espectador esp : espectadores) {
            if (esp.isEntro()){
                espectadoresSala.add(esp);
            }
        }
        
        c.setEspectadores(espectadoresSala);
        c.setSala1(s1);
        

        System.out.println("");
        System.out.println("Espectadores en la fila "+espectadores.size());
        espectadores.forEach((esp) -> {
            System.out.println(esp);
        });
        
        System.out.println("");
        System.out.println("Espectadores en la sala viendo la pelicula "+c.getEspectadores().size());
        
        espectadoresSala.forEach((esp) -> {
            System.out.println(esp);
        });
        

    }

}
