
public class Administrador extends Funcionario implements Autenticavel {

	private Autentica��oDefault autenticador;


	public Administrador() {
		this.autenticador = new Autentica��oDefault();
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

}
