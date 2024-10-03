import java.util.Scanner;
public class Segitiga26 {
    public static void main(String[] args) {

        //Deklarasi variabel dan scanner
        int alas,tinggi;
        double luas;
        Scanner a = new Scanner(System.in);
        
        //mengambil data dari input
        System.out.println("Masukan alas: ");
        alas = a.nextInt();
        System.out.println("Masukan tinggi:");
        tinggi = a.nextInt();

        //perhitungan dan output nilai
        luas = alas*tinggi/2;
        System.out.println("Luas segitiga ="+luas);
    }
}