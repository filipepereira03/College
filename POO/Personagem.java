import java.util.Random;


public class Personagem {
    private int resistencia;
    private int forca;
    private int inteligencia;
    private int vida;
    private int magia;
    private String nome;

    public Personagem(int resistencia, int forca, int inteligencia, String nome) {
        this.resistencia = resistencia;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.nome = nome;
        this.vida = 10 * resistencia;
        this.magia = 10 * inteligencia;
    }

    public int atacar() {
        Random rand = new Random();
        int dano = rand.nextInt(10) + 1; 
        return forca * dano;
    }

    public String moverParaFrente() {
        return nome + " anda para frente.";
    }

    public String receberDano(int dano) {
        vida -= dano;
        if (vida <= 0) {
            return nome + " virou camisa de saudade eterna";
        }
        return nome + " está com " + vida + " pontos de vida.";
    }

    

    public int getResistencia() {
        return resistencia;
    }

    public int getForca() {
        return forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getVida() {
        return vida;
    }

    public int getMagia() {
        return magia;
    }

    public String getNome() {
        return nome;
    }

    public void setResistencia(int novaResistencia) {
        resistencia = novaResistencia;
    }

    public void setForca(int novaForca) {
        forca = novaForca;
    }

    public void setInteligencia(int novaInteligencia) {
        inteligencia = novaInteligencia;
    }

    public void setVida(int novaVida) {
        vida = novaVida;
    }

    public void setMagia(int novaMagia) {
        magia = novaMagia;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }
}


class Mago extends Personagem {
    private boolean barreiraArcanaAtiva;

    public Mago(int resistencia, int forca, int inteligencia, String nome) {
        super(resistencia, forca, inteligencia, nome);
        this.barreiraArcanaAtiva = false;
    }

    public String receberDano(int dano) {
    if (isBarreiraArcanaAtiva()) {
        int danoMitigado = (int) (dano * 0.7); 
        setVida(getVida() - danoMitigado);
        if (getVida() <= 0) {
            return getNome() + " Foi de arrasta pra cima";
        }
        return getNome() + " está com " + getVida() + " pontos de vida.";
    } else {
        return super.receberDano(dano);
    }
}
    
    
    public int auraDeFogo() {
        int gastoMagia = 5;
        if (getMagia() >= gastoMagia) {
            setMagia(getMagia() - gastoMagia);
            Random rand = new Random();
            int dano = rand.nextInt(5); 
            return dano;
        } else {
            return 0; 
        }
    }

    public int raioGlacial() {
        int gastoMagia = 15;
        if (getMagia() >= gastoMagia) {
            setMagia(getMagia() - gastoMagia);
            Random rand = new Random();
            int dano = rand.nextInt(10); 
            return dano;
        } else {
            return 0; 
        }
    }
    
    public int vórticeCelestial() {
        int gastoMagia = 20;
        if (getMagia() >= gastoMagia) {
            setMagia(getMagia() - gastoMagia);
            Random rand = new Random();
            int dano = rand.nextInt(15);
            return dano;
        }else{
            return 0;
        }
    }
    
    public int palpatine() {
        int gastoMagia = 20;
        if (getMagia() >= gastoMagia) {
            setMagia(getMagia() - gastoMagia);
            Random rand = new Random();
            int dano = rand.nextInt(10) + 5;
            return dano;
        }else{
            return 0;
        }
    }
    
    public int jarJarBinks() {
        int gastoMagia = 2;
        if (getMagia() >= gastoMagia) {
            setMagia(getMagia() - gastoMagia);
            int dano = 0;
            return dano;
        }else{
            return 0;
        }
    }

    public void ativarBarreiraArcana() {
        int gastoMagia = 15;
        if (getMagia() >= gastoMagia) {
            setMagia(getMagia() - gastoMagia);
            barreiraArcanaAtiva = true;
            System.out.println(getNome() + " ativou a Barreira Arcana, mitigando 30% do dano no próximo turno");
        } else {
            System.out.println(getNome() + " Sem mana irmão.");
        }
    }

    public void desativarBarreiraArcana() {
        barreiraArcanaAtiva = false;
        System.out.println(getNome() + " desativou a Barreira Arcana.");
    }

    public boolean isBarreiraArcanaAtiva() {
        return barreiraArcanaAtiva;
    }
    
    public void recuperarMagia(int quantidadeRecuperada) {
    int novaMagia = getMagia() + quantidadeRecuperada;
    setMagia(novaMagia);
    System.out.println(getNome() + " recuperou " + quantidadeRecuperada + " pontos de magia. Magia atual: " + novaMagia);
    }

}

