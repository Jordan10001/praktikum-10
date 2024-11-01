import java.util.Scanner;

public class P6_Sean_1 {
    public static void copyArray(int[] a, int[] b){// copy satu satu biar ga pake import
        for (int i = 0; i < b.length; i++) {
            a[i]=b[i];
        }
    }
    public static int[] sortA(int[] a) {//tuker Ascending
        int[] temparr = new int[a.length];
        copyArray(temparr, a);
        while(true){
            int x=0;
            for (int j = 0; j+1 < temparr.length; j++) {
                int temp;
                if (temparr[j] > temparr[j + 1]) { //klo yang dpn lebih gede di tuker
                    x = 1;
                    temp = temparr[j];
                    temparr[j] = temparr[j + 1];//tuker
                    temparr[j + 1] = temp;
                }
            }
            if(x==0) break;//pengecekan klo udh ga nge sort lagi
        }
        return temparr;
    }
    public static int[] sortD(int[] a) {//tuker decencding
        int[] temparr = new int[a.length];
        copyArray(temparr, a);
        while(true){
            int x=0;
            for (int j = 0; j+1 < temparr.length; j++) {
                int temp;
                if (temparr[j] < temparr[j + 1]) { //klo yang dpn lebih kecil di tuker
                    x = 1;
                    temp = temparr[j];
                    temparr[j] = temparr[j + 1];//tuker
                    temparr[j + 1] = temp;
                }
            }
            if(x==0) break;//pengecekan klo udh ga nge sort lagi
        }
        return temparr;
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
        int option;
        int[] arr = new int[0];
        do {
            System.out.println("MENU ARRAY");//Menu nya
            System.out.println("Array = ["+ PrintArray(arr) + "]");
            System.out.println("\t1.\tBuat Array Baru\n\t2.\tSorting\n\t3.\tKluar");
            System.out.print("Choice: ");
            option = sc.nextInt();//pilihan
            switch (option) {
                case 1://ngisi array baru
                    System.out.println();
                    System.out.print("Panjang Array : ");
                    int panjang = sc.nextInt();
                    arr = new int[panjang];//nge clear array awal
                    System.out.print("Isi Array : ");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i]=sc.nextInt();//isi array
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("MENU SORTING\n\t1.\tAscending\n\t2.\tDescending");
                    System.out.print("Choice : ");
                    int option1 = sc.nextInt();
                    int[] temp = new int[arr.length];//biar bisa nge print yang awal
                    String ab = "";//biar jadi satu skalian
                    switch (option1){
                        case 1:
                            temp = sortA(arr);
                            ab = "Ascending";
                            break;
                        case 2:
                            temp = sortD(arr);
                            ab = "Descending";
                            break;
                        default:
                            temp=arr;
                            ab ="Dengan Option "+option1;
                            break;
                    }
                    System.out.println();
                    System.out.println("Array Awal : ["+PrintArray(arr)+"]");
                    System.out.println("Array "+ab+" : ["+PrintArray(temp)+"]");
                    arr=temp;
                    break;
                default: break;
            }
            System.out.println();
        } while (option!=3);// kondisi while nya
        System.out.println("Array = ["+PrintArray(arr)+"]");
        System.out.print("Terima Kasih!");
    }
}
