import java.util.Scanner;
public class Tandon {
    public static void main(String[] args) {
        double r, kecepatan, t, v, waktu;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jari-jari: ");
        r = sc.nextDouble();
        System.out.println("Masukkan tinggi: ");
        t = sc.nextDouble();
        System.out.println("Masukkan Debit air dalam bentuk jam: ");
        kecepatan = sc.nextDouble();

        v = Math.PI*r*r*t;
        waktu = v/kecepatan;
        System.out.println("Waktu yang dibutuhkan: "+waktu);
    }
}
