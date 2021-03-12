package contas;

public class ContaCorrente extends Conta {

private double chequeEspecial;
	
	public ContaCorrente(int agencia, int numero, String banco, double saldo, double chequeEspecial) {
		super(agencia, numero, banco, saldo);
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}


	@Override
	public double getSaldo() {
		return super.saldo + chequeEspecial;
	}

	@Override
	public void saca(double valor) {
		if(saldoInsuficiente(valor)) {
			System.out.println("Saldo insuficiente.");
		} else {
			super.saldo -= valor;
			System.out.println("Saque realizado.");
		}
		
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	private boolean saldoInsuficiente(double valor) {
		return super.saldo == 0.0 || valor > getSaldo();
	}
	
	@Override
	public String toString() {
		return "Conta Corrrente "+ super.toString() + ", cheque especial=" + this.chequeEspecial + ", saldo=" + getSaldo();
	}

}
