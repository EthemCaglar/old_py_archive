import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // verilerin toplanması
        System.out.print("Verdiğiniz Sayının Verdiğiniz Değerdeki Üssü\n");
        System.out.print("Taban Sayıyı Giriniz: ");
        int taban = input.nextInt();
        System.out.print("Kuvveti Giriniz: ");
        int ust = input.nextInt();
        int sonuc = 1;

        for(int i=ust; 0 < i ;i--){
            sonuc *= taban;
        }
        System.out.print(taban + " üstü " + ust + ": " + sonuc);
    }
}
