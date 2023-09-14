import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // verilerin toplanması
        System.out.print("Kaç Yıldızlı Olsun: ");
        int merkez = input.nextInt();

        if (merkez % 2 != 1){ // Çift olursa saçma görünüyor
            merkez += 1;
        }

        int makstur = (merkez - 1)/2; // ilk bırakılacak ve en büyük bosluk miktar
        int tur = 0;

        while(tur != makstur+1){ // merkezi de dahil etmek için 1 ekliyoruz
            for (int i = tur ; 1 <= i ; i--) {
                System.out.print(" ");
            }
            for (int i= merkez-tur*2 ; 1 <= i ; i--) {
                System.out.print("*");
            }
            tur += 1;
            System.out.print("\n");
        }
        input.close();
    }
}
