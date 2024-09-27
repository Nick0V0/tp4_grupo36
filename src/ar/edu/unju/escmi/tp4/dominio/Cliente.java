package ar.edu.unju.escmi.tp4.dominio;

public class Cliente {
	public String nombre;
	public String apellido;
	public String dni;
	public String telefono;
	public String direccion;
	public String email;
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String nombre, String apellido, String dni, String telefono, String direccion, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}

	public static void mostrarDatos() {
	};
	
	
}

