import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String rut;
	public ArrayList<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Cliente(String nombre, String rut) {
		this.nombre = nombre;
		this.rut = rut;
	}
	public void asociarCuenta(CuentaBancaria cuenta){
		this.cuentas.add(cuenta);
	}
}