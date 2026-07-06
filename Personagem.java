// Feito por Douglas Alves Costa
// Nível Aventureiro

public abstract class Personagem {

    protected String nome;
    protected String classe;
    protected int nivel;
    protected int pontosDeVida;
    protected double poderBase;

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

        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }

    public abstract void usarHabilidadeEspecial();

}