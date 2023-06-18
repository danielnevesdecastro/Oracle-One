
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Daniel Neves");
		g1.setCpf("045045045-48");
		g1.setSalario(5800.0);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario() + " R$");

		g1.setSenha(2222);
		boolean passouSenha = g1.autentica(2222);
		System.out.println(passouSenha);
	}
}
