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
        
        while (sayi !=0){
            ekleme = sayi % 10;
            sonuc += ekleme;
            sayi /= 10;
        }
        System.out.print(sonuc);
    }
}