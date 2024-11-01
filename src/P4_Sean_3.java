import java.util.Scanner;

public class P4_Sean_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hari: ");
        int hari = sc.nextInt();
        int tunas=1;
        int prajurit=0;
        int jendral=0;
        int raja=0;
        for (int i = 1; i <= hari; i++) {
            System.out.print("Hari ke-"+i+": ");
            int temptunas=0;
            if (raja>0){
                System.out.print(raja+" raja ");
                temptunas=raja;
            }
            if (jendral>0){
                System.out.print(jendral+" jendral ");
                raja+=jendral;
                jendral-=jendral;
            }
            if (prajurit>0){
                System.out.print(prajurit+" prajurit ");
                jendral+=prajurit;
                prajurit-=prajurit;
            }
            if(tunas>0 || temptunas>0){
                if (tunas!=0){
                    System.out.print(tunas+" tunas ");
                }
                prajurit+=tunas;
                tunas-=tunas;
                tunas+=temptunas;
            }
            System.out.println();
        }
    }
}
