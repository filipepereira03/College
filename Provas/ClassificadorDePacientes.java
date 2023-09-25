import java.util.Scanner;

public class ClassificadorDePacientes {
    public static String classificarPaciente(int temperatura, String febre, String tipoSanguineo, String tosse) {
        String doente = "Doente";
        String saudavel = "Saudável";

        if (temperatura < 35) {
            System.out.println("Paciente está com temperatura abaixo de 35 graus.");
            System.out.println("Está com febre? (Sim ou nao)");
            febre = new Scanner(System.in).nextLine();
            
            if (febre.equalsIgnoreCase("Sim")) {
                System.out.print("Digite o tipo sanguíneo (A/B/AB): ");
                tipoSanguineo = new Scanner(System.in).nextLine();
                if (tipoSanguineo.equals("A") || tipoSanguineo.equals("B") || tipoSanguineo.equals("AB")) {
                    return saudavel;
                } else {
                    return doente;
                }
            } else {
                return saudavel;
            }
        } else if (temperatura >= 36) {
            System.out.println("Paciente está com temperatura acima de 36 graus.");
            System.out.println("Está com tosse? (Sim ou nao)");
            tosse = new Scanner(System.in).nextLine();
            
            if (tosse.equalsIgnoreCase("Sim")) {
                return doente;
            } else {
                return saudavel;
            }
        }

        return "Condição desconhecida";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        int temperatura = scanner.nextInt();
        scanner.nextLine(); // Limpar a quebra de linha deixada pelo nextInt()

        String febre = "";
        String tipoSanguineo = "";
        String tosse = "";

        String resultado = classificarPaciente(temperatura, febre, tipoSanguineo, tosse);
        System.out.println("Resultado da avaliação: " + resultado);

        
    }
}

