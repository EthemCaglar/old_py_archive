import java.util.Scanner;

public class DaireDilimAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenizin Yarıçapı: ");
        int cap = input.nextInt();
        System.out.print("Daire Diliminizin Açısı: ");
        int aci = input.nextInt();

        double sonuc = (3.14 * ( cap * cap ) * aci) / 360.0;

        System.out.print("Daire Diliminizin Alanı: "+ sonuc);
    }
}
