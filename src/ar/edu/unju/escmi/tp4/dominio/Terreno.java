package ar.edu.unju.escmi.tp4.dominio;

public class Terreno extends Inmueble{

	private double latitud;
	private double longitud;
	private double superficie;
	private double precioVenta;
	
	public Terreno() {
		// TODO Auto-generated constructor stub
	}
	
    public Terreno(int codigo, boolean disponible, double latitud, double longitud, double superficie, double precioVenta) {
        super(codigo, disponible);
        this.latitud = latitud;
        this.longitud = longitud;
        this.superficie = superficie;
        this.precioVenta = precioVenta;
    }
	
	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		System.out.println("Terreno: " + codigo);
		System.out.println("Latitud: " + latitud);
		System.out.println("Longitud: " + longitud);
		System.out.println("Superficie: " + superficie);
		System.out.println("Precio Venta $: " + precioVenta);
		System.out.println("Estado: " + disponible);
	}
}
