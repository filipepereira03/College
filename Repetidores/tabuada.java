import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = tec.nextInt();
        tec.close();
        int multiplicador = 1;
        while (multiplicador <= 10) { // Eu não preciso saber qual é o multiplicador, eu só dou o comando para o programa rodar até o multiplicador ser igual a 10.
            int resultado = n * multiplicador;
            System.out.println(n + " x " + multiplicador + " = " + resultado);
            multiplicador++; // Vai aumentando a iteração 
        }

    }
}
