package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular = "Daniel";
		c1.saldo = 200;
		System.out.println(c1.saldo);

		c1.saldo +=100;
		
		System.out.println("Primeira Conta tem : " + c1.saldo);
		
		Conta c2 = c1;
		c2.saldo += 50;
		
		System.out.println("Segunda conta tem:"+c2.saldo);
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		
	}
}
