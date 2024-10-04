import java.util.Scanner;

public class Pemilihan2Percobaan213 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

       

        System.out.println("----------------------------------------");
        System.out.println("============ MENU KAFE JTI =============");
        System.out.println("----------------------------------------");
        System.out.println("1.  Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("----------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih = ");

        int pilihan_menu;
        String member;

        pilihan_menu = sc.nextInt();
        sc.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = sc.nextLine();
        System.out.println("----------------------------------------");

        int harga;
        double diskon, totalBayar;

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
    
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling = " + harga);
        
            } else {
                System.out.println("Masukkan pilihan menu dengan benar!");
                return;
            }

            totalBayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + totalBayar);
        }
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 1400;
                System.out.println("Harga Ricebowl = " + harga);
    
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling = " + harga);
        
            } else {
                System.out.println("Masukkan pilihan menu dengan benar!");
                return;
            }

        } else {
            System.out.println("Member tidak Valid!");
        }

        System.out.println("----------------------------------------");
        

    
    }

}
