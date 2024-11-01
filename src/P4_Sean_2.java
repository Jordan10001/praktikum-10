import java.util.Scanner;

public class P4_Sean_2 {
    public static String encrip(String a,int b){//method encripsi
        String d="";//bikin string kosong
        for (int i = 0; i < a.length(); i++) {//ngisi string kosong dengan char+3 nya
            char temp = a.charAt(i);
            if ((int)temp>=65&&(int)temp<=90){
                temp+= (char) b;
                if ((int)temp<65){
                    temp=(char)(temp-64+90);
                }
                else if ((int)temp>90){
                    temp=(char)(temp+64-90);
                }
            }
            else if ((int)temp>=97&&(int)temp<=122){
                temp+= (char) b;
                if ((int)temp<97){
                    temp=(char)(temp-96+122);
                }
                else if ((int)temp>122){
                    temp=(char)(temp+96-122);
                }
            }
            d=d+temp;
        }
        d=d.replace((char) (32+b),' ');//replace spasi+key dengan spasi
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\"" + "======MENU======");
            System.out.print("Input Pesan: ");
            String iP = sc.nextLine();
            System.out.print("Pergeseran(Maju/Mundur): ");
            String pergeseran = sc.nextLine();
            if (!(pergeseran.equalsIgnoreCase("maju"))&&!(pergeseran.equalsIgnoreCase("mundur"))) break;
            System.out.print("Keys: ");
            int key = sc.nextInt();
            if (pergeseran.equalsIgnoreCase("mundur"))key=key*(-1);
            System.out.print("1. Enkripsi Pesan\n" +
                    "2. Dekripsi Pesan\n" +
                    "3. Keluar\n" +
                    "Choice: ");
            int choice = sc.nextInt();
            System.out.print("Hasil Pesan: ");
            if (choice==3) break;
            switch (choice){
                case 1 -> System.out.println(encrip(iP,key));
                case 2 -> System.out.println(encrip(iP,key*(-1)));
                default -> System.out.println("Not a choice");
            }
            sc.nextLine();
        }while (true);
    }
}