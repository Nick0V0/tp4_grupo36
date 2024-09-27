package ar.edu.unju.escmi.tp4.collections;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp4.dominio.ContratoAlquiler;
public class CollectionContratoAlquiler {
	public static List<ContratoAlquiler> terrenos = new ArrayList<>();
	public static void agregarContratoAlquiler(ContratoAlquiler contratoAlquiler) {
        terrenos.add(contratoAlquiler);
    }
}
