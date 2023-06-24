/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioMascotas {

    ArrayList<Persona> personas = new ArrayList<>();
    ArrayList<Perro> perros = new ArrayList<>();
    Scanner leerS = new Scanner(System.in);
    Scanner leer = new Scanner(System.in);

    /**
     * método que crea personas y los guarda en una lista
     */
    public void crearPersonas() {
        System.out.println("Cuantas personas desea crear");
        int numPersonas = leer.nextInt();

        for (int i = 0; i < numPersonas; i++) {
            System.out.println("Ingrese el nombre de la persona");
            String nombre = leerS.nextLine();
            System.out.println("Ingrese la edad de la persona");
            int edad = leer.nextInt();
            System.out.println("Ingrese la cedula de la persona");
            int cedula = leer.nextInt();
            Persona p = new Persona(nombre, edad, cedula);
            personas.add(p);
        }
    }

    /*
    método que crea perros y los guarda en una lista
     */
    public void crearPerros() {
        System.out.println("Cuantas perros desea crear");
        int numPerros = leer.nextInt();

        for (int i = 0; i < numPerros; i++) {
            System.out.println("Ingrese el nombre del perro");
            String nombre = leerS.nextLine();
            System.out.println("Inrese la edad del perro");
            int edad = leer.nextInt();
            System.out.println("Ingrese la raza del perro");
            String raza = leerS.nextLine();
            System.out.println("De que tamaño es el perro");
            String tama = leerS.nextLine();
            Perro p = new Perro(nombre, raza, edad, tama);
            perros.add(p);
        }
    }

    /**
     * Método que muestra los perros dispolibles, es decir los que no han sido
     * adoptados. Si todos los perros han sido adoptados, muestra un mesaje.
     */
    public void perrosDisponibles() {
        int cont = 0;
        System.out.println("Los perros disponibles son: ");
        for (Perro perro : perros) {
            if (!(perro.isAdoptado())) {
                System.out.println(perro.getNombre());
            } else {
                cont++;
            }
        }

        if (cont == perros.size()) {
            System.out.println("Todos los perros están adoptatos");
        }
    }

    public void adoptaPerro() {

        for (Persona persona : personas) {
            perrosDisponibles();
            System.out.println("Cual perro desea adoptar "+persona.getNombre()+ "?");
            String nombreP = leerS.nextLine();

            for (Perro perro : perros) {
                if (perro.getNombre().equalsIgnoreCase(nombreP)) {
                    persona.setPerro(perro);
                    perro.setAdoptado(true);
                    System.out.println("Perro adoptado satisfactoriamente");

                }
            }
        }
    }
    
    public void mostrarPerros(){
        System.out.println("Los perros son: ");
        for (Perro perro : perros) {
            System.out.println(perro);
            
        }
    }
    
    public void mostrarPersonas(){
        System.out.println("Las personas son");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
