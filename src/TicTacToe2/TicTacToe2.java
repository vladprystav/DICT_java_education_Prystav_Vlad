package TicTacToe2;
import  java.util.Scanner ;

public class TicTacToe2 {
    public static void main (String[] args) {
        char[][] setka = new char[5][5];
        int win_x = 0, win_o = 0, cont = 0;
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
        for (int y=1; y<4; y++){
            if (((setka[y][1] == setka[y][2]) && setka[y][3] == setka[y][2]) && setka[y][1] == 'x') {
                win_x++;
            } else if (((setka[y][1] == setka[y][2])&& setka[y][3] == setka[y][2]) && setka[y][1] == 'o') {
                win_o++;
            }
            if (((setka[y][1] == setka[y][2])&& setka[y][3] == setka[y][2]) && setka[y][1] == 'x'){
                win_x++;
            } else if (((setka[y][1] == setka[y][2])&& setka[y][3] == setka[y][2]) && setka[y][1] == 'o'){
                win_o++;
            }
            for (int i = 1; i<4; i++){
                if (setka[y][i] == '_'){
                    cont++;
                }
            }
        }
        int u = 1;
        if (((setka[u][u] == setka[u+1][u+1]) && setka[u+2][u+2] == setka[u+1][u+1]) && setka[u][u] == 'x'){
            win_x++;
        } else if (((setka[u][u] == setka[u+1][u+1]) && setka[u+2][u+2] == setka[u+1][u+1]) && setka[u][u] == 'o'){
            win_o++;
        }
        if (((setka[u][u+2] == setka[u+1][u+1]) && setka[u+2][u] == setka[u][u+2]) && setka[u][u+2] == 'x'){
            win_x++;
        } else if (((setka[u][u+2] == setka[u+1][u+1]) && setka[u+2][u] == setka[u][u+2]) && setka[u][u+2] == 'o'){
            win_o++;
        }
        if (win_x>0 && win_o>0){
            System.out.println("Impossible");
        } else if (win_x >0){
            System.out.println("WIN X");
        } else if (win_o >0) {
            System.out.println("WIN O");
        } else if (cont>0){
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }
    }
}
