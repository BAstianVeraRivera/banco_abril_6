public class Corriente extends CuentaBancaria {
	private String lineaSobregiro;

	public String getLineaSobregiro() {
		return this.lineaSobregiro;
	}

	public void setLineaSobregiro(String lineaSobregiro) {
		this.lineaSobregiro = lineaSobregiro;
	}

	public Corriente(int nroCuenta, String fechaApertura, int saldo, String lineaSobregiro) {
		super(nroCuenta, fechaApertura, saldo);
		this.lineaSobregiro = lineaSobregiro;
	}
	public String getTipo() {
		return "Corriente";
	}
}