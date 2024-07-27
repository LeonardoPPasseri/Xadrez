package Sistema_Xadrez.Aplicação;

import Sistema_Xadrez.TabuleiroGame.Posição;
import Sistema_Xadrez.TabuleiroGame.Tabuleiro;
import Sistema_Xadrez.XadrezGame.PartidaDeXadrez;

public class Programa {
    public static void main(String[] args) {
        PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
        UI.mostrarTabuleiro(partidaDeXadrez.getPeças());
    }
}
