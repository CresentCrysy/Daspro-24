import java.util.Scanner;
public class Siakad26 {
    public static void main(String[] args) {
        //Deklrasi variabel
        String nama,nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir, nilaiUTS, nilaiUAS;
        Scanner a = new Scanner(System.in);

        //Input data
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

        //Hitung nilai
        nilaiAkhir = ((nilaiKuis*0.2)+(nilaiTugas*0.15)+(nilaiUTS*0.30)+(nilaiUAS*0.35));

        //Menampilkan data
        System.out.println(String.format("Mahasiswa dengan nama %s (NIM %s)",nama, nim));
        System.out.println(String.format("Kelas %s, Absen: %d", kelas, absen));
        System.out.println(String.format("Nilai akhir: "+nilaiAkhir));
    }
}