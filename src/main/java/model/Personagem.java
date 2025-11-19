package model;


import java.util.Random;

public class Personagem {
    private String nome;
    private int vida;
    private int defesa;
    private int ataque;
    private boolean ativo;

    /**
     * Construtor da classe
     * Usado para inicializar os atributos da classe durante a instância
     *
     * @param nome
     */
    public Personagem(String nome) {
        Random random = new Random();
        // this - Faz referência aos atributos que pertencem à classe.
        this.nome = nome;
        this.vida = 100;
        this.ataque = random.nextInt(1, 6);
        this.defesa = random.nextInt(1, 6);


    }

    /**
     * Método reponsável pelo ataque a outro personagem.
     *
     * @param alvoDoAtaque
     */
    public void atacar(Personagem alvoDoAtaque) {

    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }

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
