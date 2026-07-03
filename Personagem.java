// Feito por Douglas Alves Costa
// Nível Novato

public class Personagem {

    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    public Personagem(String nome,
                      String classe,
                      int nivel,
                      int pontosDeVida,
                      double poderBase) {

        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    public void exibirStatus() {

        System.out.println("=====================================");
        System.out.println("      GUARDIÕES DE ELDORIA");
        System.out.println("=====================================");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }
}