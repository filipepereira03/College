import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        String palavraOculta = "jarjarbinks";
        int tentativasMaximas = 6;
        int tentativasRestantes = tentativasMaximas;
        StringBuilder palavraRevelada = new StringBuilder("_".repeat(palavraOculta.length()));
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Olá, esse é o jogo da adivinhaçao");
        System.out.println("\n Tente adivinhar a palavra oculta.");

        while (tentativasRestantes > 0 && palavraRevelada.indexOf("_") != -1) {
            System.out.println("\n Palavra atual: " + palavraRevelada);
            System.out.println("\n Tentativas restantes: " + tentativasRestantes);
            System.out.print("\n Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            if (palavraOculta.contains(String.valueOf(letra))) {
                for (int i = 0; i < palavraOculta.length(); i++) {
                    if (palavraOculta.charAt(i) == letra) {
                        palavraRevelada.setCharAt(i, letra);
                    }
                }
                System.out.println("\n Letra encontrada na palavra!");
            } else {
                tentativasRestantes--;
                System.out.println("\n Letra não encontrada na palavra.");
            }
        }

        if (palavraRevelada.indexOf("_") == -1) {
            System.out.println("\n Parabéns! Você adivinhou a palavra correta: " + palavraOculta);
        } else {
            System.out.println("\n Você ficou sem tentativas. A palavra oculta era: " + palavraOculta);
        }

        scanner.close();
    }
}
