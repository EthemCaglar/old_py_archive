import java.util.Scanner;

public class notortala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        int mat = input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        int fiz = input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        int kim = input.nextInt();
        System.out.print("Tarih Notunuzu Giriniz: ");
        int tar = input.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        int tur = input.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        int muz = input.nextInt();

        float ort = (mat + fiz + kim + tar + tur + muz) / 6;

        String sonuc = (ort <= 60) ? " Sınıfta Kaldınız":" Sınıfı Geçtiniz";

        System.out.print("Ortalamanız:" + ort + sonuc );
    }
}
