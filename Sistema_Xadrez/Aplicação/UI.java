package Sistema_Xadrez.Aplicação;

import javax.swing.text.StyledEditorKit.ForegroundAction;
import java.awt.Color;

import Sistema_Xadrez.XadrezGame.Cor;
import Sistema_Xadrez.XadrezGame.PeçaDeXadrez;

public class UI {
    public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    //Codigo das cores para o gitbash
    
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
        if (peça == null) {
            System.out.print("-");
        }
        else {
            if (peça.getCor() == Cor.BRANCO) {
                
                System.out.print(ANSI_WHITE + peça + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_YELLOW + peça + ANSI_RESET);
            }
        }
        System.out.print(" ");
	}
}

