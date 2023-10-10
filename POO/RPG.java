import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String nome = "Elion";
        int resistencia = 4;
        int forca = 1;
        int inteligencia = 5;

        System.out.println("Bem-vindo ao RPG, " + nome);
        System.out.println("Resistência: " + resistencia);
        System.out.println("Força: " + forca);
        System.out.println("Inteligência: " + inteligencia);

        Mago elion = new Mago(resistencia, forca, inteligencia, nome);

        while (true) {

            System.out.println("\nSeus atributos atuais:");
            System.out.println("Vida: " + elion.getVida());
            System.out.println("Magia: " + elion.getMagia());

            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Atacar");
            System.out.println("2. Mover para frente");
            System.out.println("3. Receber Dano");
            System.out.println("4. Ativar Aura de fogo");
            System.out.println("5. Lançar Raio Glacial");
            System.out.println("6. Ativar/Desativar Barreira Arcana");
            System.out.println("7. Conjurar Vórtice Celestial");
            System.out.println("8. Invocar Palpatine");
            System.out.println("9. Jar Jar Binks");
            System.out.println("10. Recuperar magia");
            System.out.println("11. Sair do jogo");

            int escolhaAcao = tec.nextInt();

            switch (escolhaAcao) {
                case 1:
                    int dano = elion.atacar();
                    System.out.println(nome + " te deu uma cajadada e causou " + dano + " de dano.");
                    break;
                case 2:
                    System.out.println(elion.moverParaFrente());
                    break;
                case 3:
                    System.out.println("Digite a quantidade de dano a receber:");
                    int danoRecebido = tec.nextInt();
                    System.out.println(elion.receberDano(danoRecebido));
                    break;
                case 4:
                    int danoAura = elion.auraDeFogo();
                    if (danoAura > 0) {
                        System.out.println(nome + " ativou sua Aura de fogo e causou " + danoAura + " de dano.");
                    } else {
                        System.out.println("Sem mana irmão");
                    }
                    break;
                case 5:
                    int danoRaioGlacial = elion.raioGlacial();
                    if (danoRaioGlacial > 0) {
                        System.out
                                .println(nome + " deu uma de senhor gelado e causou " + danoRaioGlacial + " de dano.");
                    } else {
                        System.out.println("Sem mana irmão");
                    }
                    break;
                case 6:
                    if (elion.isBarreiraArcanaAtiva()) {
                        elion.desativarBarreiraArcana();
                    } else {
                        elion.ativarBarreiraArcana();
                    }
                    break;
                case 7:
                    int danoVórticeCelestial = elion.vórticeCelestial();
                    if (danoVórticeCelestial > 0) {
                        System.out.println(nome + " conjurou um vórtice diretamente nos pés do inimigo causando "
                                + danoVórticeCelestial + " de dano.");
                    } else {
                        System.out.println("Sem mana irmão");
                    }
                    break;
                case 8:
                    int danoPalpatine = elion.palpatine();
                    if (danoPalpatine > 0) {
                        System.out.println(
                                nome + " invocou Palpatine dos mortos. Palpatine lança raios no inimigo causando "
                                        + danoPalpatine + " de dano.");
                    } else {
                        System.out.println("Sem mana irmão");
                    }
                    break;
                case 9:
                    int jarJar = elion.jarJarBinks();
                    if (jarJar == 0) {
                        System.out.println(nome + " se atrapalhou com a magia e a lançou longe do inimigo causando "
                                + jarJar + " de dano.");
                    } else {
                        System.out.println("???");
                    }
                    break;
                case 10:
                    elion.recuperarMagia(10);
                    break;
                case 11:
                    System.out.println("Voltando ao condado.");
                    System.exit(0);
                default:
                    System.out.println("Ai que burro da zero pra ele");
             }
             tec.close();
        }
    }
}