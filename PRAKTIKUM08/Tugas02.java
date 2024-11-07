import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cabang olahraga PORSENI tahun 2024");
        System.out.println("1. Badminton");
        System.out.println("2. Tenis Meja");
        System.out.println("3. Basket");
        System.out.println("4. Bola voly");

        do {
            System.out.print("Masukkan Cabor (ketik 'batal' untuk keluar): ");
            String cabor = sc.nextLine();
            System.out.println("Masukkan nama atlet Cabor " + cabor);
            if (cabor.equalsIgnoreCase("batal")) {
                System.out.println("Pendaftaran Selesai.");
                break;
            }

            String namaAtlet = " ";
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nama Atlet ke- " + j + " =");
                namaAtlet += sc.nextLine() + " ";
            }
            System.out.println("Atlet Cabor " + cabor + " adalah:" + namaAtlet);
        } while (true);

        sc.close();
    }
}
