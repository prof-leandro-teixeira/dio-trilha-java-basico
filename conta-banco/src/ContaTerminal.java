import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldoConta = 0.00;

        Scanner s = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco BNC!");
        System.out.println("Vamos criar uma conta para você...");
        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = s.next();
        s.nextLine();
        System.out.println("Por favor, digite o número da agência: ");
        agencia = s.next();
        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = s.nextInt();
        System.out.println("Por favor, informe o valor de depósito para abertura da conta: ");
        saldoConta = s.nextDouble();

        s.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco." +
                " Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo" +
                saldoConta + " já está disponível para saque.");

    }
}
