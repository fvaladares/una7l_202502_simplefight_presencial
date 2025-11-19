import model.Personagem;

public class Main {

    public static void main(String[] args) {
        // Declaraçao de uma variável do tipo Personagem;
        Personagem jogador1;
        jogador1 = new Personagem();
        jogador1.nome = "João";
        jogador1.ataque = 10;
        jogador1.defesa = 10;
        jogador1.vida = 200;

        System.out.println(jogador1);
    }
}
