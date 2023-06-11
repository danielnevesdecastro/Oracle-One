
public class TesteContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDamarcela = new Conta();
		System.out.println(contaDamarcela.saldo);
		
		contaDamarcela.titular = new Cliente();
		contaDamarcela.titular.nome = "Marcela";
		
		
		System.out.println(contaDamarcela.titular);
	
	}
}
