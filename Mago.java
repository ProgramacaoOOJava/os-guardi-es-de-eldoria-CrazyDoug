// Feito por Douglas Alves Costa
// Nível Aventureiro

public class Mago extends Personagem {

    private final String magiaEspecial;

    public Mago(String nome,
                int nivel,
                int pontosDeVida,
                double poderBase,
                String magiaEspecial) {

        super(nome, "Mago", nivel, pontosDeVida, poderBase);

        this.magiaEspecial = magiaEspecial;
    }

    @Override
    public void usarHabilidadeEspecial() {

        System.out.println(
                "Mago " + nome +
                " lança " +
                magiaEspecial + "!"
        );
    }

}