import java.util.Random;
import java.util.Scanner;

public class P7_Sean_3 {
    public static void PrintArray(int[] a){//ngeprint array
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {//ngeprint isi array
            if (i==a.length-1) System.out.print(a[i]);//klo terakhir
            else System.out.print(a[i]+", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=rd.nextInt(0,10);//random 0-9
        }
        System.out.print("Array = ");
        PrintArray(arr);
        int max = Integer.MIN_VALUE;//nilai awal max adalah nilai terkecil biar bisa di bandingin langsung
        for (int i = 0; i < n; i++) {
            if (max<arr[i]) max = arr[i];//klo arr[i] lbh besar dri max, nilai max jadi arr[i]
        }
        System.out.println("Max = "+max);
        int min = Integer.MAX_VALUE;//niai awal min adalah nilai terbesar biar bisa di bandingn
        for (int i = 0; i < n; i++) {
            if (min>arr[i]) min = arr[i];//klo nilai arr[i] lbh kecil dri min, min jdi arr[i]
        }
        System.out.println("Min = "+min);
        int modus = arr[0],count = 0,temp;// modus di muali dri angka pertama array, abistu ada counter yang ngitung banyak angka tersebut
        for (int i = 0; i < n; i++) {//angka pembanding
            int tempcount = 0;//tempcount berguna untuk perbandingan count dri yang bakal jadi modus dengan count angka angka lain
            temp=arr[i];//temp bakal jadi arr[i]
            for (int j = 0; j < n; j++) {//angka yang mau di bandingin
                if(temp==arr[j]){//klo temp ada yang sama dengan arr[i] tempcount bertambah
                    tempcount++;
                }
            }
            if (tempcount>count){//klo tempcount lbh besar dir counter dri modus
                count=tempcount;// counter modus jadi tempcount
                modus=temp;// modus jadi temp
            }
        }
        System.out.println("Modus = "+modus);
    }
}
