import java.util.Scanner;
public class TekGeleneKadar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int sayi = 0;
        while(sayi % 2 == 0){ // Sonsuz döngü ile sürekli sayı isteme
            System.out.print("Sayınızı giriniz: ");
            sayi = input.nextInt(); 
            if(sayi % 4 == 0){
                toplam += sayi;
            }
        }
        System.out.print("Toplamınız: " + toplam);
        input.close();
    }
}
