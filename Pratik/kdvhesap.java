import java.util.Scanner;

public class kdvhesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ürünün Ücretini Giriniz: ");
        int ücret = input.nextInt();
        double kdv = (ücret <= 1000) ? 0.18:0.08;
        double sonuc = ücret * kdv + ücret;
        System.out.print("Kdv miktarınız: " + kdv*100 + " Ücretiniz: " + sonuc);

    }
}
