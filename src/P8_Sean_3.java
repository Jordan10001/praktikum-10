import java.util.Random;
import java.util.Scanner;

public class P8_Sean_3 {
    public static int[][] Transpose(int[][] a){//tranpose untuk rotasi
        int row = a.length;
        int col = a[0].length;
        int[][] b = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                b[i][j]=a[j][i];
            }
        }
        return b;
    }
    public static void PrintMatrix(int[][] a){// print matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j==a[i].length-1) System.out.println(a[i][j]);
                else System.out.print(a[i][j]+"  ");
            }
        }
    }
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input row = ");
        int y = sc.nextInt();
        System.out.print("Input column = ");
        int x = sc.nextInt();
        int[][] matrix = new int[y][x];
        for (int i = 0; i < y; i++) {// random num ngisi matrix
            for (int j = 0; j < x; j++) {
                matrix[i][j] = rd.nextInt(0, 10);
            }
        }
        int pil;
        do {
            System.out.println("Matrix:");
            PrintMatrix(matrix);
            System.out.println("1. Rotate Right\n2. Rotate Left\n3. Flip horizontal\n4. Flip vertical\n5. Exit");//menu
            System.out.print("Pilihan: ");
            pil = sc.nextInt();
            switch (pil){
                case 1:
                    matrix=Transpose(matrix);//klo mau puter di tranpose dlu
                    for (int i = 0; i < matrix.length; i++) {//di puter horizontal
                        for (int j = 0; j < matrix[i].length-matrix[i].length/2; j++) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[i][matrix[i].length-1-j];
                            matrix[i][matrix[i].length-1-j]= temp;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < matrix.length; i++) {//diputer horizontal dlu
                        for (int j = 0; j < matrix[i].length-matrix[i].length/2; j++) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[i][matrix[i].length-1-j];
                            matrix[i][matrix[i].length-1-j]= temp;
                        }
                    }
                    matrix=Transpose(matrix);// trus di tranpose
                    break;
                case 3:
                    for (int i = 0; i < matrix.length; i++) {//puter horizontal
                        for (int j = 0; j < matrix[i].length-matrix[i].length/2; j++) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[i][matrix[i].length-1-j];
                            matrix[i][matrix[i].length-1-j]= temp;
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < matrix.length-matrix.length/2; i++) {//puter vertikal
                        for (int j = 0; j < matrix[i].length; j++) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[matrix.length-1-i][j];
                            matrix[matrix.length-1-i][j]= temp;
                        }
                    }
                    break;
            }
            System.out.println();
        } while (pil != 5);
        PrintMatrix(matrix);
        System.out.println("Adios...");
    }
}
