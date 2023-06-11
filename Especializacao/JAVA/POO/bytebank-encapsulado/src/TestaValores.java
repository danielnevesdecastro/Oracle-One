
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24626);
		Conta conta2 = new Conta(1337, 24126);
		Conta conta3 = new Conta(1337, 24246);
		conta2.deposita(100);
		conta3.deposita(100);
		
		System.out.println(conta.getAgencia() + " \n" +conta.getNumero());
		
		System.out.println(Conta.getTotal());
	}
}
