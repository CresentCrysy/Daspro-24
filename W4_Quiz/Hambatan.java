import java.util.Scanner;
public class Hambatan {
    public static void main(String[] args) {
       double r1,r2,r3,rt;
       Scanner sc = new Scanner(System.in);

       System.out.println("Masukan nilai R1: ");
       r1 = sc.nextDouble();
       System.out.println("Masukan nilai R2: ");
       r2 = sc.nextDouble();
       System.out.println("Masukan nilai R3: ");
       r3 = sc.nextDouble();

       rt = (double) 1/((1/r1)+(1/r2)+(1/r3));
       System.out.println("Total hambatan= "+rt);
    }
}
