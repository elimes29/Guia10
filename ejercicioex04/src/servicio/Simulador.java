/*
Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
• La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.
• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.
• Se debe imprimir por pantalla el listado de alumnos.

• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.

• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.
• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes.
 */
package servicio;

import entidad.Alumno;
import entidad.Voto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author usuario
 */
public class Simulador {

    ArrayList<Alumno> alumnoList = new ArrayList<>();
    ArrayList<Voto> votoList = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * La clase Simulador debe tener un método que genere un listado de alumnos
     * manera aleatoria y lo retorne. Las combinaciones de nombre y apellido
     * deben ser generadas de manera aleatoria. Nota: usar listas de tipo String
     * para generar los nombres y los apellidos.
     *
     * @return Lista de 200 nombres completos
     */
    public ArrayList<String> generaNombres() {

        ArrayList<String> nombre = new ArrayList<>();
        ArrayList<String> apellido = new ArrayList<>();

        //Creando nombres comunes
        nombre.add("Luis");
        nombre.add("Pedro");
        nombre.add("Juan");
        nombre.add("Sergio");
        nombre.add("José");
        nombre.add("Javier");
        nombre.add("Gabriel");
        nombre.add("Mario");
        nombre.add("Marco");
        nombre.add("Pablo");
        nombre.add("María");
        nombre.add("Julia");
        nombre.add("Marta");
        nombre.add("Elisa");
        nombre.add("Ana");
        nombre.add("Yudith");
        nombre.add("Alejandra");
        nombre.add("Aurora");
        nombre.add("Gisela");
        nombre.add("Paulina");
        nombre.add("Paolo");
        nombre.add("Paola");
        nombre.add("Elimes");
        nombre.add("Gael");
        nombre.add("Dionelys");

        //Creando apellidos comunes
        apellido.add("Rodríguez");
        apellido.add("Ramírez");
        apellido.add("Sánchez");
        apellido.add("Pérez");
        apellido.add("Agreda");
        apellido.add("Bravo");
        apellido.add("Blanco");
        apellido.add("Barazarte");
        apellido.add("Carmona");
        apellido.add("Escalona");
        apellido.add("Márquez");
        apellido.add("Castillo");
        apellido.add("Belizario");
        apellido.add("Loyo");
        apellido.add("Osman");
        apellido.add("Hitrovo");
        apellido.add("Navas");
        apellido.add("Petit");
        apellido.add("Salon");
        apellido.add("Leon");

        ArrayList<String> nombreCompleto = new ArrayList<>();
        for (int i = 0; i < 200; i++) {

            String n = nombre.get((int) (Math.random() * (nombre.size())));
            String a = apellido.get((int) (Math.random() * (apellido.size())));
            nombreCompleto.add(n + " " + a);
        }

        return nombreCompleto;

    }

    /**
     * Ahora hacer un generador de combinaciones de DNI posibles, deben estar
     * dentro de un rango real de números de documentos. Y agregar a los alumnos
     * su DNI. Este método debe retornar la lista de dnis.
     *
     * @return lista de 2 millones dnis
     */
    public ArrayList<Integer> generaDni() {
        ArrayList<Integer> dni = new ArrayList<>();
        for (int i = 10000000; i < 20000000; i++) {
            dni.add(i);
        }
        return dni;
    }

    /**
     * • Ahora tendremos un método que, usando las dos listas generadas, cree
     * una cantidad de objetos Alumno, elegidos por el usuario, y le asigne los
     * nombres y los dnis de las dos listas a cada objeto Alumno. No puede haber
     * dos alumnos con el mismo dni, pero si con el mismo nombre.
     */
    public void generaAlumno() {
        System.out.println("Cuanto alumnos desea generar?");
        int num = leer.nextInt();
        HashSet<Integer> dni = new HashSet<>();
        ArrayList<String> nombre = new ArrayList<>();

        //Llenando conjunto de DNI para que no se repitan
        do {
            dni.add(generaDni().get((int) (Math.random() * 10000000)));
        } while (dni.size() != num);

        //convierto en list para poder utilizar .get
        ArrayList<Integer> dniList = new ArrayList<>(dni);

        //Llenando lista de nombres 
        for (int i = 0; i < num; i++) {
            nombre.add(generaNombres().get((int) (Math.random() * 200)));
        }

        //Armando alumnos
        for (int i = 0; i < num; i++) {
            Alumno al = new Alumno();
            al.nombreCompleto = nombre.get(i);
            al.dni = dniList.get(i);
            alumnoList.add(al);
        }
    }

