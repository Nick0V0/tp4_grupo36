package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp4.dominio.Inmueble;

public class CollectionInmueble {
	
    public static List<Inmueble> inmuebles = new ArrayList<>();

    public static void agregarInmueble(Inmueble inmueble) {
        inmuebles.add(inmueble);
    }
    
    public static void mostrarInmuebles() {
        for (Inmueble inmueble : inmuebles) {
            inmueble.mostrarDatos();
        }
    }

}
