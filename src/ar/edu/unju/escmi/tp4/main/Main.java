package ar.edu.unju.escmi.tp4.main;

import java.util.ArrayList;
import java.util.Scanner;
import ar.edu.unju.escmi.tp4.dominio.Cliente;
import ar.edu.unju.escmi.tp4.dominio.Terreno;
import ar.edu.unju.escmi.tp4.dominio.Vivienda;


public class Main {
    // Listas para almacenar los datos de los inmuebles, clientes, y ventas
    static ArrayList<Vivienda> viviendas = new ArrayList<>();
    static ArrayList<Terreno> terrenos = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Vivienda> viviendasAlquiladas = new ArrayList<>();
    static ArrayList<Terreno> terrenosVendidos = new ArrayList<>();
    static double totalVentasTerrenos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("---- Menú Principal ----");
            System.out.println("1 – Registrar terreno");
            System.out.println("2 – Registrar vivienda");
            System.out.println("3 - Registrar cliente");
            System.out.println("4 – Alquiler de vivienda");
            System.out.println("5 – Venta de terreno");
            System.out.println("6 – Consultar inmuebles (disponibles)");
            System.out.println("7 – Consultar viviendas alquiladas");
            System.out.println("8 – Consultar terrenos vendidos");
            System.out.println("9 – Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarTerreno(scanner);
                    break;
                case 2:
                    registrarVivienda(scanner);
                    break;
                case 3:
                    registrarCliente(scanner);
                    break;
                case 4:
                    alquilerVivienda(scanner);
                    break;
                case 5:
                    ventaTerreno(scanner);
                    break;
                case 6:
                    consultarInmuebles(scanner);
                    break;
                case 7:
                    consultarViviendasAlquiladas();
                    break;
                case 8:
                    consultarTerrenosVendidos();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 9);

        scanner.close();
    }

    // Métodos para manejar cada opción del menú

    public static void registrarTerreno(Scanner scanner) {
        System.out.print("Ingrese el código del terreno: ");
        int codigo = scanner.nextInt();
        System.out.print("¿Está disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();
        System.out.print("Ingrese la latitud: ");
        double latitud = scanner.nextDouble();
        System.out.print("Ingrese la longitud: ");
        double longitud = scanner.nextDouble();
        System.out.print("Ingrese la superficie en m2: ");
        double superficie = scanner.nextDouble();
        System.out.print("Ingrese el precio de venta: ");
        double precioVenta = scanner.nextDouble();

        Terreno terreno = new Terreno(codigo, disponible, latitud, longitud, superficie, precioVenta);
        terrenos.add(terreno);
        System.out.println("Terreno registrado exitosamente.");
    }

    public static void registrarVivienda(Scanner scanner) {
        System.out.print("Ingrese el código de la vivienda: ");
        int codigo = scanner.nextInt();
        System.out.print("¿Está disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();
        scanner.nextLine();  // Consumir salto de línea
        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el número de habitaciones: ");
        int habitaciones = scanner.nextInt();
        System.out.print("Ingrese el precio de alquiler: ");
        double precioAlquiler = scanner.nextDouble();

        Vivienda vivienda = new Vivienda(codigo, disponible, direccion, habitaciones, precioAlquiler);
        viviendas.add(vivienda);
        System.out.println("Vivienda registrada exitosamente.");
    }

    public static void registrarCliente(Scanner scanner) {
        scanner.nextLine();  // Consumir salto de línea
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, apellido, dni, telefono, direccion, email);
        clientes.add(cliente);
        System.out.println("Cliente registrado exitosamente.");
    }

    public static void alquilerVivienda(Scanner scanner) {
        System.out.print("Ingrese el código de la vivienda que desea alquilar: ");
        int codigo = scanner.nextInt();

        for (Vivienda vivienda : viviendas) {
            if (vivienda.getCodigo() == codigo && vivienda.isDisponible()) {
                vivienda.setDisponible(false);
                viviendasAlquiladas.add(vivienda);
                System.out.println("Vivienda alquilada exitosamente.");
                return;
            }
        }
        System.out.println("Vivienda no disponible o no encontrada.");
    }

    public static void ventaTerreno(Scanner scanner) {
        System.out.print("Ingrese el código del terreno que desea vender: ");
        double codigo = scanner.nextDouble();

        for (Terreno terreno : terrenos) {
            if (terreno.getCodigo() == codigo && terreno.isDisponible()) {
                terreno.setDisponible(false);
                terrenosVendidos.add(terreno);
                totalVentasTerrenos += terreno.getPrecioVenta();
                System.out.println("Terreno vendido exitosamente.");
                return;
            }
        }
        System.out.println("Terreno no disponible o no encontrado.");
    }

    public static void consultarInmuebles(Scanner scanner) {
        System.out.println("¿Qué tipo de inmueble desea consultar? (1. Viviendas, 2. Terrenos): ");
        int tipo = scanner.nextInt();

        if (tipo == 1) {
            System.out.println("Viviendas disponibles:");
            for (Vivienda vivienda : viviendas) {
                if (vivienda.isDisponible()) {
                    vivienda.mostrarDatos();
                }
            }
        } else if (tipo == 2) {
            System.out.println("Terrenos disponibles:");
            for (Terreno terreno : terrenos) {
                if (terreno.isDisponible()) {
                    terreno.mostrarDatos();
                }
            }
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static void consultarViviendasAlquiladas() {
        System.out.println("Viviendas alquiladas:");
        for (Vivienda vivienda : viviendasAlquiladas) {
            vivienda.mostrarDatos();
        }
    }

    public static void consultarTerrenosVendidos() {
        System.out.println("Terrenos vendidos:");
        for (Terreno terreno : terrenosVendidos) {
            terreno.mostrarDatos();
        }
        System.out.println("Monto total de ventas de terrenos: $" + totalVentasTerrenos);
    }
}
