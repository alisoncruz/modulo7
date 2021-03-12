package contas;

public class ContaSalario extends Conta {

	private final int limiteSaques = 3;
	private int saquesRealizados;

	public ContaSalario(int agencia, int numero, String banco, double saldo) {
		super(agencia, numero, banco, saldo);
	}

	@Override
	public double getSaldo() {
		return super.saldo;
	}

	@Override
	public void saca(double valor) {
		if (atingiuNumeroLimiteSaques()) {
			System.out.println("Limite de saques atingido.");
		} else if (saldoInsuficiente(valor)) {
			System.out.println("Saldo insuficiente.");
		} else {
			super.saldo -= valor;
			this.saquesRealizados++;
			System.out.println("Saque realizado.");
		}

	}

	private boolean atingiuNumeroLimiteSaques() {
		return !(this.saquesRealizados < this.limiteSaques);
	}

	private boolean saldoInsuficiente(double valor) {
		return super.saldo == 0.0 || valor > super.saldo;
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

	@Override
	public String toString() {
		return "Conta Salário " + super.toString() + ", saldo="+ getSaldo();
	}

}
