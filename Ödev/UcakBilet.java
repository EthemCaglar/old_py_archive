import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç KM Yol Gidilecek: ");
        int yol = input.nextInt();

        System.out.print("Yaşınız Kaç: ");
        int yas = input.nextInt();

        System.out.print("Gidişse 1 Gidiş-Dönüşse 0 Giriniz: ");
        int secim = input.nextInt();

        if (secim < 0 || 1 < secim){
            System.out.print("1 veya 0 seçmeliydiniz");
        }else{
            double indirim = 1;
            indirim = (yas < 12) ? 0.5 : indirim;
            indirim = ((12 <= yas) && (yas < 24)) ? 0.9 : indirim;
            indirim = (65 <= yas) ? 0.7 : indirim;
            double indirimTur = (secim == 0) ? 1.6 : 1;
            
            double odeme = yol * 0.1 * indirim * indirimTur;
            System.out.print("Ödenecek Ücret: " + odeme);
        }
        input.close();
    }
}
