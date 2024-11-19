import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        System.out.print("Digite o valor inicial da conta: ");
        int saldoInicial = scanner.nextInt();

        contaBancaria minhaConta = new contaBancaria(titular, saldoInicial);

        System.out.println("Conta criada com sucesso para: " + minhaConta.getTitular());
        System.out.println("Saldo inicial de " + minhaConta.getSaldo());

        System.out.print("Deseja realizar algum deposito? (s/n)");
        char respostaDeposito = scanner.next().charAt(0);

        if (respostaDeposito == 's' || respostaDeposito == 'S'){
            System.out.println("Qual valor deseja depositar? ");
            int valorDepositado = scanner.nextInt();

            int novoSaldo = minhaConta.depositar(valorDepositado);
            System.out.print("O deposito de " + valorDepositado + " foi realizado com sucesso!" );
            System.out.print("Saldo atual de " + novoSaldo);
        }

        System.out.print("Deseja realizar algum saque? (s/n)");
        char respostaSaque = scanner.next().charAt(0);

        if (respostaSaque == 's' || respostaSaque == 'S'){
            System.out.println("Qual valor deseja sacar? ");
            int valorSacado = scanner.nextInt();

            int novoSaque = minhaConta.depositar(valorSacado);
            System.out.print("O Saque de " + valorSacado + " foi realizado com sucesso!" );
            System.out.print("Saldo atual de " + novoSaque);
        }

        System.out.print("Fim das operações! ");

        scanner.close();
    }
}