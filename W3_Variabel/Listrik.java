import java.util.Scanner;

public class Listrik {
    public static void main(String[] args) {
        // Deklarasi variabel
        double listrik, tarif = 1500, totalTagihan;
        
        // Membuat objek scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Input jumlah penggunaan listrik (kWh)
        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        listrik = input.nextDouble();
        
        // Menghitung total tagihan listrik
        totalTagihan = listrik * tarif;
        
        // Menampilkan total tagihan
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        
        // Menampilkan hasil pengecekan apakah penggunaan lebih dari 500 kWh
        if (listrik>500) {
            System.out.println("Penggunaan listrik melebihi 500 kWh.");
        } else {
            System.out.println("Penggunaan listrik tidak melebihi 500 kWh.");
        }
        
        // Menutup Scanner
        input.close();
    }
}
