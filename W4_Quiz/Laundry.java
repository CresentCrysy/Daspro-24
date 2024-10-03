import java.util.Scanner;
public class Laundry {
    public static void main(String[] args) {
        int harga = 2000, kilo, hargaTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Berapa kilo cucian anda? ");
        kilo = sc.nextInt();

        hargaTotal = harga*kilo;

        System.out.println("Bayar: "+hargaTotal+"Ribu");
    }    
}

//input cucian -> hitung harga -> output harga
