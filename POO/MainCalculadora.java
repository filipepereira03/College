import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potência");
            System.out.println("6. Fatorial");
            System.out.println("7. Raiz Quadrada");
            System.out.println("8. Simulação de Dado");
            System.out.println("9. Sair");

            int escolha = scanner.nextInt();

            if (escolha == 9) {
                break;
            }

            double resultado = 0;

            switch (escolha) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = scanner.nextDouble();
                    resultado = calculadora.adicao(num1, num2);
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.subtracao(num1, num2);
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.multiplicacao(num1, num2);
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.divisao(num1, num2);
                    break;
                case 5:
                    System.out.print("Digite a base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o expoente: ");
                    int expoente = scanner.nextInt();
                    resultado = calculadora.potencia(num1, expoente);
                    break;
                case 6:
                    System.out.print("Digite um número para calcular o fatorial: ");
                    int n = scanner.nextInt();
                    resultado = calculadora.fatorial(n);
                    break;
                case 7:
                    System.out.print("Digite um número para calcular a raiz quadrada: ");
                    double num = scanner.nextDouble();
                    resultado = calculadora.raizQuadrada(num);
                    break;
                case 8:
                    System.out.print("Digite o número de rodadas: ");
                    int numRodadas = scanner.nextInt();
                    System.out.print("Digite o número de lados do dado: ");
                    int numLados = scanner.nextInt();
                    resultado = calculadora.simularRodadasDeDado(numRodadas, numLados);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
