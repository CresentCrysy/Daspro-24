import java.util.Scanner;
public class Spbu {
    public static void main(String[] args) {
        int bensin = 9000, bayar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Beli berapa: ");
        bayar = sc.nextInt();

        double liter = (double) bayar/bensin;

        System.out.println("Anda mendapat bensin sebanyak: "+liter+" liter");
    }
}
