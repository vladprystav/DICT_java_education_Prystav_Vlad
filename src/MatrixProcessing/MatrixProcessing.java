package MatrixProcessing;
import java.util.Scanner;

public class MatrixProcessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c;
        System.out.print("Введите длинну и ширину матриц:");
        int[] size = new int[2];
        size[0] = in.nextInt();
        size[1] = in.nextInt();
        System.out.println("Введите первую матрицу:");
        int[][] matriza = new int[size[0]][size[1]];
        for (int q = 0; q < size[0]; q++) {
            for (int w = 0; w < size[1]; w++) {
                matriza[q][w] = in.nextInt()
            }
        }
        System.out.println("Введите вторую матрицу:");
        int[][] matriza2 = new int[size[0]][size[1]];
        for (int q = 0; q < size[0]; q++) {
            for (int w = 0; w < size[1]; w++) {
                matriza2[q][w] = in.nextInt();
            }
        }
        for (int q = 0; q < size[0]; q++) {
            for (int w = 0; w < size[1]; w++) {
                System.out.print("|" + matriza3[q][w] + "|");
            }
            System.out.println();
        }
    }
}
