import java.util.Scanner;
public class Lingkaran26 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int r;
        double keliling,luas;

        System.out.println("Masukan jari-jari");
        r = a.nextInt();

        keliling = 2*3.14*r;
        luas = 3.14*r*r;

        System.out.println(keliling);
        System.out.println(luas);
    }
}
