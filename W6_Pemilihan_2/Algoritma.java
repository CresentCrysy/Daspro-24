package W6_Pemilihan_2;

public class Algoritma {
    public static void main(String[] args) {
        int bil1 = 28, bil2 = 54, bil3 = 15, bilTerbesar;

        if (bil1>bil2) {
            bilTerbesar = bil1;
        }
        else if (bil2>bil3){
            bilTerbesar = bil2;
        }
        else {
            bilTerbesar = bil3; 
        }

        System.out.println("Bilangan terbesar: "+bilTerbesar);
    }
}
