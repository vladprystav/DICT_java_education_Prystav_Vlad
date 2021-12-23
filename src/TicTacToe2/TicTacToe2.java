package TicTacToe2;
import  java.util.Scanner ;

public class TicTacToe2 {
    public static void main (String[] args) {
        char[][] setka = new char[5][5];
        Scanner in = new Scanner(System.in);
        for (int r = 0; r < 5; r++) {
            setka[0][r] = '-';
            setka[4][r] = '-';
        }
        for (int e = 1; e < 4; e++) {
            setka[e][0] = '|';
            setka[e][4] = '|';
        }
        System.out.print("Enter cells:");
        for (int q = 1; q < 4; q++) {
            for (int w = 1; w < 4; w++) {
                setka[q][w] = in.next().charAt(0);
            }
        }
        for (int t = 0; t < 5; t++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(setka[t][y]);
            }
            System.out.println();
        }
    }
}
