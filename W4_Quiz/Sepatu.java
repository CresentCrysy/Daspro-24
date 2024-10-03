import java.util.Scanner;
public class Sepatu {
    public static void main(String[] args) {
        int terjual, hari;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Banyak terjual: ");
        terjual = sc.nextInt();
        System.out.println("Banyak hari: ");
        hari = sc.nextInt();

        float rata2 = (float) terjual/hari;

        System.out.println("Rata-rata penjualan: "+rata2);
    }
}
