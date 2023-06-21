
public class Cliente implements Autenticavel {

	private int senha;

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acessando...");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
