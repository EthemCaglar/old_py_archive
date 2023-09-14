import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // verilerin toplanması
        System.out.print("Kaç Yıldızlı Olsun: ");
        int basamak = input.nextInt();

        int tur = 0;
        int yıldız= basamak*2-1;

        while(tur != basamak){ // merkezi de dahil etmek için 1 ekliyoruz
            for (int i = tur ; 1 <= i ; i--) {
                System.out.print(" ");
            }
            for (int i= yıldız-tur*2 ; 1 <= i ; i--) {
                System.out.print("*");
            }
            tur += 1;
            System.out.print("\n");
        }
        input.close();
    }
}
