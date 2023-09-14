import java.util.Scanner;
public class TipDönüşümleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tam Sayı Giriniz: "); // Veri ALınması
        int tam = input.nextInt();
        System.out.print("Ondalık Sayı Giriniz: ");
        double ondalik = input.nextDouble();

        double tamdanOndalik = (double) tam; // Tip Dönüsümleri
        int ondalikdanTam = (int) ondalik;

        System.out.print("Girdiğiniz Tam Sayı: " + tam + " ve Ondalık Hali: " + tamdanOndalik); // Ekrana Yazdırma
        System.out.print("\nGirdiğiniz Ondalık Sayı: " +ondalik + " ve Tam Sayı Hali: " + ondalikdanTam);
        input.close();
        }
}

