// Feito por Douglas Alves Costa
// Nível Mestre

public class Guerreiro extends Personagem {

    private final String armaEspecial;

    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, String armaEspecial) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.armaEspecial = armaEspecial;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + nome + " ataca com " + armaEspecial + "!");
    }
}