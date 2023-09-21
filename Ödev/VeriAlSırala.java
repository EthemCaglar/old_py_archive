import java.util.Arrays;
import java.util.Scanner;

public class VeriAlSırala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Sayı Gireceksiniz: "); // Girilecek Sayı ALınması
        int uzunluk = input.nextInt();

        int[] list = new int [uzunluk]; // Sayı Dizinin Uzunluğu Secildi

        for(int i = 0; i < uzunluk; i++){
            System.out.print("\n" + (i+1) + ". sayı :"); // Veri Alınması
            list[i] = input.nextInt();
        }

        for (int u : list) { // ilk yazdırma
            System.out.print(u + " ");
        }

        Arrays.sort(list); // sırala
        System.out.println(""); // iki yazdırma arası satır atla

        for (int u : list) { // sıralı listeyi yazdır
            System.out.print(u + " ");
        }
        input.close();
    }
}
