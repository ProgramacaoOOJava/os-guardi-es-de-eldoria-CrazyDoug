// Feito por Douglas Alves Costa
// Nível Mestre

public class Main {
    public static void main(String[] args) {

        Grupo grupoLuz = new Grupo("Guardiões da Luz");
        Grupo grupoSombras = new Grupo("Legião das Sombras");

        Personagem guerreiro = new Guerreiro(
                "Arthus",
                10,
                150,
                25.5,
                "Espada Flamejante"
        );

        Personagem mago = new Mago(
                "Elenara",
                12,
                90,
                30.0,
                "Chuva de Meteoros"
        );

        Personagem guerreiroSombrio = new Guerreiro(
                "Drokhan",
                9,
                160,
                28.0,
                "Machado Sombrio"
        );

        Personagem magoSombrio = new Mago(
                "Morgana",
                11,
                85,
                27.5,
                "Raio das Trevas"
        );

        grupoLuz.adicionarPersonagem(guerreiro);
        grupoLuz.adicionarPersonagem(mago);

        grupoSombras.adicionarPersonagem(guerreiroSombrio);
        grupoSombras.adicionarPersonagem(magoSombrio);

        grupoLuz.listarPersonagens();
        grupoSombras.listarPersonagens();

        System.out.println("\n===== BATALHAS INDIVIDUAIS =====");
        grupoLuz.batalhar(guerreiro, guerreiroSombrio);
        grupoLuz.batalhar(mago, magoSombrio);

        System.out.println("\n===== BATALHA ENTRE GRUPOS =====");
        Arena arena = new Arena();
        arena.batalharGrupos(grupoLuz, grupoSombras);
    }
}