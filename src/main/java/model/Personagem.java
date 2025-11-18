package model;

public class Personagem {
    String nome;
    int vida;
    int defesa;
    int ataque;
    boolean ativo;
    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", defesa=" + defesa +
                ", ataque=" + ataque +
                ", ativo=" + ativo +
                '}';
    }
}
