import java.util.Scanner;
public class TugasTiketBioskop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jumlahTiket = 0, totalTiket = 0;
        double hargaTiket = 50000, harga = 0, totalHarga = 0, diskon = 0;
        String lanjutkan = " ";

        do {
            System.out.println("Masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();
            sc.nextLine();

            if (jumlahTiket > 0) {
                harga = jumlahTiket * hargaTiket;
                if (jumlahTiket > 10) {
                    diskon = 0.15;
                    harga -= harga * diskon;
                } else if (jumlahTiket > 4) {
                    diskon =  0.10;
                    harga -= harga * diskon;
                }

                totalTiket += jumlahTiket;
                totalHarga += harga;

                System.out.println("Jumlah tiket terjual adalah: " + jumlahTiket);
                System.out.println("Harga Tiket adalah: " + harga);
            }

            System.out.print("Apakah anda ingin melanjutkan?(y/n): ");
            lanjutkan = sc.nextLine();
        } while (lanjutkan.equalsIgnoreCase("y"));

        System.out.println("Total Tiket terjual adalah: " + totalTiket);
        System.out.println("Total penjualan tiket adalah:  " + totalHarga);



        sc.close();
    }
    
}
