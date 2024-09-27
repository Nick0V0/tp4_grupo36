package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp4.dominio.Terreno;

public class CollectionTerreno {
	
    public static List<Terreno> terrenos = new ArrayList<>();

    public static void agregarInmueble(Terreno terreno) {
        terrenos.add(terreno);
    }
    
    public static void mostrarInmuebles() {
        for (Terreno terreno : terrenos) {
            terreno.mostrarDatos();
        }
    }

}
