package Sistema_Xadrez.Aplicação;

import Sistema_Xadrez.XadrezGame.PeçaDeXadrez;

public class UI {
    
    public static void mostrarTabuleiro(PeçaDeXadrez[][] peças) {
        for(int i=0; i<peças.length;i++){
            System.out.print((8 - i) + " ");
            for (int j = 0; j < peças.length; j++) {
                mostrarPeça(peças[i][j]);
            }
            System.out.println();
        }
        System.out.print("  a b c d e f g h");
    }
    private static void mostrarPeça(PeçaDeXadrez peça){
        if(peça == null){
            System.out.print("-");
        }else{
            System.out.print(peça);
        }
        System.out.print(" ");
    }
}
