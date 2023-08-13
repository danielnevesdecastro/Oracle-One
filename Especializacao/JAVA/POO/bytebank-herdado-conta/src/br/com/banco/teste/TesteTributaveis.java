package br.com.banco.teste;
import br.com.banco.modelo.CalculadorDeImposto;
import br.com.banco.modelo.ContaCorrente;
import br.com.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 323);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calcImp = new CalculadorDeImposto();
		calcImp.registra(cc);
		calcImp.registra(seguro);
		
		System.out.println(calcImp.getTotalImposto());
		
		
	}
}
