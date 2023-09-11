import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // verilerin toplanması
        System.out.print("Kombinasyon İçin önce toplam seçilecek eleman sayınızı girmeniz gerek\n");
        System.out.print("Eleman Sayısı: ");
        int tumEleman = input.nextInt();
        System.out.print("İçinden Kaç Eleman Seçilecek: ");
        int secilecek = input.nextInt();

        if(tumEleman>secilecek){    // secilecek eleman sayısı fazla girildiğinde hata
            long tumElemanFakt = 1;  // 13 faktöriyelden itibaren int'e sığmıyor
            long secilecekFakt = 1;
            long tumeksisecilFakt = 1;

            for (int i = 1 ; i <= tumEleman ; i++){ // faktöriyel işlemleri
                tumElemanFakt *= i;
            }
            for (int j = 1 ; j <= secilecek ; j++){
                secilecekFakt *= j;
            }
            for (int k = 1 ; k <= (tumEleman - secilecek) ; k++){
                tumeksisecilFakt *= k;
            }
            double sonuc = tumElemanFakt / (secilecekFakt * tumeksisecilFakt) ; // C(n,r) = n! / (r! * (n-r)!)
            System.out.print("Kombinasyon Sonucunuz: " + sonuc);
        }else{
            System.out.print("Seçeceğiniz eleman sayısı tüm elemanlardan fazla olamaz");
        }
        input.close();
    }
}
