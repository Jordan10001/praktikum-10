import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P9_Sean_1 {
    public static void magicText(File f){//ganti isi file
        try {
            Scanner wc = new Scanner(System.in);//scanner input
            String ganti = wc.next();//kata ganti nya
            wc.close();
            Scanner sc = new Scanner(f);
            String writeTo = "Alkisah-";
            while (sc.hasNextLine()) {
                writeTo += sc.nextLine().replace("istri", ganti);//nge build string dri isi file
            }
            sc.close();
            writeToFile(f,writeTo);//di overwrite file yang tadi dengan String baru
            System.out.println("Successfully wrote to the file");
        }catch (Exception e){
            System.out.println("File not found");
        }
    }
    public static void readFromFile(File f){//baca isi file
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){//klo ada line bakal jalan
                System.out.println(sc.nextLine());//klo ada line di sout
            }
            sc.close();
        }catch (Exception e){
            System.out.println("File not found");
        }
    }
    public static void writeToFile(File f, String s){//nulis ke dlm file
        try {
            FileWriter wr = new FileWriter(f);
            wr.write(s);//dri string yang ada di masukin ke file
            wr.close();
        }catch (Exception e){
            System.out.println("File not found");
        }
    }
    public static void main(String[] args) {
        try {
            File f = new File("ceritaLucu.txt");
            if (f.createNewFile()) System.out.println("File created");//bikin file
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan teks: ");
            String s = sc.nextLine();
            writeToFile(f,s);//nulis ke file dri string yang ada
            System.out.print("Kata ganti: ");
            magicText(f);//ganti isi file
            readFromFile(f);//baca isi file
        }catch (IOException e){
            System.out.println("File not found");
        }
    }
}
