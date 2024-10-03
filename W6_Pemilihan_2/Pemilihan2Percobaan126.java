package W6_Pemilihan_2;
import java.util.Scanner;
public class Pemilihan2Percobaan126 {
    public static void main(String[] args) {
        int tahun;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan tahun: ");
        tahun = sc.nextInt();

        if (tahun%4 == 0){
            if (tahun%100 != 0 || tahun%400 == 0){
                System.out.println(tahun+" Tahun kabisat");
            }
            else{
                System.out.println(tahun+" Bukan tahun kabisat");
            }
        }
        else {
            System.out.println(tahun+" Bukan tahun kabisat");
        }
    }
}
