package ar.edu.unju.escmi.tp4.dominio;

public class Vivienda extends Inmueble {
	

	private String direccion;
	private int habitaciones;
	private double precioAlquiler;
	
	public Vivienda() {
		// TODO Auto-generated constructor stub
	}
	
	
    public Vivienda(int codigo, boolean disponible, String direccion, int habitaciones, double precioAlquiler) {
        super(codigo, disponible);
        this.direccion = direccion;
        this.habitaciones = habitaciones;
        this.precioAlquiler = precioAlquiler;
    }
	
	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		System.out.println("Vivienda: " + codigo);
		System.out.println("Direccion: " + direccion);
		System.out.println("Habitaciones: " + habitaciones);
		System.out.println("Precio Venta $: " + precioAlquiler);
		System.out.println("Estado: " + disponible);
	}

}
