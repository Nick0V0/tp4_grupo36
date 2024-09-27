package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp4.dominio.ContratoCompraVenta;

public class CollectionontratoCompraVenta {
	public static List<ContratoCompraVenta> terrenos = new ArrayList<>();
	public static void agregarContratoAlquiler(ContratoCompraVenta contratoCompraVenta) {
        terrenos.add(contratoCompraVenta);
	}
}
