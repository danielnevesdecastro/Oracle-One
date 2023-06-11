
public class TesteGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1 , 11);
		// conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
	
		Cliente daniel = new Cliente();
		daniel.setNome("Daniel neves");
		conta.setTitular(daniel);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Desenvolvedor");
		
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
