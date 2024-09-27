package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp4.dominio.Vivienda;

public class CollectionVivienda {

	 public static List<Vivienda> viviendas = new ArrayList<>();

	    public static void agregarInmueble(Vivienda vivienda) {
	        viviendas.add(vivienda);
	    }
	    
	    public static void mostrarInmuebles() {
	        for (Vivienda vivienda : viviendas) {
	            vivienda.mostrarDatos();
	        }
	    }
}
