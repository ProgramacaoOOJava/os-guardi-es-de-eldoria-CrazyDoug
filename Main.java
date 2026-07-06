// Feito por Douglas Alves Costa
// Nível Aventureiro

public class Main {

    public static void main(String[] args) {

        Personagem[] personagens = new Personagem[2];

        personagens[0] = new Guerreiro(
                "Arthus",
                10,
                150,
                25.5,
                "Espada Flamejante"
        );

        personagens[1] = new Mago(
                "Merlin",
                8,
                90,
                35.0,
                "Bola de Fogo"
        );

        System.out.println("===== GUARDIÕES DE ELDORIA =====\n");

        for (Personagem personagem : personagens) {
            personagem.exibirStatus();
            personagem.usarHabilidadeEspecial();
            System.out.println("------------------------------------");
        }

    }
}