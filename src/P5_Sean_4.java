import java.util.Scanner;

public class P5_Sean_4 {
    public static int Digit(int a){//cari digit pake loop
        int digit=0;
        while (a/(int)Math.pow(10,digit)!=0){//kalo digit dibagi 10^x isa brarti x iku digit e
            digit++;
        }
        return digit;
    }//cek banyak digit
    public static int Reverse(int a){
        int rev=0;
        for (int i = 0; i < Digit(a); i++) {
            int dig;
            dig=(a/(int)Math.pow(10,Digit(a)-i-1)%10);
            dig=dig*(int)Math.pow(10,i);
            rev=rev+dig;
        }
        return rev;
    }//cek klo di reverse
    public static boolean CekKondisi(int a){
        for (int i = Digit(a); i > Digit(a)/2 ; i--) {//loop sebanyak digit
            int temp = a/(int)Math.pow(10,i-1)%10;//cari angka pada digit pertama sampai terakhir
            if(temp==0||a%temp!=0) return false;//klo ada angka 0 atau ga isa di bagi digit e kondisi false
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L=sc.nextInt();
        int H=sc.nextInt();
        int hasil=0;
        if (L<123456||H>987654) System.out.println("Input salah");
        else {
            for (int i = L; i <= H; i++) {
                if (i==Reverse(i)&&CekKondisi(i)){//klo palindrome & kondisi benar
                    hasil++;
                }
            }
            System.out.println(hasil);
        }
    }
}
