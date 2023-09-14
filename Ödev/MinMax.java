import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 2147483647;
        int max = 0;

        System.out.print("Kaç Sayı Gireceksiniz: ");  // Veri Alma ve Tanımlamalar
        int giris = input.nextInt();

        for(int i = 1; i <= giris; i++){
            System.out.print(i + ". Sayıyı Girin: ");
            int sayi = input.nextInt();
            if (sayi < min){
                min = sayi;
            }else if(max < sayi){
                max = sayi;
            }
        }
        System.out.print("En Büyük Sayı: " + max + " En Küçük Sayı: " + min);
        input.close();
        }
}