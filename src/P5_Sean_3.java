import java.util.Scanner;

public class P5_Sean_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int x= sc.nextInt();
        int total_botol=a+b;// total botol yg bekas, botol a bakal jadi b
        int botol_baru=0;// initialize botol baru
        do {
            int temp=total_botol/x;//hasil dari di tuker(botol a yang bakal jadi b baru)
            int temp1=total_botol%x;// sisa botol yg belum di tuker
            total_botol=temp+temp1;//botol yang dimiliki=yang dituker+yang sisa
            botol_baru=botol_baru+temp;//total botol baru yang di tukar
        }while (total_botol/x!=0);//while e klo masih bisa nuker;
        System.out.println(botol_baru);
    }
}
