import java.util.Scanner;
public class Trapesium {
    public static void main(String[] args) {
        double ab, cd, t, miring, kel;
        Scanner sc = new Scanner(System.in);

        System.out.println("Panjang AB adalah: ");
        ab =  sc.nextDouble();
        System.out.println("Panjang CD adalah: ");
        cd =  sc.nextDouble();
        System.out.println("Tingginya adalah: ");
        t =  sc.nextDouble();

        miring = Math.sqrt((t*t)+((ab-cd)/2)*((ab-cd)/2));

        kel = ab+cd+miring*2;

        System.out.println("Keliling trapseium tersebut adalah= "+kel);
    }
}
