
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		double valorSaque = valor + 0.2;
		return super.saca(valorSaque);
	}
	
	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;
	}
}
