/*
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package servicio;

import entidad.Carta;
import entidad.Cartas;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author usuario
 */
public class ServicioCartas {

    Cartas c1 = new Cartas();
    
    ArrayList<Carta> maso = new ArrayList<>();
    ArrayList<Carta> monton = new ArrayList<>();

    public void crearMaso() {

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 12; i++) {
                if (!((i == 7) || (i == 8))) {
                    String pinta = " ";
                    switch (j) {
                        case 0:
                            pinta =pinta+ "espadas";
                            break;
                        case 1:
                            pinta = pinta+"bastos";
                            break;
                        case 2:
                            pinta = pinta+"oros";
                            break;
                        case 3:
                            pinta = pinta +"copas";
                            break;
                    }
                    
                    Carta c = new Carta((i + 1), pinta);
                    maso.add(c);
                }
            }

        }
        c1.setMaso(maso);
        c1.setMoton(monton);
        System.out.println("Maso creado satisfactoriamente");
        System.out.println("");
        //System.out.println(c1);
    }

    public void barajar(){
        Collections.shuffle(c1.getMaso());
        //System.out.println(c1);
        System.out.println("Maso baraado satisfactoriamente");
        System.out.println("");
    }
 
    public void siguienteCarta(){
        if (c1.getMaso().size()>0){
            c1.getMoton().add(c1.getMaso().get(0));
            c1.getMaso().remove(0);
            System.out.println("Se bajó la carta al monton satisfactorio");
        }else{
            System.out.println("No hay mas cartas en el maso");
        }
        
        //System.out.println(c1);
        System.out.println("");
    }
    
    public void cartasDisponibles(){
        System.out.println("Las cartas diponiles en el maso son: "+c1.getMaso().size());
        System.out.println("");
    }
    /*
    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
    */
    public void darCartas(int numCartas){
        if (c1.getMaso().size()>numCartas){
            for (int i = 0; i < numCartas; i++) {
                c1.getMaso().remove(0);
            }
            System.out.println("Se dieron "+numCartas+" cartas.");
        }else{
            System.out.println("No ha tantas cartas disponibles en el maso, solo quedan "+c1.getMaso().size()+" cartas.");
            
        }
        System.out.println("");
    }
    /**
     * cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
     */
    public void cartasMonton(){
        System.out.println("Las cartas en el monton son: ");
        System.out.println(c1.getMoton());
        System.out.println("");
    }
    
    public void mostrarBaraja(){
        System.out.println("Las cartas en el maso son: ");
        System.out.println(c1.getMaso());
        System.out.println("");
    }
}
