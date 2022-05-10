package teste;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
					
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		cp.saca(150);	
		cp.deposita(300);
		
		
		
		//System.out.println("CC: " + cc.getSaldo());
		//System.out.println("CP: " + cp.getSaldo());
		//System.out.println(cp.getSaldo());
	}
}
