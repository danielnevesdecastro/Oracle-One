
public class Cliente implements Autenticavel {

	private Autentica��oDefault Autenticador;
	
	public Cliente() {
		this.Autenticador = new Autentica��oDefault();
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
