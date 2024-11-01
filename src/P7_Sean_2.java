import java.util.ArrayList;
import java.util.Random;

public class P7_Sean_2 {
    public static void PrintArrayList(ArrayList<Integer> a){//ngeprint array
        System.out.print("[");
        for (int i = 0; i < a.size(); i++) {//ngeprint isi array
            if (i==a.size()-1) System.out.print(a.get(i));//klo terakhir
            else System.out.print(a.get(i)+", ");
        }
        System.out.println("]");
    }
    public static void PrintArray(int[] a){//ngeprint array
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {//ngeprint isi array
            if (i==a.length-1) System.out.print(a[i]);//klo terakhir
            else System.out.print(a[i]+", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr3 = new ArrayList<>();
        Random rd = new Random();
        int n = rd.nextInt(1,10);// n random 1-9
        System.out.println("n = "+n);
        int m = rd.nextInt(1,10);// m random 1-9
        System.out.println("m = "+m);
        int[] arr1 = new int[n];//panjang arr1 = n
        for (int i = 0; i < n; i++) {
            arr1[i]= rd.nextInt(1,10);//ngisi arr1 dengan angka random
        }
        int[] arr2 = new int[m];//panjang arr2 = m
        for (int i = 0; i < m; i++) {
            arr2[i]= rd.nextInt(1,10);//ngisi arr2 dengan angka random
        }
        System.out.print("Array 1 = ");
        PrintArray(arr1);
        System.out.print("Array 2 = ");
        PrintArray(arr2);
        for (int i = 0; i < n; i++) {
            int x=0;//x balik ke 0
            for (int j = 0; j < m; j++) {
                if (arr1[i]==arr2[j]){//klo ada nilai yang sama pada arr1[i] di arr2 x bakal jdi 1, jdi kayak true false
                    x=1;
                    break;//cukup ngecek sampe dpt aja
                }
            }
            if (x==0) arr3.add(arr1[i]);//klo ga ada yang sama niali arr1[i] di tambah ke array hasil
        }
        System.out.print("Array Hasil = ");
        PrintArrayList(arr3);
    }
}
