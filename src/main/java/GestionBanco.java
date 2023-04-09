import java.sql.SQLOutput;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionBanco {
	public static ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();
	public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public static void main(String[] args) {
		inicializar();
	}

	public static void inicializar() {
		Cliente cliente1 = new Cliente("Juan", "12345678");
		Cliente cliente2 = new Cliente("Ana", "87654321");
		SucursalBancaria sucursal1 = new SucursalBancaria("Sucursal 1",00001,1000);
		SucursalBancaria sucursal2 = new SucursalBancaria("Sucursal 2",00002,2000);
		Corriente cuenta1 = new Corriente(1345, "01/01/2020", 1000, "");
		Ahorro cuenta2 = new Ahorro(456, "02/02/2020", 2000, 0.2);
		Corriente cuenta3 = new Corriente(2345, "03/03/2020", 3000, "");
		Ahorro cuenta4 = new Ahorro(245, "04/04/2020", 4000, 9.3);
		clientes.add(cliente1);
		clientes.add(cliente2);
		cuentasBancarias.add(cuenta1);
		cuentasBancarias.add(cuenta2);
		cuentasBancarias.add(cuenta3);
		cuentasBancarias.add(cuenta4);
		// ASOCIAR CUENTAS A SUCURSALES
		sucursal1.agregarCuenta(cuenta1);
		sucursal1.agregarCuenta(cuenta4);
		sucursal2.agregarCuenta(cuenta2);
		sucursal2.agregarCuenta(cuenta3);
		//ASOCIAR CUENTAS A CLIENTES
		cliente1.agregarCuenta(cuenta1);
		cliente1.agregarCuenta(cuenta4);
		cliente2.agregarCuenta(cuenta2);
		cliente2.agregarCuenta(cuenta3);
		System.out.println("CUENTAS DE AHORRO SUCURSAL 1");
		// OBTENER CUENTAS DE AHORRO DE UNA SUCURSAL
		ArrayList<Ahorro> cuentasAhorroSucursal1 = obtenerCuentasAhorro(sucursal1);
		for (Ahorro cuenta : cuentasAhorroSucursal1) {
			System.out.println(cuenta);
		}
		System.out.println("CUENTAS CORRIENTE SUCURSAL 1");
		// OBTENER CUENTAS CORRIENTE DE UNA SUCURSAL
		ArrayList<Corriente> cuentasCorrienteSucursal1 = obtenerCuentasCorrientes(sucursal1);
		for (Corriente cuenta : cuentasCorrienteSucursal1) {
			System.out.println(cuenta);
		}
		System.out.println("CUENTAS ASOCIADAS DEL CLIENTE 1");
		// OBTENER CUENTAS DE UN CLIENTES
		ArrayList<CuentaBancaria> cuentasCliente1 = obtenerCuentasTotales(cliente1);
		for (CuentaBancaria cuenta : cuentasCliente1) {
			System.out.println(cuenta);
		}
	}
	// OBTENER CUENTAS DE AHORRO DE SUCURSAL
	public static ArrayList<Ahorro> obtenerCuentasAhorro(SucursalBancaria sucursalBancaria) {
		ArrayList<Ahorro> cuentasAhorro = new ArrayList<Ahorro>();
		for (CuentaBancaria cuentaBancaria : sucursalBancaria.cuentas) {
			if (cuentaBancaria instanceof Ahorro) {
				cuentasAhorro.add((Ahorro) cuentaBancaria);
			}
		}
		return cuentasAhorro;
	}
	// OBTENER CUENTAS CORRIENTES DE SUCURSAL
	public static ArrayList<Corriente> obtenerCuentasCorrientes(SucursalBancaria sucursalBancaria) {
		ArrayList<Corriente> cuentasCorriente = new ArrayList<Corriente>();
		for (CuentaBancaria cuentaBancaria : sucursalBancaria.cuentas) {
			if (cuentaBancaria instanceof Corriente) {
				cuentasCorriente.add((Corriente) cuentaBancaria);
			}
		}
		return cuentasCorriente;
	}
	// OBTENER CUENTAS TOTALES DE CLIENTES
	public static ArrayList<CuentaBancaria> obtenerCuentasTotales(Cliente cliente) {
		ArrayList<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
		for (CuentaBancaria cuentaBancaria : cliente.cuentas) {
			if (cuentaBancaria instanceof CuentaBancaria) {
				cuentas.add((CuentaBancaria) cuentaBancaria);
			}
		}
		return cuentas;
	}



	public void crearCliente(Cliente cliente) {
		this.clientes.add(cliente);
		System.out.println("Cliente agregado");
	}

	public void crearCuentaBancaria(CuentaBancaria cuenta) {
		this.cuentasBancarias.add(cuenta);
		System.out.println("Cuenta agregada");

	}
	public Cliente buscarCLiente(String nombre) {
		for (Cliente cliente : this.clientes) {
			if (cliente.getNombre().equals(nombre)) {
				return cliente;
			}
		}
		return null;
	}
}