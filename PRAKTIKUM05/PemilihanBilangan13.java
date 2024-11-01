import java.util.Scanner;
public class PemilihanBilangan13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        
        String hasil;
        hasil = (angka % 2 == 0) ? " genap" : " ganjil";
        System.out.println("Bilangan " + angka + " termasuk bilangan" + hasil);

        
        sc.close();
        }

    }