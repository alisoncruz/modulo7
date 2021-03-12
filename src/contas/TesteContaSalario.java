package contas;

public class TesteContaSalario {

	public static void main(String[] args) {
		
		ContaSalario cSalario1 = new ContaSalario(4356, 03245, "Banco Americano", 2000.0);
		ContaSalario cSalario2 = new ContaSalario(4356, 03342, "Banco Americano", 3000.0);
		
		System.out.println(cSalario1);
		
			cSalario1.saca(10.0);
			cSalario1.saca(10.0);
			cSalario1.saca(10.0);
			cSalario1.saca(10.0);
			
			System.out.println("Saldo cSalario1 pós saque: "+cSalario1.getSaldo());
		
			System.out.println();
			System.out.println(cSalario2);
			
			cSalario2.saca(4000.0);
			cSalario2.saca(3000.0);
			cSalario2.saca(1.0);
			
			System.out.println("Saldo cSalario1 pós saque: "+cSalario2.getSaldo());
			
			cSalario2.deposita(500.0);
			
			System.out.println("Saldo cSalario2 pós depósito: "+cSalario2.getSaldo());
}
}
