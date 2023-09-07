import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayac = 6;
        System.out.print("Matematik Notunuzu Giriniz: ");
        int mat = input.nextInt();
        if(100<mat || mat<0){
            System.out.print("Matematik Notunuzu Kabul Edilmemiştir\n");
            mat = 0;
            sayac--;}
        System.out.print("Fizik Notunuzu Giriniz: ");
        int fiz = input.nextInt();
        if(100<fiz || fiz<0){
            System.out.print("Fizik Notunuzu Kabul Edilmemiştir\n");
            fiz = 0;
            sayac--;}
        System.out.print("Kimya Notunuzu Giriniz: ");
        int kim = input.nextInt();
        if(100<kim || kim<0){
            System.out.print("Kimya Notunuzu Kabul Edilmemiştir\n");
            kim = 0;
            sayac--;}
        System.out.print("Tarih Notunuzu Giriniz: ");
        int tar = input.nextInt();
        if(100<tar || tar<0){
            System.out.print("Tarih Notunuzu Kabul Edilmemiştir\n");
            tar = 0;
            sayac--;}
        System.out.print("Türkçe Notunuzu Giriniz: ");
        int tur = input.nextInt();
        if(100<tur || tur<0){
            System.out.print("Türkçe Notunuzu Kabul Edilmemiştir\n");
            tur = 0;
            sayac--;}
        System.out.print("Müzik Notunuzu Giriniz: ");
        int muz = input.nextInt();
        if(100<muz || muz<0){
            System.out.print("Müzik Notunuzu Kabul Edilmemiştir\n");
            muz = 0;
            sayac--;}

        double ort = (mat + fiz + kim + tar + tur + muz) / (sayac + 0.0);

        String sonuc = (ort < 55) ? "Maalesef Sınıfta Kaldınız":"Tebrikler Sınıfı Geçtiniz";

        System.out.print("Ortalamanız:" + ort + "\n" + sonuc );
    }
}
