package ar.edu.unju.escmi.tp4.dominio;

import java.util.Date;

public abstract class  Contrato {
	private Cliente cliente;
	private Inmobiliaria inmobiliaria;
	private Date fechaContrato;
	
	
	public Contrato() {
		super();
	}


	public Contrato(Cliente cliente, Inmobiliaria inmobiliaria, Date fechaContrato) {
		super();
		this.cliente = cliente;
		this.inmobiliaria = inmobiliaria;
		this.fechaContrato = fechaContrato;
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


	public Date getFechaContrato() {
		return fechaContrato;
	}



	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}



	public abstract void mostrarDatos();
	
}
