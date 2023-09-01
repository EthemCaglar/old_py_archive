import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç KM yol gidildi: ");
        int yol = input.nextInt();

        double ücret = 10 + 2.2 * yol;

        Double cikti = (ücret <= 20) ? 20:ücret;

        System.out.print("Ödemeniz gereken ücret: "+ cikti);
    }
}
