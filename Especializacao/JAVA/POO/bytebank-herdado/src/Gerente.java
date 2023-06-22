
public class Gerente extends Funcionario implements Autenticavel {

	private Autentica��oDefault autenticador;
	

	public Gerente() {
		this.autenticador = new Autentica��oDefault();
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
