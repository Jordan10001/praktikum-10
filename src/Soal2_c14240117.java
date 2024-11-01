import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Soal2_c14240117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah bibit yang akan ditanam: ");
        int n = sc.nextInt();
        Integer[] waktuTumbuh = new Integer[n];
        for (int i =0; i<n; i++){
            System.out.print("Waktu tumbuh bibit " + (i+1)+": ");
            waktuTumbuh[i]= sc.nextInt();
        }
        Arrays.sort(waktuTumbuh, Collections.reverseOrder());

        int maksimalHari= 0;
        for (int i=0; i<n; i++){
            int hari = waktuTumbuh[i]+(i+1);
            if (hari>maksimalHari) maksimalHari=hari;

        }
        System.out.println("Pesta dapat diadakan "+ (maksimalHari+1) +" hari setelah penanaman bibit pertama.");
    }
}
