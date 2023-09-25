import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = tec.nextInt();
        tec.close();
        if (n < 0) {
            System.out.println("Digite um número inteiro");
        } else {

            while (n >= 1) {
                System.out.println(n);
                n--;// Diminui cada iteração!!
            }
        }
    }
}
