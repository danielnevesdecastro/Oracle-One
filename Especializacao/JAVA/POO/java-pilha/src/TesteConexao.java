
public class TesteConexao {
	public static void main(String[] args) {
		
		//Declara��o simplificada 
		
		try (Conexao con =  new Conexao()){
			con.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Erro na Conex�o !!!");
		}
		
		
		
		
		
		
//Declara��o antiga 
//		Conexao con = null;
//
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro ");
//
//		} finally {
//			con.close();//sempre ser� executado
//		
//		}
		
	}
}
