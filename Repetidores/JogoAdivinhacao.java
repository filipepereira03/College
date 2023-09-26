import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        String palavraOculta = "programacao";
        int tentativasMaximas = 6;
        int tentativasRestantes = tentativasMaximas;
        StringBuilder palavraRevelada = new StringBuilder("_".repeat(palavraOculta.length()));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de adivinhação de palavras!");
        System.out.println("Tente adivinhar a palavra oculta.");

        while (tentativasRestantes > 0 && palavraRevelada.indexOf("_") != -1) {
            System.out.println("Palavra atual: " + palavraRevelada);
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            if (palavraOculta.contains(String.valueOf(letra))) {
                for (int i = 0; i < palavraOculta.length(); i++) {
                    if (palavraOculta.charAt(i) == letra) {
                        palavraRevelada.setCharAt(i, letra);
                    }
                }
                System.out.println("Letra encontrada na palavra!");
            } else {
                tentativasRestantes--;
                System.out.println("Letra não encontrada na palavra.");
            }
        }

        if (palavraRevelada.indexOf("_") == -1) {
            System.out.println("Parabéns! Você adivinhou a palavra correta: " + palavraOculta);
        } else {
            System.out.println("Você ficou sem tentativas. A palavra oculta era: " + palavraOculta);
        }

        scanner.close();
    }
}
