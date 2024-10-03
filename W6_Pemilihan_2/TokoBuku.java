package W6_Pemilihan_2;
import java.util.Scanner;
public class TokoBuku {
    public static void main(String[] args) {
        String buku="";
        int jumlah=0; //hargaKamus = 50000, hargaNovel = 100000, hargaBukuLain = 150000,
        //banyakKamus, banyaNovel, banyakBukulain;
        double diskon; //diskonKamus = 0.10, diskonNovel = 0.07, diskonLainnya = 0,
        //totalKamus = 0, totalNovel = 0, totalBukuLain = 0, totalBayar,
        //totalDiskonKamus, totalDiskonNovel, totalDiskonLainnya; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Banyak kamus: ");
        //banyakKamus = sc.nextInt();
        System.out.println("Banyak novel: ");
        //banyaNovel = sc.nextInt();
        System.out.println("Banyak buku lain: ");
        //banyakBukulain = sc.nextInt();

        //totalKamus = banyakKamus*hargaKamus;
        //totalNovel = banyaNovel*hargaNovel;
        //totalBukuLain = banyakBukulain*hargaBukuLain;

        if (buku.equalsIgnoreCase("kamus")) {
            if (jumlah >=2){
                diskon = 0.12;
            }
            else {
                diskon = 0.1;
            }
            //diskonKamus = diskonKamus+0.02;
        }

        else if (buku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jumlah>3) {
                diskon = diskon+0.02;
            }
            else{
                diskon = diskon+0.01;
            }
        }

        // if (banyaNovel>3) {
        //     diskonNovel = diskonNovel+0.02;
        // }
        // if (banyaNovel<=3) {
        //     diskonNovel = diskonNovel+0.01;
        // }

        else {
            if (jumlah>3){
                diskon = 0.05;
            };
        }

        // System.out.println(diskonKamus);
        // System.out.println(diskonLainnya);
        // System.out.println(diskonNovel);
        // totalDiskonKamus = totalKamus - (totalKamus*diskonKamus);
        // totalDiskonLainnya = totalBukuLain - (totalBukuLain*diskonLainnya);
        // totalDiskonNovel = totalNovel - (totalNovel*diskonNovel);
        // System.out.println(totalDiskonKamus);
        // System.out.println(totalDiskonLainnya);
        // System.out.println(totalDiskonNovel);

        // totalBayar = totalDiskonKamus+totalDiskonNovel+totalDiskonLainnya;
        // System.out.println("Total bayar: "+totalBayar);
    }
}
