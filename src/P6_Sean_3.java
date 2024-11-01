import java.util.Scanner;

public class P6_Sean_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();//input
        char[] arr = str.toCharArray();
        for (int i = 0; i+1 < arr.length; i++) {//loop sampe 1 sblum terakhir
            if (arr[i+1]>=97&&arr[i+1]<=122) {//biar kapital ga di ubah sama sama
                if (arr[i]==32){
                    arr[i+1]= (char) (arr[i+1]-32);//klo yg index i itu spasi index i+1 asci dri kecil ke kapital
                }
                else if (i==0&&arr[i]>=97&&arr[i]<=122) {
                    arr[i]= (char) (arr[i]-32);//pertama slalu kapital
                }
            }
        }
        String s2 = new String(arr);//array to string
        System.out.print(s2);
    }
}
