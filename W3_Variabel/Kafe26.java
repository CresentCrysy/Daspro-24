import java.util.Scanner;

public class Kafe26 {
    public static void main(String[] args) {

        //Deklarasi variabel
        boolean member;
        Byte nominalByte;
        int kopi, teh, roti, nominalInt;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga, nominalBayar;
        float diskon = 10/100f;
        Scanner a = new Scanner(System.in);

        //Input data
        System.out.println("Masukan keanggotaan (true or false): ");
        member = a.nextBoolean();
        System.out.println("Masukan jumlah kopi: ");
        kopi = a.nextInt();
        System.out.println("Masukan jumlah teh: ");
        teh = a.nextInt();
        System.out.println("Masukan jumlah roti: ");
        roti = a.nextInt();

        //Hitung harga
        totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        nominalBayar = totalHarga - (diskon*totalHarga);
        nominalInt = (int)nominalBayar;
        nominalByte = (byte)nominalBayar;

        //Menmapilkan nominal yang harus dibayar
        System.out.println("Keanggotaan pelanggan "+member);
        System.out.println(String.format("Item pembeliaan: kopi %d teh %d roti %d", kopi, teh, roti));
        System.out.println("Nominal bayar Rp"+ nominalBayar);
        System.out.println("Nominal int "+nominalInt);
        System.out.println("Nominal byte "+nominalByte);
    }
}
