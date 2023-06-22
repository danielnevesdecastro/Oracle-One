
public class AutenticaçãoDefault {
	
	private int senha;

	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acessando...");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}

	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
