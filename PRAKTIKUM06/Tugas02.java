import java.util.Scanner;
public class Tugas02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String hari,jenisBuku;
        int banyakBuku;
        double diskon;

        System.out.println("Masukkan nama Hari: ");
        hari = sc.nextLine();

        System.out.println("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = sc.nextLine();

        System.out.println("Masukkan banyak buku: ");
        banyakBuku = sc.nextInt();

        diskon = 0;

        if (hari.equalsIgnoreCase("rabu")) {
           if (jenisBuku.equalsIgnoreCase("kamus")) {
             diskon = 10;
             if (banyakBuku > 2) {
                diskon += 2;
             } else {
                diskon = 10;
             }
           } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (banyakBuku > 3) {
                diskon += 2;
            } else if (banyakBuku <= 3) {
                diskon += 1;
            }
           } else {
            if (banyakBuku > 3) {
                diskon = 5;
            } else {
                System.out.println("Anda tidak mendapat diskon:");
            }
           }

        } else {
            System.out.println("Anda tidak mendapat diskon");
        }
        System.out.println("Total diskon anda: " + diskon + " %");



        sc.close();
    }
}
