import java.util.Scanner;

public class SearchNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai: ");
        int banyakNilai = sc.nextInt();
        int [] arrNilai = new int[banyakNilai];
        
        for (int i = 0; i < banyakNilai; i++){
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan Nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++){
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        if (hasil != -1) {
            System.out.println();
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke- " + (hasil+1));
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Nilai yang dicari Tidak Ditemukan!");
            System.out.println();
        }
        sc.close();
    }
}
