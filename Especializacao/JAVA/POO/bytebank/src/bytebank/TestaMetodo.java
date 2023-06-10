package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaUm = new Conta();
		Conta contaDois = new Conta();
		
		contaUm.deposita(250);
		contaDois.deposita(50);
		System.out.println(contaUm.saldo);

		contaUm.deposita(250);
		System.out.println(contaUm.saldo);

		boolean sacou = contaUm.saca(150);
		System.out.println("Sacou ? " + sacou);
		System.out.println("Saldo Conta 1: " + contaUm.saldo);
		System.out.println("Saldo Conta 2: " + contaDois.saldo);
		
		boolean transferiu = contaUm.transfere(50, contaDois);
		System.out.println("Transferiu ? " + transferiu);
		System.out.println("Saldo Conta 1: " + contaUm.saldo);
		System.out.println("Saldo Conta 2: " + contaDois.saldo);
		
		
		
		
	}

}
