import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        // Deklarasi variabel
        double jamKerja, upahPerJam;
        double gajiSebelumBonus, bonus, totalGaji, pajak, gajiBersih;
        
        // Membuat objek scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Input jumlah jam kerja dan upah per jam
        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = input.nextDouble();
        
        System.out.print("Masukkan upah per jam: ");
        upahPerJam = input.nextDouble();
        
        // Menghitung gaji sebelum bonus (gaji = jam kerja * upah per jam)
        gajiSebelumBonus = jamKerja * upahPerJam;
        
        // Menghitung bonus sebesar 10% dari gaji sebelum bonus
        bonus = 0.10 * gajiSebelumBonus;
        
        // Menghitung total gaji setelah menambahkan bonus
        totalGaji = gajiSebelumBonus + bonus;
        
        // Menghitung pajak sebesar 5% dari total gaji
        pajak = 0.05 * totalGaji;
        
        // Menghitung gaji bersih setelah dikurangi pajak
        gajiBersih = totalGaji - pajak;
        
        // Menampilkan hasil
        System.out.println("Gaji sebelum bonus: Rp " + gajiSebelumBonus);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Total gaji sebelum pajak: Rp " + totalGaji);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Gaji bersih setelah pajak: Rp " + gajiBersih);
        
        // Menutup Scanner
        input.close();
    }
}
