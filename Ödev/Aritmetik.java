import java.util.Scanner;
public class Aritmetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayınızı Giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci Sayınızı Giriniz: ");
        int b = input.nextInt();
        System.out.print("Üçüncü Sayınızı Giriniz: ");
        int c = input.nextInt();

        int sonuc = a + (b*c) - b;

        System.out.print("Sonucunuz: " + sonuc);
        input.close();
        }
}

