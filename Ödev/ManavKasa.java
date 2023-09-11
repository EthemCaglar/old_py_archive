import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutf = 2.14;
        double elmaf = 3.67;
        double domatf = 1.11;
        double muzf = 0.95;
        double patf = 5.0; 

        System.out.print("Kaç kilo armut alındı: ");
        int armut = input.nextInt();
                System.out.print("Kaç kilo elma alındı: ");
        int elma = input.nextInt();
                System.out.print("Kaç kilo domates alındı: ");
        int domat = input.nextInt();
                System.out.print("Kaç kilo muz alındı: ");
        int muz = input.nextInt();
                System.out.print("Kaç kilo patlıcan alındı: ");
        int pat = input.nextInt();


        double sonuc = armut * armutf + elma * elmaf + domat * domatf + muz * muzf + pat * patf;

        System.out.print("Ödenecek Ücret: "+ sonuc);
    }
}
