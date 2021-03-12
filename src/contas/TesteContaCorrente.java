package contas;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(3456, 054321, "Banco Nacional", 2000.0, 3000.0);
		System.out.println(contaCorrente);

		contaCorrente.saca(5010.0);
		contaCorrente.deposita(2000.0);

		System.out.println("Saldo p�s dep�sito " + contaCorrente.getSaldo());
		
		contaCorrente.saca(7000.0);

		System.out.println("Saldo p�s saque " + contaCorrente.getSaldo());
	}
}
