public class Ahorro extends CuentaBancaria {
	private double reajuste;

	public double getReajuste() {
		return this.reajuste;
	}

	public void setReajuste(double reajuste) {
		this.reajuste = reajuste;
	}

	public Ahorro(int nroCuenta, String fechaApertura, int saldo, double reajuste) {
		super(nroCuenta, fechaApertura, saldo);
		this.reajuste = reajuste;
	}
	public String getTipo() {
		return "Cuenta ahorro";
	}
}