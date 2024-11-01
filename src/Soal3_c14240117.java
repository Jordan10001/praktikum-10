import java.util.Arrays;
import java.util.Scanner;

public class Soal3_c14240117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kalimat1 = sc.nextLine().toLowerCase().replace(" ", "");
        String kalimat2 = sc.nextLine().toLowerCase().replace(" ", "");
        char[] kalimat1Arr = kalimat1.toCharArray();
        char[] kalimat2Arr = kalimat2.toCharArray();
        Arrays.sort(kalimat1Arr);
        Arrays.sort(kalimat2Arr);
        if (Arrays.equals(kalimat1Arr, kalimat2Arr)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Bukan Anagram");
        }
        System.out.println();
    }
}
