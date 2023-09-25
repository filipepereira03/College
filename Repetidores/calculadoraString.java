import java.util.Scanner;

public class calculadoraString {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        realizarCalculo(tec);
        tec.close();
    }

    public static void realizarCalculo(Scanner tec) {
        System.out.print("Digite o primeiro número: ");
        double num1 = tec.nextDouble();
        
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = tec.next().charAt(0);
        
        System.out.print("Digite o segundo número: ");
        double num2 = tec.nextDouble();

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
            case 'x':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}

