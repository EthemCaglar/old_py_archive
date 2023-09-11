import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz: ");
        int kilo = input.nextInt();
        System.out.print("Boyunuzu metre cinsindern giriniz: ");
        double boy = input.nextDouble();

        double sonuc = kilo / (boy * boy);

        System.out.print("Vücut Kitle Endeksiniz: "+ sonuc);
    }
}
