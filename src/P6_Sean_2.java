import java.util.Scanner;

public class P6_Sean_2 {
    public static void copyArray(int[] a, int[] b){// copy satu satu biar ga pake import
        for (int i = 0; i < b.length; i++) {
            a[i]=b[i];
        }
    }
    public static String PrintArray(int[] arr){//untuk buat array jadi string biar isa di print biar ga pake import krn blom di ajarin
        String temp="";
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1) temp=temp+arr[i];
            else temp=temp+arr[i]+", ";
        }
        return  temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input");//menu input
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        /*int[] arr = {2,1,7,9,0,4,6,5,3};*/
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {//ngisi array
            arr[i] = (int) (Math.random()*10);//Math random 0-9
        }
        System.out.println("Array Awal = ["+PrintArray(arr)+"]");//print random array
        int[] temp = new int[n];
        copyArray(temp,arr);
        int batas2=1;
        int tempangka;
        for (int i = a-1; i < b; i++) {
            tempangka=arr[b-batas2];
            temp[i]=tempangka;//untuk repalce dan ga ganti nilai awal
            batas2++;
        }
        System.out.print("Array Hasil = ["+PrintArray(temp)+"]");//print yang di tuker
    }
}
