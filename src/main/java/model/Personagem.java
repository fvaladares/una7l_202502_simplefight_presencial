package model;

public class Personagem {
    public String nome;
    public int vida;
    public int defesa;
    public int ataque;
    public boolean ativo;
    @Override
    public String toString() {
        return "Personagem{" +
                "\n\tnome='" + nome + '\'' +
                ", \n\tvida=" + vida +
                ", \n\tdefesa=" + defesa +
                ", \n\tataque=" + ataque +
                ", \n\tativo=" + ativo +
                "\n}";
    }
}
