import java.util.Scanner;
public class UcleDortdeBolunen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayınızı giriniz: ");
        int sayi = input.nextInt();
        int sayac = 0;
        int toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            if (i%3==0){ // 3'e bölünür mü kontrolü
                sayac++;
                toplam += i;
            }else if (i%4==0){ // 4e bölünür mü kontrolü
                sayac++;
                toplam += i;
            }// else if sebebi ikisine birden bölünüyorsa tek saysın
        }
        // Sonuç Hesaplamaları
        double sonuc = toplam / sayac;
        System.out.print(sayac +"adet sayı bulunmuştur ve bunları toplamı" + toplam + "ortalama ise:" + sonuc);
        input.close();
    } 
}