import java.util.Scanner;

public class P5_Sean_2 {
    public static int Digit(int a){//cari digit pake loop
        int digit=0;
        while (a/(int)Math.pow(10,digit)!=0){//kalo digit dibagi 10^x isa brarti x iku digit e
            digit++;
        }
        return digit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();//input e
        for (int i = Digit(x); i > 0 ; i--) {//loop sebanyak digit
            int a = x/(int)Math.pow(10,i-1)%10;//cari angka pada digit pertama sampai terakhir
            for (int j = 0; j < a; j++) {//loop sebanyak angka pada digit tersebut
                System.out.print(a);//print angka e
            }
            System.out.println();//enter
        }
    }
}
