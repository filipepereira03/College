import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite algum numero");
        int n = tec.nextInt();
        tec.close();

        if (n < 0) {
            System.out.println("Digite um número positivo");
        } else {
            int somaDigitos = 0;

            while (n > 0) {
                int digitos = n % 10;
                somaDigitos += digitos;
                n /= 10;
            }
            System.out.println("A soma dos digitos é: " + somaDigitos);

        }
    }
}
