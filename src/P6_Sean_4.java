import java.util.Scanner;

public class P6_Sean_4 {
    public static int Faktorial(int a){//method nyari faktorialnya
        if (a==0)return 1;//klo 0!=1
        for (int i = a-1;i>0;i--){//x!=(x-1)*(x-2)*... sampai x=1;
            a=a*i;
        }
        return a;
    }
    public static int[] calcFactorial(int[] a){//bikin array baru dengan nilai faktorialnya
        int[] temp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i]=Faktorial(a[i]);
        }
        return temp;
    }
    public static void sumFactorial(int[] a){//penjumlahan dari masing masing index
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp +=a[i];
        }
        System.out.println(temp);//ngeprint total
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang Array (n) : ");//panjang array
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Array 1 : ");
        for (int i = 0; i < n; i++) { // input
            arr[i]=sc.nextInt();
        }
        System.out.print("Array 2 : ");
        int[] arrf = calcFactorial(arr);
        for (int i = 0; i < n; i++) { // nge print isi array factorial
            System.out.print(arrf[i]+" ");
        }
        System.out.println();
        System.out.print("Total Hasil : ");
        sumFactorial(arrf);
    }
}
