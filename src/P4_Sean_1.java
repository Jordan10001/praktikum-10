import java.util.Scanner;

public class P4_Sean_1 {
    public static void loop_pagar(int a,char b){//nge print pager atas sama bawah
        for (int i = 0; i < a; i++) {
            System.out.print(b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tinggi Pagar: ");
        int TP = sc.nextInt();
        System.out.print("Lebar Pagar: ");
        int LP = sc.nextInt();
        System.out.print("Banyak Jeruji: ");
        int BJ = sc.nextInt();
        loop_pagar(LP,'=');
        System.out.println();
        for (int i = 0; i < TP; i++) {
            System.out.print(" ");
            for (int j = 0; j < BJ; j++) {
                System.out.print('|');
                for (int k = 0; k < (LP-BJ-2)/(BJ-1); k++) {//jarak antar pager
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        loop_pagar(LP,'=');
    }
}