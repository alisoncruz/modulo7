package contas;

import java.time.LocalDate;

public class TesteContaPoupanca {

	public static void main(String[] args) {
		
		ContaPoupanca cPoupanca = new ContaPoupanca(2189, 3421, "Banco Internacional", 5000.0, LocalDate.of(2020, 03, 12), 0.01);
		
		System.out.println(cPoupanca);
		
		cPoupanca.saca(2000.0);
		
		System.out.println(cPoupanca.getSaldo());
		
		ContaPoupanca cPoupanca2 = new ContaPoupanca(2189, 4356, "Banco Internacional", 5000.0, LocalDate.of(2020, 05, 06), 0.1);
		
		System.out.println(cPoupanca2);
		
		cPoupanca2.saca(2000.0);
		
		System.out.println(cPoupanca2.getSaldo());
	
		cPoupanca2.deposita(2000.0);
		
		System.out.println(cPoupanca2.getSaldo());
	}
}
