import java.util.Scanner;

public class CalculadoraMediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calcularMedia(scanner);
        scanner.close();
    }

    public static void calcularMedia(Scanner scanner) {
        double soma = 0;
        int contagem = 0;
        boolean lendoNota = true;
        double notaAtual = 0;
        
        System.out.print("Digite as notas separadas por vírgula (exemplo, 8,9,10): ");
        String entrada = scanner.nextLine();
        
        for (int i = 0; i < entrada.length(); i++) {
            char caractere = entrada.charAt(i);
            
            if (caractere == ',') {
                if (lendoNota) {
                    soma += notaAtual;
                    contagem++;
                    lendoNota = false;
                    notaAtual = 0;
                }
            } else if (Character.isDigit(caractere) || caractere == '.') {
                lendoNota = true;
                notaAtual = notaAtual * 10 + (caractere - '0');
            } else if (caractere == ' ') {
                // Ignorar espaços em branco
            } else {
                System.out.println("Ignorando entrada inválida: " + caractere);
            }
        }
        
        if (lendoNota) {
            soma += notaAtual;
            contagem++;
        }

        if (contagem > 0) {
            double media = soma / contagem;
            System.out.println("A média das notas é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
    }
}
