package ar.edu.unju.escmi.tp4.dominio;

import java.util.Date;

public class ContratoAlquiler {
	private double precio;
	private Date fechaContrato;
	private int duracion;
	private double gastosInmobiliaria;
	private Inmobiliaria inmobiliaria;
	private Cliente cliente;
	private Vivienda vivienda;
	
	public double calcularMontoTotal(ContratoAlquiler contrato) {
		return (contrato.getPrecio()+contrato.getGastosInmobiliaria());
	}
	public static void mostrarDatos(ContratoAlquiler contrato) {       
        System.out.println("Precio: " + contrato.getPrecio());
        System.out.println("Fecha de contrato: " + contrato.getFechaContrato());
        System.out.println("Inmobiliaria: " + contrato.getInmobiliaria());        
        System.out.println("Vivienda: " + contrato.getVivienda());
    }
	
	public ContratoAlquiler() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public ContratoAlquiler(double precio, Date fechaContrato, int duracion, double gastosInmobiliaria,
			Inmobiliaria inmobiliaria, Cliente cliente, Vivienda vivienda) {
		super();
		this.precio = precio;
		this.fechaContrato = fechaContrato;
		this.duracion = duracion;
		this.gastosInmobiliaria = gastosInmobiliaria;
		this.inmobiliaria = inmobiliaria;
		this.cliente = cliente;
		this.vivienda = vivienda;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getGastosInmobiliaria() {
		return gastosInmobiliaria;
	}

	public void setGastosInmobiliaria(double gastosInmobiliaria) {
		this.gastosInmobiliaria = gastosInmobiliaria;
	}

	public Inmobiliaria getInmobiliaria() {
		return inmobiliaria;
	}

	public void setInmobiliaria(Inmobiliaria inmobiliaria) {
		this.inmobiliaria = inmobiliaria;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vivienda getVivienda() {
		return vivienda;
	}
	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}
	
	
}
