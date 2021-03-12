package contas;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {

	private LocalDate diaAniversario;
	private double taxaJuros;

	public ContaPoupanca(int agencia, int numero, String banco, double saldo, LocalDate diaAniversario,
			double taxaJuros) {
		super(agencia, numero, banco, saldo);
		this.diaAniversario = diaAniversario;
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getSaldo() {
		return super.saldo + taxaJuros * super.saldo;
	}

	public LocalDate getDiaAniversario() {
		return this.diaAniversario;
	}

	@Override
	public void saca(double valor) {
		if (saldoInsuficiente(valor)) {
			System.out.println("Saldo insuficinte");
		} else if (ehDiaAniversario() && taxaJuros <= 0.02) {
			saldo -= valor * 1.02;
			System.out.println("Saque realizado");
		} else {
			saldo -= valor;
			System.out.println("Saque realizado");
		}

	}

	private boolean saldoInsuficiente(double valor) {
		return super.saldo == 0.0 || valor > super.saldo;
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

	private boolean ehDiaAniversario() {
		int dayOfMonth = getDiaAniversario(diaAniversario);
		int monthValue = getMesAniversario(diaAniversario);

		LocalDate now = LocalDate.now();
		int dayOfMonthNow = getDiaAniversario(now);
		int monthValueNow = getMesAniversario(now);

		return dayOfMonth == dayOfMonthNow && monthValue == monthValueNow;
	}
	
	private int getDiaAniversario(LocalDate date) {
		return date.getDayOfMonth(); 
	}
	
	private int getMesAniversario(LocalDate date) {
		return date.getMonth().getValue();
	}

	@Override
	public String toString() {
		return super.toString() + ", taxaJuros=" + this.taxaJuros + ", diaAniversario="
				+ getDiaAniversario(diaAniversario) + "/" + getMesAniversario(diaAniversario) +", saldo="+ this.saldo;
	}
}
