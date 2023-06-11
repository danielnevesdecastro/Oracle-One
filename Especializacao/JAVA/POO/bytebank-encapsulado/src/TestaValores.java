
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		//conta incosistente
		System.out.println(conta.getAgencia() + " \n" +conta.getNumero());
		
	}
}
