package W6_Pemilihan_2;
import java.util.Scanner;
public class Pemilihan2Percobaan226 {
    public static void main(String[] args) {
        String member;
        int jumlahBeli, harga, menu;
        double diskon, totalBayar;
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("===== MENU KAFE JTI =========");
        System.out.println("-----------------------------");
        System.out.println("Masukan member (true/false): ");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Pilih menu: ");
        menu = sc.nextInt();
        sc.nextLine();
        System.out.println("Apakah punya member (y/n): ");
        member = sc.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu == 1) {
               harga = 14000;
               System.out.println("Harga Ricebowl = "+harga);
            }
            else if (menu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea = "+harga);
            }
            else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = "+harga);
            }
            else {
                System.out.println("Masukan pilihan menu yang benar!");
                return;
            }

            totalBayar = harga - (harga*diskon);
            System.out.println("Total bayar setelah diskon: "+totalBayar);
        }
        else if(member.equalsIgnoreCase("n")){
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = "+harga);
             }
             else if (menu == 2){
                 harga = 3000;
                 System.out.println("Harga Ice Tea = "+harga);
             }
             else if (menu == 3) {
                 harga = 15000;
                 System.out.println("Harga bundling = "+harga);
             }
             else {
                 System.out.println("Masukan pilihan menu yang benar!");
                 return;
             }
             System.out.println("Total bayar = "+harga);
        }
        else {
            System.out.println("member tidak valid");
        }
        System.out.println("--------------------------------------");
    }
}
