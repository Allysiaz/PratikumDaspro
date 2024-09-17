import java.util.Scanner;
public class GajiBulananKaryawan {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double upah = 120000;
        double persentaseBonus = 0.1;
        double persentasePajak = 0.05;

        System.out.println("Masukkan Jumlah jam kerja: ");
        int jamKerja = sc.nextInt();

        double gajiAwal = upah * jamKerja;
        System.out.println("Gaji awal anda: " +gajiAwal);

        double bonus = persentaseBonus * gajiAwal;

        double gajiSetelahBonus = gajiAwal + bonus;
        System.out.println("Gaji anda setelah bonus: " +gajiSetelahBonus);

        double pajak = persentasePajak * gajiSetelahBonus;

        double totalGaji = gajiSetelahBonus - pajak;
        System.out.println("Total Gaji anda adalah: " +totalGaji);


    }
}
