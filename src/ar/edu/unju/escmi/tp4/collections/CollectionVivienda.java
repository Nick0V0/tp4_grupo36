package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp4.dominio.Vivienda;

public class CollectionVivienda {
	public static List<Vivienda> viviendas = new ArrayList<>();

	public static void agregarVivienda(Vivienda vivienda) {
		viviendas.add(vivienda);
		System.out.println("Vivienda agregada correctamente.");
	}

	public static void mostrarViviendasDisponibles() {
		System.out.println("Viviendas disponibles para alquiler:");
		for (Vivienda vivienda : viviendas) {
			if (vivienda.isDisponible()) {
				vivienda.mostrarDatos();
			}
		}
	}

	public static void mostrarViviendasAlquiladas() {
		System.out.println("Viviendas alquiladas:");
		for (Vivienda vivienda : viviendas) {
			if (!vivienda.isDisponible()) {
				vivienda.mostrarDatos();
			}
		}
	}
}