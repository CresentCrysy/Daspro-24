import java.util.Scanner;
public class Rangkaian {
    public static void main(String[] args) {
        double r1,r2,r3,r4,i,rt,v;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan R1: ");
        r1 = sc.nextDouble();
        System.out.println("Masukan R2: ");
        r2 = sc.nextDouble();
        System.out.println("Masukan R3: ");
        r3 = sc.nextDouble();
        System.out.println("Masukan R4: ");
        r4 = sc.nextDouble();
        System.out.println("Masukan I: ");
        i = sc.nextDouble();

        rt = (double) 1/((1/r1)+(1/r2)+(1/r3));
        v = i*(rt+r4);
        System.out.println("Nilai V= "+v);
    }
}