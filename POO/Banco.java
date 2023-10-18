import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Informe o rendimento mensal percentual: ");
        double rendimentoMensalPercentual = scanner.nextDouble();

        System.out.print("Informe o aporte mensal: ");
        double aporteMensal = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial, rendimentoMensalPercentual);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Calcular Rendimento Mensal");
            System.out.println("4. Prever Rendimento Mensal com Aporte");
            System.out.println("5. Prever Rendimento Mensal");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Informe o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.calcularRendimentoMensal();
                    break;
                case 4:
                    System.out.print("Informe o número de meses para prever o rendimento com aporte: ");
                    int mesesComAporte = scanner.nextInt();
                    double saldoComAporte = conta.preverRendimentoMensalComAporte(mesesComAporte, aporteMensal);
                    System.out.println("Saldo previsto com aporte após " + mesesComAporte + " meses: R$" + saldoComAporte);
                    break;
                case 5:
                    System.out.print("Informe o número de meses para prever o rendimento sem aporte: ");
                    int mesesSemAporte = scanner.nextInt();
                    double saldoSemAporte = conta.preverRendimentoMensal(mesesSemAporte);
                    System.out.println("Saldo previsto sem aporte após " + mesesSemAporte + " meses: R$" + saldoSemAporte);
                    break;
                case 6:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