    /**
     * Se debe imprimir por pantalla el listado de alumnos.
     */
    public void mostrarAlumnos() {
        for (Alumno alumno : alumnoList) {
            System.out.println("Nombre: " + alumno.getNombreCompleto() + " C.I.:" + alumno.dni);
        }
    }

    /**
     * Crearemos un método votación en la clase Simulador que, recibe el listado
     * de alumnos y para cada alumno genera tres votos de manera aleatoria. En
     * este método debemos guardar a el alumno que vota, a los alumnos a los que
     * votó y sumarle uno a la cantidad de votos a cada alumno que reciba un
     * voto, que es un atributo de la clase Alumno. Tener en cuenta que un
     * alumno no puede votarse a sí mismo o votar más de una vez al mismo
     * alumno. Utilizar un hashset para resolver esto.
     */
    public void votacion() {

        for (Alumno alumno1 : alumnoList) {
            alumno1.numVotos = 0;
        }

        for (Alumno alumno : alumnoList) {

            Voto voto = new Voto();
            voto.setAl(alumno);
//            System.out.println("Votando alumno " + alumno.nombreCompleto);

            boolean ban = true;
            HashSet<Alumno> auxList = new HashSet<>();
            do {
                auxList.clear();
                for (int i = 0; i < 3; i++) {
                    //                   System.out.println("voto " + (i + 1));

                    Alumno al = alumnoList.get((int) (Math.random() * alumnoList.size()));
                    //                  System.out.println(al.nombreCompleto);
//                    System.out.println(al.dni != alumno.dni);
                    if (al.dni != alumno.dni) {
                        auxList.add(al);
                        //                     System.out.println("Lista de voto llegó a 3? " + (auxList.size() == 3));

                        if (auxList.size() == 3) {
                            ban = false;
//                            System.out.println("Puedo salir del while? " + !ban);
                        }
                    }
                }
            } while (ban);

//            System.out.println("********Contando votos*************");
            for (Alumno alumno1 : auxList) {
//                System.out.println(alumno1);
                alumno1.numVotos++;
//                System.out.print(alumno1.nombreCompleto + " " + alumno1.numVotos + " / ");

            }
            //           System.out.println("");
            ArrayList<Alumno> auxList2 = new ArrayList<>(auxList);
            voto.setVoto(auxList2);
            votoList.add(voto);

        }
    }

    /**
     * Se debe crear un método que muestre a cada Alumno con su cantidad de
     * votos y cuales fueron sus 3 votos.
     */
    public void muestraVotos() {
        int sumaVoto = 0;

        for (Voto alumno : votoList) {
            sumaVoto = sumaVoto + alumno.getAl().numVotos;
            System.out.print("El alumno " + alumno.getAl().nombreCompleto + " tiene " + alumno.getAl().getNumVotos() + " votos ");
            System.out.println("y votó por: ");
            for (Alumno alumno1 : alumno.getVoto()) {
                System.out.print(alumno1.nombreCompleto + " , ");

            }
            System.out.println("");
            System.out.println("");
        }
//        System.out.println("La suma de los votos es de " + sumaVoto);
    }

    /**
     * • Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se
     * deben crear 5 facilitadores suplentes con los 5 segundos alumnos más
     * votados. A continuación, mostrar los 5 facilitadores y los 5
     * facilitadores suplentes.
     */
    public void reconteoVoto() {
        Collections.sort(alumnoList, Comparadores.ordenaXVotos);
        int cont = 0;
        System.out.println("");
        System.out.println("**Lista de votos**");
        for (Alumno alumno1 : alumnoList) {
            System.out.println(alumno1.nombreCompleto + " votos: " + alumno1.numVotos);
        }
        System.out.println("");
        System.out.println("**Facilitadores**");
        for (Alumno alumno : alumnoList) {
            //           
            cont++;
            if (cont <= 5) {
                System.out.println("Facilitador principal " + cont + " " + alumno.nombreCompleto);
            } else if (cont <= 10) {
                System.out.println("Facilitador suplente " + (cont - 5) + " " + alumno.nombreCompleto);
            }

        }

    }
}
