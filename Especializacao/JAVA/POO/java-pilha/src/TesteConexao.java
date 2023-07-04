
public class TesteConexao {
	public static void main(String[] args) {
		
		//Declaração simplificada 
		
		try (Conexao con =  new Conexao()){
			con.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Erro na Conexão !!!");
		}
		
		
		
		
		
		
//Declaração antiga 
//		Conexao con = null;
//
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro ");
//
//		} finally {
//			con.close();//sempre será executado
//		
//		}
		
	}
}
