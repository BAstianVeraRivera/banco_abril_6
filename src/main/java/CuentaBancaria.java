import java.util.Scanner;

public abstract class CuentaBancaria {
	private int nroCuenta;
	private String fechaApertura;
	private int saldo;
	private Cliente cliente;

	public int getNroCuenta() {
		return this.nroCuenta;
	}

	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public String getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public CuentaBancaria(int nroCuenta, String fechaApertura, int saldo) {
		this.nroCuenta = nroCuenta;
		this.fechaApertura = fechaApertura;
		this.saldo = saldo;
	}
	public void agregarCliente(Cliente cliente) {
		this.cliente=cliente;
	}
	public abstract String getTipo();
}