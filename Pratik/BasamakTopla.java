import java.util.Scanner;
public class BasamakTopla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // verilerin toplanması
        System.out.print("Verdiğiniz Sayının Basamanları Toplamı\n");
        System.out.print("Sayınızı Giriniz: ");
        int sayi = input.nextInt();
        int sonuc = 0;
        int sayiYedek = sayi;
        int ekleme = 0;
        
        while (sayi !=0){ // int olduğu için sayı bölüne bölüne 0'a eşit olacak bu olana kadar dönecek
            ekleme = sayi % 10; // bu bize en son basamağı verir
            sonuc += ekleme; // son basamakları ekleyerek sonuca gidiliyor
            sayi /= 10; // 10a bölerek birler basamağını eliyor, böylece birer hane azalıyor
        }
        System.out.print("Basamaklar Toplamı: " + sonuc); // sonuc
    }
}
