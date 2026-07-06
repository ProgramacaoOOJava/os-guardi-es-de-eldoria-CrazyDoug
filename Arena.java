// Feito por Douglas Alves Costa
// Nível Mestre

public class Arena {

    public void batalharGrupos(Grupo g1, Grupo g2) {
        System.out.println("Arena iniciou batalha entre " + g1.getNome() + " e " + g2.getNome() + "!");

        int menorTamanho = Math.min(g1.getMembros().size(), g2.getMembros().size());

        for (int i = 0; i < menorTamanho; i++) {
            Personagem p1 = g1.getMembros().get(i);
            Personagem p2 = g2.getMembros().get(i);

            System.out.println("\nDuelo " + (i + 1) + ": " + p1.getNome() + " VS " + p2.getNome());
            g1.batalhar(p1, p2);
        }
    }
}