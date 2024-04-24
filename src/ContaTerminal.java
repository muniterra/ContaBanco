import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Por favor, digite o número da Conta: %n");
		int numConta = scan.nextInt();
		
		System.out.printf("Por favor, digite o número da Agência: %n");
		String numAgencia = scan.next();
		
		System.out.printf("Por favor, digite o nome do cliente: %n");
		String nomeCliente = scan.next();
		
		System.out.printf("Por favor, digite o saldo da conta: %n");
		double saldo = scan.nextDouble();

		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
				+ "sua agência é %s, conta %d e seu saldo %.2f já está disponível"
				+ " para saque", nomeCliente, numAgencia, numConta, saldo);
	}

}
