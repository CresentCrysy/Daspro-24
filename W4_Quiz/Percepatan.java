import java.util.Scanner;
public class Percepatan {
    public static void main(String[] args) {
        int kecAwal, kecAkhir, waktu;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan kecepatan awal: ");
        kecAwal = sc.nextInt();
        System.out.println("Masukan kecepatan akhir: ");
        kecAkhir = sc.nextInt();
        System.out.println("Masukan waktu: ");
        waktu = sc.nextInt();

        double percepatan = (double) (kecAkhir-kecAwal)/waktu;
        System.out.println("Percepatan = "+percepatan);
    }
}
