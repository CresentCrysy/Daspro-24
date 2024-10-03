package Quiz;
import java.util.Scanner;
public class PengunaanBahanBakar {
    public static void main(String[] args) {
        //deklarasi variable
        double kecepatanKota, kecepatanTol, kecepatanGunung,
        durasiKota, durasiTol, durasiGunung, mesin,
        konsumsiKota, konsumsiTol, konsumsiGunung,
        jarakKota, jarakTol, jarakGunung,
        kota = 0.5, tol = 0.3, pegunungan = 0.7,
        totalKonsumsi, totalDurasi, totalJarak,
        rata2, presentase, target;
        Scanner sc = new Scanner(System.in);

        //input kecepatan
        System.out.print("Masukan kecepatan anda menyetir di kota: ");
        kecepatanKota = sc.nextDouble();
        System.out.print("Masukan kecepatan anda menyetir di tol: ");
        kecepatanTol = sc.nextDouble();
        System.out.print("Masukan kecepatan anda menyetir di gunung: ");
        kecepatanGunung = sc.nextDouble();

        //input durasi
        System.out.print("Berapa lama anda menyetir di kota: ");
        durasiKota = sc.nextDouble();
        System.out.print("Berapa lama anda menyetir di tol: ");
        durasiTol = sc.nextDouble();
        System.out.print("Berapa lama anda menyetir di gunung: ");
        durasiGunung = sc.nextDouble();

        //input cc mesin
        System.out.print("Masukan cc mesin anda: ");
        mesin = sc.nextDouble();
        //input target
        System.out.print("Target pengunaan bahan bakar anda: ");
        target = sc.nextDouble();

        //menghitung jarak
        jarakKota = kecepatanKota*durasiKota;
        jarakTol = kecepatanTol*durasiTol;
        jarakGunung = kecepatanGunung*durasiGunung;

        //menghitung konsumsi bahan bakar
        konsumsiKota = ((jarakKota/100)*mesin*kota);
        konsumsiTol = ((jarakTol/100)*mesin*tol);
        konsumsiGunung = ((jarakGunung/100)*mesin*pegunungan);

        //menghitung total konsumsi, durasi, dan jarak
        totalKonsumsi = konsumsiKota+konsumsiTol+konsumsiGunung;
        totalDurasi = durasiKota+durasiTol+durasiGunung;
        totalJarak = jarakKota+jarakTol+jarakGunung;
    
        //menghitung rata-rata konsumsi bahan bakar
        rata2 = totalKonsumsi/totalJarak;
        
        //menghitung presentase target
        presentase = totalKonsumsi/target*100;

        System.out.println(totalJarak);

        //output hasil
        System.out.println("\nBanyak bensin yang di perlukan untuk perjalan di kota adalah: "+konsumsiKota+" liter");
        System.out.println("\nBanyak bensin yang di perlukan untuk perjalan di tol adalah: "+konsumsiTol+" liter");
        System.out.println("\nBanyak bensin yang di perlukan untuk perjalan di gunung adalah: "+konsumsiGunung+" liter");
        System.out.println("\nTotal bensin yang anda gunakan dari semua segmen adalah: "+totalKonsumsi+" liter");
        System.out.println("\nRata-rata bensin yang anda gunakan: "+rata2+" liter/km");
        System.out.println("\nPresentase pengunaan bahan bakar = "+presentase+"%");
    }
}
