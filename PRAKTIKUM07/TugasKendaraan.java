import java.util.Scanner;

public class TugasKendaraan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int jenis, durasi,total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan (1=mobil, 2=motor, 0=keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis ==2) {
                System.out.println("masukkan lama durasi parkir: ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;        
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;                
                }
            }
        } while (jenis != 0);

        System.out.println("Total Bayar: " + total);

    }
}