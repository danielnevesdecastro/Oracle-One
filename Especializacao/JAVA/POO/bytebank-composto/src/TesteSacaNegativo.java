
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);;
		System.out.println("Saldo: "+conta.getSaldo());
		
		System.out.println("Sacou ?" +conta.saca(200));
		System.out.println("Saldo: "+ conta.getSaldo());
		
		
		//proibido
		//conta.setSaldo(-101);
		
		System.out.println("Saldo: "+ conta.getSaldo());
	}
}
