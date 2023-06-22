
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticaçãoDefault autenticador;
	

	public Gerente() {
		this.autenticador = new AutenticaçãoDefault();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public double getBonificacao() {
		return super.getSalario();
	}
}
