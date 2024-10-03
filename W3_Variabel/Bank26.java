import java.util.Scanner;
public class Bank26 {
    public static void main(String[] args) {
        
        //Declare Variabel
        int tabunganAwal, lamaMenabung;
        double tabunganAkhir,bunga,prosentase_bunga = 0.02; 
        Scanner a = new Scanner(System.in);

        //Mengscan data dan menyimpan data di dalam variabel
        System.out.println("Berapa tabungan awal anda: ");
        tabunganAwal = a.nextInt();
        System.out.println("Berapa lama anda menabung: ");
        lamaMenabung = a.nextInt();

        //menghitung bunga dan tabungan akhir
        bunga = lamaMenabung * prosentase_bunga * tabunganAwal;
        tabunganAkhir = bunga + tabunganAwal;

        //menampilkan hasil
        System.out.println("Bunga anda adalah: "+bunga);
        System.out.println("Jumlah tabungan akhir anda adalah: "+tabunganAkhir);
    }    
}
