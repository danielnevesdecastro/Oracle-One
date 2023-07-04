
public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("Abrindo conexao ...");
	}

	public void leDados() {
		System.out.println("Recebendo dados ...");
		throw new IllegalStateException();// Indica objeto com estado inconsistente;
	}


	@Override
	public void close() {
		System.out.println("Fechando conexao.");
		

	}
}
