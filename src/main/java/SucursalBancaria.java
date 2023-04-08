import java.util.ArrayList;

public class SucursalBancaria {
	private String nonbreSucursal;
	private int codigoSucursal;
	private int codigoPostal;
	public ArrayList<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();

	public int getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getNonbreSucursal() {return nonbreSucursal;}

	public void setNonbreSucursal(String nonbreSucursal) {this.nonbreSucursal = nonbreSucursal;}

	public SucursalBancaria(String nonbreSucursal, int codigoSucursal, int codigoPostal) {
		this.nonbreSucursal = nonbreSucursal;
		this.codigoSucursal = codigoSucursal;
		this.codigoPostal = codigoPostal;
		this.cuentas = new ArrayList<CuentaBancaria>();
	}

	public void agregarCuenta(CuentaBancaria cuenta) {
		this.cuentas.add(cuenta);
	}
	public ArrayList<CuentaBancaria> getCuentas() {
		return this.cuentas;
	}
}