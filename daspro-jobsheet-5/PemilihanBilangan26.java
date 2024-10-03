import java.util.Scanner;
public class PemilihanBilangan26 {
    public static void main(String[] args) {
        int angka;
        String result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan angka: ");
        angka = sc.nextInt();

        // if(angka % 2 == 0) {
        //     System.out.println("Angka genap");
        // }
        // else {
        //     System.out.println("Angka ganjil");
        // }

        result = (angka % 2 == 0) ? "Angka genap" : "Angka ganjil";

        System.out.println(result);
    }
}
