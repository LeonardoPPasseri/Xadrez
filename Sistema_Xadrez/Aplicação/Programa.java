package Sistema_Xadrez.Aplicação;

import Sistema_Xadrez.TabuleiroGame.*;
import Sistema_Xadrez.TabuleiroGame.*;
import Sistema_Xadrez.XadrezGame.*;

public class Programa {
    public static void main(String[] args) {
        PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
        UI.mostrarTabuleiro(partidaDeXadrez.getPeças());
    }
}
