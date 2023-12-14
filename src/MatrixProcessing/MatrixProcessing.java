package MatrixProcessing;
import java.util.Scanner;

public class MatrixProcessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c;
        int a;
        int[] size = new int[2];
        int[] size2 = new int[2];
        int[][] matriza2;
        int[][] matriza3;
        int[][] matriza;
        for (; ; ) {
            System.out.println("1.Сумма матриц\n"+
                    "2. Умножение на константу\n"+
                    "3. Умножение матриц\n"+
                    "4. Транспортировка\n" +
                    "5. Выход");
            System.out.print("Ваш выбор:");
            a = in.nextInt();
            if (a == 5){
                System.exit(0);
            }
            System.out.print("Введите длину и ширину матрицы: ");
            size[0] = in.nextInt();
            size[1] = in.nextInt();
            matriza = new int[size[0]][size[1]];
            System.out.println("Введите матрицу: ");
            for (int q = 0; q < size[0]; q++) {
                for (int w = 0; w < size[1]; w++) {
                    matriza[q][w] = in.nextInt();
                }
            }
            matriza2 = new int[size[0]][size[1]];
            if (a == 1) {
                System.out.println("Введите вторую матрицу: ");
                matriza3 = new int[size[0]][size[1]];
                for (int q = 0; q < size[0]; q++) {
                    for (int w = 0; w < size[1]; w++) {
                        matriza2[q][w] = in.nextInt();
                    }
                }
                for (int q = 0; q < size[0]; q++) {
                    for (int w = 0; w < size[1]; w++) {
                        matriza3[q][w] = matriza[q][w] + matriza2[q][w];
                    }
                }
                for (int q = 0; q < size[0]; q++) {
                    for (int w = 0; w < size[1]; w++) {
                        System.out.print("|" + matriza3[q][w] + "|");
                    }
                    System.out.println();
                }
            }else if (a == 2){
                System.out.println("Введите константу: ");
                c = in.nextInt();
                for (int q = 0; q < size[0]; q++) {
                    for (int w = 0; w < size[1]; w++) {
                        matriza2[q][w] = matriza[q][w] * c;
                    }
                }
                for (int q = 0; q < size[0]; q++) {
                    for (int w = 0; w < size[1]; w++) {
                        System.out.print("|" + matriza2[q][w] + "|");
                    }
                    System.out.println();
                }
            } else if (a == 3){
                System.out.print("Введите размер второй матрицы: ");
                size2[0] = in.nextInt();
                size2[1] = in.nextInt();
                matriza2 = new int [size[0]][size[1]];
                System.out.println("Введите вторую матрицу: ");
                for (int i = 0; i < size2[0]; i++) {
                    for (int i1 = 0; i1 < size2[1]; i1++) {
                        matriza2[i][i1] = in.nextInt();
                    }
                }
                matriza3 = new int [size[0]][size2[1]];
                for (int q = 0; q < size[0]; q++) {
                    for (int w = 0; w < size2[1]; w++) {
                        matriza3[q][w] = 0;
                    }
                }
                if (size[1] == size2[0]) {
                    for (int q = 0; q < size[0]; q++) {
                        for (int w = 0; w < size2[1]; w++) {
                            for (int e = 0; e < size[1]; e++) {
                                matriza3[q][w] = matriza3[q][w] + matriza[q][e] * matriza2[e][w];
                            }
                        }

                    }
                    for (int q = 0; q < size[0]; q++) {
                        for (int w = 0; w < size[1]; w++) {
                            System.out.print("|" + matriza3[q][w] + "|");
                        }
                        System.out.println();
                    }
                }else {
                    System.out.println("ERROR");
                }
            }else (a == 4) {
                System.out.println("1. Главная диагональ\n2. Побочная диагональ\n3. Вертикаль\n4. Горизонталь");
                a = in.nextInt();
                matriza2 = new int[size[1]][size[0]];
                matriza3 = new int[size[0]][size[1]];
                if (a == 1) {
                    for (int q = 0; q < size[1]; ++q) {
                        for (int w = 0; w < size[0]; ++w) {
                            matriza2[q][w] = matriza[w][q];
                        }
                    }

                    for (int q = 0; q < size[1]; ++q) {
                        for (int w = 0; w < size[0]; ++w) {
                            System.out.print("|" + matriza2[q][w] + "|");
                        }

                        System.out.println();
                    }
                } else if (a == 2) {
                    for (int q = 0; q < size[0]; ++q) {
                        for (int w = 0; w < size[1]; ++w) {
                            matriza2[w][q] = matriza[size[0] - (q + 1)][size[1] - (w + 1)];
                        }
                    }

                    for (int q = 0; q < size[1]; ++q) {
                        for (int w = 0; w < size[0]; ++w) {
                            System.out.print("|" + matriza2[q][w] + "|");
                        }

                        System.out.println();
                    }
                } else if (a == 3) {
                    for (int q = 0; q < size[0]; ++q) {
                        for (int w = 0; w < size[1]; ++w) {
                            matriza3[q][w] = matriza[q][size[1] - (w + 1)];
                        }

                        System.out.println();
                    }

                    for (int q = 0; q < size[0]; ++q) {
                        for (int w = 0; w < size[1]; ++w) {
                            System.out.print("|" + matriza3[q][w] + "|");
                        }

                        System.out.println();
                    }
                } else if (a == 4) {
                    for (int q = 0; q < size[0]; ++q) {
                        for (int w = 0; w < size[1]; ++w) {
                            matriza3[q][w] = matriza[size[0] - (q + 1)][w];
                        }

                        System.out.println();
                    }

                    for (int q = 0; q < size[0]; ++q) {
                        for (int w = 0; w < size[1]; ++w) {
                            System.out.print("|" + matriza3[q][w] + "|");
                        }

                        System.out.println();
                    }

                } else {
                    System.out.println("ERROR");
                }

            } else {
                System.out.println("ERROR");
            }

        }
    }
}
