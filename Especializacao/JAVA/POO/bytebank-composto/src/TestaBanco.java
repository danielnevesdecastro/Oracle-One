
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente daniel = new Cliente();
		daniel.nome = "Daniel Neves";
		daniel.cpf = "088.058.045-88";
		daniel.profissao = "Desenvolvedor Java";
		
		Conta contaDoDaniel = new Conta();
		contaDoDaniel.titular = daniel;
		contaDoDaniel.deposita(50);
		
		System.out.println(contaDoDaniel.titular.nome);
		System.out.println("titular da Conta: "+contaDoDaniel.titular);
		System.out.println("Cliente: "+daniel);
		
		
		
		
		
	}
}
