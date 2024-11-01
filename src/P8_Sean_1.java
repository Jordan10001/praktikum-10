import java.util.Scanner;

public class P8_Sean_1 {
    public static void PrintMap(char[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j==a[i].length-1) System.out.println(a[i][j]);
                else System.out.print(a[i][j]+" ");
            }
        }
    }//untuk ngeprint map
    public static void Play(char[][] lab, int Sb, int Sk, int Eb, int Ek ){//biar pake method
        Scanner sc = new Scanner(System.in);
        do {
            PrintMap(lab);
            System.out.print("Input: ");
            char input = sc.next().toLowerCase().charAt(0);//convert ke lower case jadi input bebas lower atau upper case
            switch (input){//switch case input
                case 'w':
                    if (Sb-1 >=0 && lab[Sb-1][Sk]!='x') {//kondisi ga nyentuh tembok atau bukan x kalau gerak ke atas
                        if (Sb-1 == Eb && Sk == Ek){//klo mau menang
                            lab[Sb][Sk] = '.';
                            lab[--Sb][Sk] = 'S';
                            break;
                        }
                        char temp = lab[Sb][Sk];//penukaran char
                        lab[Sb][Sk] = lab[--Sb][Sk];
                        lab[Sb][Sk] = temp;
                    }
                    break;
                case 's':
                    if (Sb + 1 < lab.length && lab[Sb +1][Sk]!='x') {//kondisi ga nyentuh tembok atau bukan x kalau gerak ke bawah
                        if (Sb + 1 == Eb && Sk == Ek){//klo mau menang
                            lab[Sb][Sk] = '.';
                            lab[++Sb][Sk] = 'S';
                            break;
                        }
                        char temp = lab[Sb][Sk];//penukaran char
                        lab[Sb][Sk] = lab[++Sb][Sk];
                        lab[Sb][Sk] = temp;
                    }
                    break;
                case 'a':
                    if (Sk -1>=0 && lab[Sb][Sk-1]!='x') {//kondisi ga nyentuh tembok atau bukan x kalau gerak ke kiri
                        if (Sb == Eb && Sk-1 == Ek){//klo mau menang
                            lab[Sb][Sk] = '.';
                            lab[Sb][--Sk] = 'S';
                            break;
                        }
                        char temp = lab[Sb][Sk];//penukaran char
                        lab[Sb][Sk] = lab[Sb][--Sk];
                        lab[Sb][Sk] = temp;
                    }
                    break;
                case 'd':
                    if (Sk+1<lab[Sb].length && lab[Sb][Sk+1]!='x') {//kondisi ga nyentuh tembok atau bukan x kalau gerak ke kanan
                        if (Sb == Eb && Sk+1 == Ek){//klo mau menang
                            lab[Sb][Sk] = '.';
                            lab[Sb][++Sk] = 'S';
                            break;
                        }
                        char temp = lab[Sb][Sk];//penukaran char
                        lab[Sb][Sk] = lab[Sb][++Sk];
                        lab[Sb][Sk] = temp;
                    }
                    break;
            }
            System.out.println();
        }while (Sb != Eb || Sk !=Ek);
    }
    public static void main(String[] args) {
        char[][] lab = {
                {'.', 'x', '.', '.', '.'},
                {'.', '.', '.', 'x', 'E'},
                {'.', '.', 'x', 'x', '.'},
                {'x', '.', '.', 'x', 'x'},
                {'.', '.', '.', '.', 'S'}
        };
        int Sb = 0, Sk = 0, Eb = 0, Ek = 0;
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                if (lab[i][j] == 'S') {// detect kordinat Playernya
                    Sb = i;
                    Sk = j;
                }
                if (lab[i][j] == 'E') {// detect kordinat finishnya
                    Eb = i;
                    Ek = j;
                }
            }
        }
        Play(lab, Sb, Sk, Eb, Ek);
        PrintMap(lab);//print map terakhir
        System.out.println("Anda menang");// klo menang
    }
}
