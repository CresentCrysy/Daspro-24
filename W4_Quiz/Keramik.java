import java.util.Scanner;
public class Keramik {
    public static void main(String[] args) {
        double psk, psl, ll, lk, keramik;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan panjang sisi lantai: ");
        psl = sc.nextDouble();
        System.out.println("Masukan panjang sisi keramik: ");
        psk = sc.nextDouble();
        
        lk = psk*psk;
        ll = psl*psl;
        keramik = ll/lk;

        System.out.println("Banyak keramik yang harus dibeli: "+keramik);
    }
}
