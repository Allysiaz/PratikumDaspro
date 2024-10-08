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

        if (hari.equalsIgnoreCase("rabu")) {
            diskon = 0.10;

        }

    }
}
