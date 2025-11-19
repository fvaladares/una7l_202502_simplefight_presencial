import model.Personagem;

public class Main {

    public static void main(String[] args) {
        // Declaraçao de uma variável do tipo Personagem;
        for (int i = 0; i < 20; i++) {
            Personagem jogador1;
            jogador1 = new Personagem("João");
            System.out.println(jogador1);
        }
    }
}
