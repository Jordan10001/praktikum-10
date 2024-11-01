import java.util.ArrayList;
import java.util.Scanner;

public class P7_Sean_1 {
    public static void PrintArrayList(ArrayList<Integer> a){//ngeprint array
        System.out.print("[");
        for (int i = 0; i < a.size(); i++) {//ngeprint isi array
            if (i==a.size()-1) System.out.print(a.get(i));//klo terakhir
            else System.out.print(a.get(i)+", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();//arraylist
        int option,temp,index;
        do {
            System.out.println();
            System.out.print("MENU ARRAY\nArray = ");//menu
            PrintArrayList(arr);
            System.out.print("\t1.  Add Data\n\t2.  Remove Data\n\t3.  Replace Data\n\t4.  Duplicate Data\n\t5.  Search Data\n\t6.  Print Array\n\t7.  Keluar\nChoice : ");
            option = sc.nextInt();
            switch (option){
                case 1://option 1
                    System.out.println();
                    System.out.print("MENU ADD DATA\nArray = ");
                    PrintArrayList(arr);
                    System.out.print("\t1.  Add Depan\n\t2.  Add Belakang\n\t3.  Add Tengah\nChoice : ");//menu
                    option = sc.nextInt();
                    switch (option){//option klo case 1
                        case 1:
                            System.out.print("Isi data : ");
                            temp = sc.nextInt();
                            arr.add(0,temp);//nambah di awal
                            System.out.println("Data berhasil ditambahkan di depan array!");
                            break;
                        case 2:
                            System.out.print("Isi data : ");
                            temp = sc.nextInt();
                            arr.add(temp);//nambah di akhir
                            System.out.println("Data berhasil ditambahkan di belakang array!");
                            break;
                        case 3:
                            System.out.print("Index : ");
                            index = sc.nextInt();// input index
                            System.out.print("Isi data : ");
                            temp = sc.nextInt();
                            arr.add(index,temp);//nambah sesuai index
                            System.out.println("Data berhasil ditambahkan pada index ke-"+index+"!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.print("MENU REMOVE DATA \nArray = ");
                    PrintArrayList(arr);
                    System.out.print("\t1.  Remove Index\n\t2.  Remove Isi Data\nChoice : ");//menu
                    option = sc.nextInt();
                    switch (option){
                        case 1:
                            System.out.print("Index : ");
                            index = sc.nextInt();
                            arr.remove(index);// remove sesuai index
                            System.out.println("Data pada index ke-"+index+" berhasil dihapus!");
                            break;
                        case 2:
                            System.out.print("Isi data : ");
                            temp = sc.nextInt();
                            ArrayList<Integer> arrtemp = new ArrayList<>();//bikin array baru
                            for (Integer integer : arr) {
                                if (integer != temp) arrtemp.add(integer);// copy isi array yg ga isi angka tersebut
                            }
                            arr=arrtemp;//array awal di ubah nilainya sama dengan arrtemp
                            System.out.println("Data "+temp+" berhasil dihapus dari array!");
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Array = ");
                    PrintArrayList(arr);
                    System.out.print("Index : ");
                    index = sc.nextInt();
                    System.out.print("Isi data : ");
                    temp = sc.nextInt();
                    arr.set(index,temp);//replace angka pada index dengan angka baru
                    System.out.println("Data pada index ke-"+index+" berhasil diganti!");
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Array = ");
                    PrintArrayList(arr);
                    System.out.print("Index : ");
                    index = sc.nextInt();
                    arr.add(arr.get(index));//nambah angka yang sama pada index tesebut
                    System.out.println("Isi data array pada index ke-"+index+" berhasil diduplikat!");
                    break;
                case 5:
                    System.out.println();
                    System.out.print("MENU SEARCH DATA\nArray = ");//print array
                    PrintArrayList(arr);
                    System.out.print("\t1.  Search Index\n\t2.  Search Isi Data\nChoice : ");//menu
                    option = sc.nextInt();
                    switch (option){
                        case 1:
                            System.out.print("Index : ");
                            index = sc.nextInt();
                            System.out.println("Data array pada index ke-"+index+" adalah "+arr.get(index)+"!");
                            break;
                        case 2:
                            System.out.print("Isi data : ");
                            temp = sc.nextInt();
                            if (arr.contains(temp)){
                                System.out.print("Data "+temp+" berada pada index");
                                for (int i = 0; i < arr.size(); i++) {
                                    if (arr.get(i)==temp) System.out.print(" "+i);
                                }
                                System.out.println("!");
                            }
                            else System.out.println("Data "+temp+" tidak ditemukan!");
                            break;
                    }
                    break;
                case 6:
                    System.out.println();
                    System.out.print("Array = ");//print array
                    PrintArrayList(arr);
                    break;
            }
        } while (option != 7);//kluar
    }
}
