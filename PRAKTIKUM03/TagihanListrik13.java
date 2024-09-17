import java.util.Scanner;
public class TagihanListrik13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double tarifListrik = 1500;
        
        System.out.println("Masukkan lama penggunaan (kwh): ");
        double lamaPenggunaan = sc.nextDouble();
        double totalTagihan = tarifListrik * lamaPenggunaan;
        System.out.println("Total tagihan listrik: " + totalTagihan);
        System.out.println(totalTagihan > 500);

    }
    
}
