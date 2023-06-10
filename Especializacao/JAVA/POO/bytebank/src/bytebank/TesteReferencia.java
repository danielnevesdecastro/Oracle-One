package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.saldo = 50;
		System.out.println("1 Conta :" + c1.saldo);

		Conta c2 = c1;
		System.out.println("2 Conta - > 1Conta :" + c2.saldo);
		c2.saldo = 100;
		System.out.println("2 Conta - > 1Conta :" + c2.saldo);
		System.out.println("1 Conta :" + c1.saldo);

		System.out.println(c1);
		System.out.println(c2);

		Conta c3 = new Conta();
		System.out.println(c3);

	}
}
