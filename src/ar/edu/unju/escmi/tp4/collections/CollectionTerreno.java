package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp4.dominio.Terreno; 

public class CollectionTerreno {

    public static List<Terreno> terrenos = new ArrayList<>();

    public static void agregarTerreno(Terreno terreno) {
        terrenos.add(terreno);
        System.out.println("Terreno agregado correctamente.");
    }

    public static void mostrarTerrenosDisponibles() {
        System.out.println("Terrenos disponibles para la venta:");
        for (Terreno terreno : terrenos) {
            if (terreno.isDisponible()) { 
                terreno.mostrarDatos();  
            }
        }
    }

    public static void mostrarTerrenosVendidos() {
        double totalVentas = 0;
        System.out.println("Terrenos vendidos:");
        for (Terreno terreno : terrenos) {
            if (!terreno.isDisponible()) {  
                terreno.mostrarDatos(); 
                totalVentas += terreno.getPrecioVenta(); 
            }
        }
        System.out.println("Monto total de todas las ventas: $" + totalVentas);
    }
}
