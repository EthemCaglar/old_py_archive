import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // verilerin toplanması
        System.out.print("Hangi Sayının Harmonik Serisini İstiyorsunuz : ");
        int sayi = input.nextInt();
        double sonuc = 0;

        for (double i= 1 ; i<= sayi ; i++) {
            sonuc += 1/i;
        }
        System.out.print("Sonucunuz : " + sonuc);
        input.close();
    }
}
