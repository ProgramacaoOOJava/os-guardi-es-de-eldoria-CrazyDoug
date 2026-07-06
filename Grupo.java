// Feito por Douglas Alves Costa
// Nível Mestre

import java.util.ArrayList;
import java.util.Collections;

public class Grupo {

    private final String nome;
    private final ArrayList<Personagem> membros;

    public Grupo(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem p) {
        membros.add(p);
    }

    public void listarPersonagens() {
        Collections.sort(membros);

        System.out.println("\n===== Grupo: " + nome + " =====");

        for (Personagem personagem : membros) {
            personagem.exibirStatus();
            personagem.usarHabilidadeEspecial();
            System.out.println("--------------------------------");
        }
    }

    public void batalhar(Personagem a, Personagem b) {
        int poderA = a.calcularPoderTotal();
        int poderB = b.calcularPoderTotal();

        if (poderA > poderB) {
            System.out.println(a.getClasse() + " " + a.getNome() + " venceu! Poder total: " + poderA);
        } else if (poderB > poderA) {
            System.out.println(b.getClasse() + " " + b.getNome() + " venceu! Poder total: " + poderB);
        } else {
            System.out.println("Empate entre " + a.getNome() + " e " + b.getNome() + "! Poder total: " + poderA);
        }
    }

    public ArrayList<Personagem> getMembros() {
        return membros;
    }

    public String getNome() {
        return nome;
    }
}