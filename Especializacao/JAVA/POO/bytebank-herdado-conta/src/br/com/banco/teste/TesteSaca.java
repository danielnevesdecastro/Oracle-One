package br.com.banco.teste;
import br.com.banco.modelo.Conta;
import br.com.banco.modelo.ContaCorrente;
import br.com.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200.0);

		try {
			conta.saca(210.0);
		} catch (SaldoInsuficienteException saldoEx) {
			System.out.println("Opera��o Negada : \n" + saldoEx.getMessage());
		}

		System.out.printf("%.2f", conta.getSaldo());
	}
}