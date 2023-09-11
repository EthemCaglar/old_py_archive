import java.util.Scanner;

public class ucgenalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk kenar Giriniz: ");
        int kenar1 = input.nextInt();
        System.out.print("İkinci kenar Giriniz: ");
        int kenar2 = input.nextInt();
        System.out.print("Üçüncü kenar Giriniz: ");
        int kenar3 = input.nextInt();

        double u = (kenar1 + kenar2 + kenar3) / 2.0;

        System.out.print("Katsayı: " + u);

        double alan = Math.sqrt(u * (u-kenar1) * (u-kenar2) * (u-kenar3));

        System.out.print("Üçgeninizin alanı: " + alan);
    }
}
