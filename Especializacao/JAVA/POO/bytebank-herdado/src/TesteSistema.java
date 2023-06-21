
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		g.autentica(2222);
	
		
		Administrador adm = new Administrador();
		adm.autentica(2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(222);
		cliente.autentica(222);
		
		
	}

}
