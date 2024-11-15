import java.util.Scanner;
public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int [] nilaiMhs = new int[jumlahMhs];
        
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs [i] = sc.nextInt();
        }
        int totalMhsLulus = 0;
        int totalMhsTdkLulus = 0;
        int mhsLulus = 0;
        int mhsTdkLulus = 0;
        double rataLulus, rataTdkLulus;
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];
    
        for (int i = 0; i< nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70){
                totalMhsLulus += nilaiMhs[i];
                mhsLulus++;
            } else {
                totalMhsTdkLulus += nilaiMhs[i];
                mhsTdkLulus++;
            }
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            } if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        rataLulus = totalMhsLulus/mhsLulus;
        System.out.println("Rata-rata nilai Lulus: " + rataLulus);
        rataTdkLulus = totalMhsTdkLulus/mhsTdkLulus;
        System.out.println("Rata-rata nilai Tidak Lulus: " + rataTdkLulus);

        System.out.println("Nilai Tertinggi mahasiswa: " + nilaiTertinggi);
        System.out.println("Nilai Terendah mahasiswa: " + nilaiTerendah);
    }
}

