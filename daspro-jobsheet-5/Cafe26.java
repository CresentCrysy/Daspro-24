import java.util.Scanner;
public class Cafe26 {
    public static void main(String[] args) {
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        Scanner sc = new Scanner(System.in);
        double hargaMenu = 0, totalHarga, diskon, nominalBayar;

        System.out.println("Masukan menu: ");
        menu = sc.nextLine();
        System.out.println("Masukan ukuran cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.println("Masukan jumlah: ");
        jumlah = sc.nextInt();
        System.out.println("Masukkan keanggotaan (true or false): ");
        keanggotaan = sc.nextBoolean();

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }
        
        totalHarga = hargaMenu*jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga+=0.25*totalHarga;
                break;
            case 'L':
                totalHarga+=0.04*totalHarga;
                break;
            default:
                break;
        }

        diskon = keanggotaan ? 0.1:0;
        nominalBayar = totalHarga - (diskon*totalHarga);

        System.out.println("Item pembelian: "+jumlah+" "+menu+" dengan ukuran cup"+ukuranCup);
        System.out.println("Nominal bayar: "+nominalBayar);
    }
}
