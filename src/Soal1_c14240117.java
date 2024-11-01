import java.util.Scanner;

public class Soal1_c14240117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah : ");
        int jumlah = sc.nextInt();
        System.out.print("Tinggi : ");
        int tinggi = sc.nextInt();
        System.out.print("Lebar : ");
        int lebar = sc.nextInt();

        for (int i=0; i<tinggi ; i++) {
            for (int j=0; j<=jumlah*(lebar+1); j++) {
                if (i == 0 || i == tinggi-1) {
                    System.out.print("-");
                    continue;
                }
                if (j % (lebar+1) == 0) {
                    System.out.print("|");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
0      4       8      12    16     20
---------------------
|   |   |   |   |   |
|   |   |   |   |   |
|   |   |   |   |   |
|   |   |   |   |   |
|   |   |   |   |   |
---------------------

 */