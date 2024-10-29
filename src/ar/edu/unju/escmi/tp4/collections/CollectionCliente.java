package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp4.dominio.Cliente;
import ar.edu.unju.escmi.tp4.dominio.Vivienda;

public class CollectionCliente {
	public static List<Cliente> clientes = new ArrayList<>();
	
	static {
		clientes.add(new Cliente("Juan", "Pérez", "12345678", "1122334455", "Calle Falsa 123", "juan.perez@mail.com"));
		clientes.add(new Cliente("María", "García", "87654321", "2233445566", "Avenida Siempre Viva 742", "maria.garcia@mail.com"));
		clientes.add(new Cliente("Carlos", "López", "23456789", "3344556677", "Calle Luna 78", "carlos.lopez@mail.com"));
		clientes.add(new Cliente("Ana", "Martínez", "98765432", "4455667788", "Plaza Mayor 5", "ana.martinez@mail.com"));
		clientes.add(new Cliente("Luis", "Hernández", "34567890", "5566778899", "Calle de las Flores 9", "luis.hernandez@mail.com"));
		clientes.add(new Cliente("Laura", "González", "09876543", "6677889900", "Avenida de los Pinos 14", "laura.gonzalez@mail.com"));
		clientes.add(new Cliente("José", "Rodríguez", "45678901", "7788990011", "Callejón del Gato 23", "jose.rodriguez@mail.com"));
		clientes.add(new Cliente("Sofía", "Fernández", "10987654", "8899001122", "Boulevard de los Andes 50", "sofia.fernandez@mail.com"));
		clientes.add(new Cliente("Miguel", "Torres", "56789012", "9900112233", "Avenida de la Paz 32", "miguel.torres@mail.com"));
		clientes.add(new Cliente("Lucía", "Díaz", "21098765", "0011223344", "Calle del Mercado 8", "lucia.diaz@mail.com"));
	}

	public static void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("Cliente agregado correctamente.");
	}

	public static void mostrarClientes() {
		System.out.println("Lista de clientes:");
		for (Cliente cliente : clientes) {
			cliente.getDni();
		}
	}

	public static Cliente buscarClientePorDni(String dni) {
		for (Cliente cliente : clientes) {
			if (cliente.getDni().equals(dni)) {
				return cliente;
			}
		}
		System.out.println("Cliente no encontrado.");
		return null;
	}
}
