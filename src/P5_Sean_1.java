import java.util.Scanner;

public class P5_Sean_1 {
    public static boolean IsPrime(int a){//CekPrime
        if (a==1) return false;//satu bukan prima
        else if (a==2) return true;//2 prima tp klo mask di loop 2%2==0;
        for (int i = 2; i <=Math.sqrt(a); i++) {//pembagi yang bisa hanya kurang dari sama dengan akar 2 angka tersebut
            if (a%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(); //inputan bilangan bulat
        int hasil=0;//initialize
        for (int i = 1; i <=x; i++) {//0<prima<=x
            /*if (IsPrime(i)){
                hasil+=i;//hasil+angka primanya
                System.out.print(i+" ");
            }*/
        }
        System.out.println();//ksik spasi
        System.out.println(hasil);
    }
}