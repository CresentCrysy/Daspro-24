import java.util.Scanner;
public class Siakad26 {
    public static void main(String[] args) {
        String nama,nim, kelas, nilaiAkhirHuruf, kualifikasi;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir, nilaiUTS, nilaiUAS;
        Scanner a = new Scanner(System.in);

        System.out.println("Masukan Nama: ");
        nama = a.nextLine();
        System.out.println("Masukan NIM anda: ");        
        nim = a.nextLine();
        System.out.println("Masukan kelas: ");
        kelas = a.nextLine();
        System.out.println("Masukan nomor absen: ");
        absen = a.nextByte();
        System.out.println("Masukan nilai kuis: ");
        nilaiKuis = a.nextDouble();
        System.out.println("Masukan nilai tugas: ");
        nilaiTugas = a.nextDouble();
        System.out.println("Masukan nilai UTS: ");
        nilaiUTS = a.nextDouble();
        System.out.println("Masukan nilai UAS: ");
        nilaiUAS= a.nextDouble();

        nilaiAkhir = ((nilaiKuis*0.2)+(nilaiTugas*0.15)+(nilaiUTS*0.30)+(nilaiUAS*0.35));

        if (nilaiAkhir>=80){
            nilaiAkhirHuruf = "A"; kualifikasi = "Sangat Baik";
        }
        else if(nilaiAkhir>=73){
            nilaiAkhirHuruf = "B+"; kualifikasi = "Lebih dari baik";
        }
        else if (nilaiAkhir>=65){
            nilaiAkhirHuruf = "B"; kualifikasi = "Baik";
        }
        else if (nilaiAkhir>=60){
            nilaiAkhirHuruf = "C+"; kualifikasi = "Lebih dari cukup";
        }
        else if (nilaiAkhir>=50){
            nilaiAkhirHuruf = "C"; kualifikasi = "Cukup";
        }
        else if (nilaiAkhir>=39){
            nilaiAkhirHuruf = "D"; kualifikasi = "Kurang";
        }
        else {
            nilaiAkhirHuruf = "E"; kualifikasi = "Gagal";
        }

        System.out.println(String.format("Mahasiswa dengan nama %s\n(NIM %s)\n",nama, nim));
        System.out.println(String.format("Kelas: %s\nAbsen: %d\n", kelas, absen));
        System.out.println(String.format("Nilai akhir: "+nilaiAkhir+"\n"));
        System.out.println("Nilai akhir huruf: "+nilaiAkhirHuruf);
        System.out.println("Kualifikasi: "+kualifikasi);
    }
}
