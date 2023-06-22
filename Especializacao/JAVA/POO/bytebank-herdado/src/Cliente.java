
public class Cliente implements Autenticavel {

	private AutenticaçãoDefault Autenticador;
	
	public Cliente() {
		this.Autenticador = new AutenticaçãoDefault();
	}
	
	@Override
	public boolean autentica(int senha) {
		return Autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.Autenticador.setSenha(senha);
	}

}
