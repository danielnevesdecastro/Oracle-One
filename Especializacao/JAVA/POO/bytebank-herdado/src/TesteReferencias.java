
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setNome("Daniel");
		g1.setSalario(5000.0);
		
		EditorVideo e1 = new EditorVideo();
		e1.setNome("Gabriel");
		e1.setSalario(2500.0);
		
		Designer d1 = new Designer();
		d1.setNome("Mauricio");
		d1.setSalario(2000.0);
		
		ControleBonificacao crtl = new ControleBonificacao();
		crtl.registra(g1);
		crtl.registra(e1);
		crtl.registra(d1);
		
		System.out.println(crtl.getSoma());
		
	}
}
