package ar.edu.unju.escmi.tp4.dominio;

import java.util.Date;

public class ContratoCompraVenta {
	private Date fechaContrato; 	
	private double impuestos;
	private Cliente cliente;
	private Inmobiliaria inmobiliaria;
	private Terreno terreno;
	
	public static double calcularMonto(Terreno terreno, double impuestos) {
		return (terreno.getPrecioVenta() + impuestos  );
	}
	
	
	public static void mostrarDatos(ContratoCompraVenta contrato) {
        System.out.println("Fecha de contrato: " + contrato.getFechaContrato());
        System.out.println("Impuestos: " + contrato.getImpuestos());
        System.out.println("Cliente: " + contrato.getCliente());
        System.out.println("Inmobiliaria: " + contrato.getInmobiliaria());
        System.out.println("Terreno: " + contrato.getTerreno());
    }

	public ContratoCompraVenta() {
		// TODO Auto-generated constructor stub
	}

	public ContratoCompraVenta(Date fechaContrato, double impuestos, Cliente cliente, Inmobiliaria inmobiliaria,
			Terreno terreno) {
		super();
		this.fechaContrato = fechaContrato;
		this.impuestos = impuestos;
		this.cliente = cliente;
		this.inmobiliaria = inmobiliaria;
		this.terreno = terreno;
	}


	public Date getFechaContrato() {
		return fechaContrato;
	}


	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}


	public double getImpuestos() {
		return impuestos;
	}


	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Inmobiliaria getInmobiliaria() {
		return inmobiliaria;
	}


	public void setInmobiliaria(Inmobiliaria inmobiliaria) {
		this.inmobiliaria = inmobiliaria;
	}


	public Terreno getTerreno() {
		return terreno;
	}


	public void setTerreno(Terreno terreno) {
		this.terreno = terreno;
	}
	
	
}
