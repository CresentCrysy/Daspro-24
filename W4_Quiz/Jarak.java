import java.util.Scanner;
public class Jarak {
    public static void main(String[] args) {
        int kecepatan = 2, jarak; 
        double waktu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jarak dalam bentuk KM: ");
        jarak = sc.nextInt();

        waktu = (double) jarak/kecepatan;
        System.out.println("Waktu yang diperlukan adalah: "+waktu+" jam");
    }
}
