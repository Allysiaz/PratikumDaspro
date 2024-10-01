import java.util.Scanner;
public class Parkir13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String jenisKendaraan;
        int lamaParkir;

        System.out.print("Masukkan jenis kendaraan: ");
        jenisKendaraan = sc.nextLine();
        System.out.print("Lama Parkir (jam): ");
        lamaParkir = sc.nextInt();
        
        double biayaParkir;

        switch (jenisKendaraan.toLowerCase()) {
            case "motor":
                biayaParkir= 3000;
                break;
            case "mobil":
                biayaParkir = 5000;
                break;
        }

        double totalHarga = biayaParkir * lamaParkir;

        System.out.println("Jenis kendaraan anda adalah: " + jenisKendaraan);
        System.out.println("Total biaya parkir yang dibayar: " + totalHarga);

    }
}
