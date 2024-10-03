import java.util.Scanner;
public class Pos {
    public static void main(String[] args) {
        int jumlah, hargaSatuan, uang;
        Scanner sc = new Scanner(System.in);

        System.out.println("Jumlah barang: ");
        jumlah = sc.nextInt(); 
        System.out.println("Masukan harga satuan: ");
        hargaSatuan = sc.nextInt();
        int hargaTotal = jumlah*hargaSatuan;
        System.out.println("Harga Total = "+hargaTotal);
    }
}