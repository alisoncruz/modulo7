package contas;

public abstract class Conta {

	private int agencia;
	private int numero;
	private String banco;
	protected double saldo;
	
	
	
	public Conta(int agencia, int numero, String banco, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.banco = banco;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getBanco() {
		return banco;
	}
	
	public abstract double getSaldo();
	
	public abstract void saca(double valor);
	
	public abstract void deposita(double valor);

	@Override
	public String toString() {
		return "agencia=" + agencia + ", numero=" + numero + ", banco=" + banco;
	}
	
}
