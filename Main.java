// Feito por Douglas Alves Costa
// Nível Novato

public class Main {

    public static void main(String[] args) {

        Personagem heroi1 = new Personagem(
                "Arthemis",
                "Arqueira",
                5,
                80,
                12.5
        );

        Personagem heroi2 = new Personagem(
                "Thorgar",
                "Guerreiro",
                7,
                120,
                18.0
        );

        heroi1.exibirStatus();

        System.out.println();

        heroi2.exibirStatus();
    }
}