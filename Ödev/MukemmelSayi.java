import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayınızı Giriniz: ");  // Veri Alma ve Tanımlamalar
        int girdi = input.nextInt();
        int sonuc = 0;

        for(int i = 1; i < girdi; i++){
            if(girdi % i == 0){
                sonuc += i;
            }
        }
        if(sonuc == girdi){
            System.out.print(girdi + " mükemmel bir sayı");
        }else{
            System.out.print(girdi + " mükemmel bir sayı değildir.");
        }

        input.close();
        }
}