import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();
        System.out.print("Toplama: 1\nÇıkarma: 2\nÇarpma: 3\nBölme: 4\n:");
        int secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.print("Sonuc: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.print("Sonuc: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.print("Sonuc: " + (sayi1 * sayi2));
                break;
            case 4:
                double sonuc = sayi1 / (sayi2 + 0.0);
                System.out.print("Sonuc: " + (sonuc));
                break;
            default:
                System.out.print("Girdiğimiz işlem seçimi hatalı");
                break;
            }
    }
}