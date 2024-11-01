import java.util.ArrayList;
import java.util.Scanner;

public class P8_Sean_2 {
    public static boolean MapEmpty(char[][] map){// cek map e ke isi semua atau engga
        for (int i = 0; i < map.length-1; i++) {
            for (int j = 0; j < map.length-1; j++) {
                if (map[i][j]==' '){// klo ketemu kotak kosong brarti blom ke isi
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean SamaBatas(ArrayList<Integer> a, int batas){// cek klo dlm array list ada 3 angka yang sama atau engga
        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) count++;
                if (count==batas) return true;
            }
        }
        return false;
    }
    public static boolean SamaDiagonal(char[][] map, int batas){
        int x = 0;
        int y = 0;
        for (int i = 0; i < map.length-2; i++) {
            if (map[i][i]==map[i+1][i+1]&&map[i][i]!=' '){//klo diagonal atas krii ke bwh
                x++;
            }
        }
        for (int i = 0; i < map.length-2; i++) {
            for (int j = 0; j < map.length-1; j++) {
                if (i+j == map.length-2){
                    if (map[i][j]==map[i+1][j-1]&&map[i][j]!=' '){//klo diagonal atas kanan ke bwh
                        y++;
                    }
                }
            }
        }
        return x==batas||y==batas;
    }
    public static boolean KondisiMenang(char[][] map){//kondisi menang
        ArrayList<Integer> tXx = new ArrayList<>(), tXy = new ArrayList<>(), tOx = new ArrayList<>(),tOy = new ArrayList<>();
        for (int i = 0; i < map.length-1; i++) {// menang klo 3 sama secara horizontal atau vertikal
            for (int j = 0; j < map[i].length-1; j++) {
                if (map[i][j]=='X'){
                    tXx.add(j);//kordinat x dri X disimpan
                    tXy.add(i);//kordinat y dri X disimpan
                }
                if (map[i][j]=='O'){
                    tOx.add(j);//kordinat x dri O disimpan
                    tOy.add(i);//kordinat y dri O disimpan
                }
            }
        }
        if (SamaDiagonal(map, map.length-2)) return true;// ini klo iring sama tp bukan empty space
        return SamaBatas(tXx, map.length-1)|| SamaBatas(tXy, map.length-1)|| SamaBatas(tOx, map.length-1)|| SamaBatas(tOy, map.length-1);//pake method di atas ngecek nya
    }
    public static void PrintMap(char[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j==a[i].length-1) System.out.println(a[i][j]);
                else if (j==0) System.out.print("| "+a[i][j]+" | ");
                else System.out.print(a[i][j]+" | ");
            }
        }
    }//untuk ngeprint map
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ukuran map n*n, n = ");
        int n = sc.nextInt();
        char[][] map = new char[n+1][n+1];
        for (int i = 0; i < n; i++) {//ngisi map
            for (int j = 0; j < n; j++) {
                map[i][j] = ' ';
            }
        }
        for (int i = 0; i < n; i++) {//ngisi penomoran
            map[i][n] = (char) (i+49);
            map[n][i] = (char) (i+49);
        }
        char in = 'X';//player 1
        do{
            PrintMap(map);
            System.out.print("Input "+in+" : ");
            int y = sc.nextInt()-1;
            int x = sc.nextInt()-1;
            if (x<map.length-1&&x>=0&&y>=0&&y<map[y].length-1){
                if (map[y][x] == ' '){// klo bisa di isi
                    map[y][x] = in;
                    if (in == 'X') in = 'O';// tuker ke player 2
                    else in = 'X';
                }
            }
            System.out.println();
        }while (!KondisiMenang(map)&&!MapEmpty(map));
        PrintMap(map);
        if(KondisiMenang(map)){// klo kondisi menang true
            if(in=='X') System.out.println("O menang");//cek input terakhir
            else System.out.println("X menang");
        }
        else System.out.println("Seri");// klo map ke isi full dan blom ada yang menang
    }
}
