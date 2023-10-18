public class Calculadora {
    public double adicao(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double divisao(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN; // Retorna NaN (Not-a-Number) em caso de divisão por zero.
        }
    }

    public double potencia(double base, int expoente) {
        if (expoente < 0) {
            System.out.println("Erro: O expoente deve ser não negativo.");
            return Double.NaN;
        }
        double resultado = 1.0;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public long fatorial(int n) {
        if (n < 0) {
            System.out.println("Erro: O fatorial é indefinido para números negativos.");
            return -1;
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public double raizQuadrada(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Erro: Não é possível calcular a raiz quadrada de um número negativo.");
            return Double.NaN;
        }
    }

    public int simularRodadasDeDado(int numRodadas, int numLados) {
        if (numRodadas <= 0 || numLados <= 1) {
            System.out.println("Erro: Parâmetros inválidos para a simulação do dado.");
            return -1;
        }
        int resultado = 0;
        for (int i = 0; i < numRodadas; i++) {
            resultado += (int) (Math.random() * numLados) + 1;
        }
        return resultado;
    }
}
