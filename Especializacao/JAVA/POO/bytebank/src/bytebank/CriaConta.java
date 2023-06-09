package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.saldo = 200;
		c1.titular = "Daniel";
		
		System.out.println(c1.saldo);
		
	}
}
