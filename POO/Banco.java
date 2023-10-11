import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite seu saldo:");
        double saldo = tec.nextDouble();
        System.out.println("Digite o rendimento mensal:");
        double rendimentoMensal = tec.nextDouble();
        ContaBancária conta = new ContaBancária(saldo, rendimentoMensal);

        while (true) {
            System.out.println("\n Bem-vindo ao banco");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Rendimento mensal");
            System.out.println("4. Rendimento após n meses");

            int escolhaOpção = tec.nextInt();

            switch (escolhaOpção) {
                case 1:
                    System.out.println("Digite o valor do depósito:");
                    double deposito = tec.nextDouble();
                    conta.deposito(deposito);
                    System.out.println("Depósito realizado. Novo saldo: " + conta.getSaldo());
                    break;

                case 2:
                    System.out.println("Digite o valor do saque:");
                    double saque = tec.nextDouble();
                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado. Novo saldo: " + conta.getSaldo());
                    } else {
                        System.out.println("Saldo insuficiente para o saque.");
                    }
                    break;
                case 3:
                    System.out.println("Rendimento mensal: " + conta.calcularRendimento());
                    break;
                case 4:
                    System.out.println("Digite o número de meses");
                    int meses = tec.nextInt();
                    System.out.println("Rendimento após " + meses + " meses " + conta.preverRendimento(meses));
                    break;
                case 5:
                    System.exit(0);
                    System.out.println("(:");
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
