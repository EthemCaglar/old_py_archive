import java.util.Scanner;
public class BurcBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ayı Sayı Olarak Giriniz: ");
        int month = input.nextInt();
        System.out.print("Doğduğunuz Günü Giriniz: ");
        int day = input.nextInt();
        String sonuc;
        switch (month) {
            case 12:
                sonuc = (day <= 21) ? "Yay Burcusunuz":"Oğlak Burcusunuz";
                System.out.print(sonuc);
                break;
            case 11:
                sonuc = (day <= 21) ? "Akrep Burcusunuz":"Yay Burcusunuz";
                System.out.print(sonuc);
                break;
            case 10:
                sonuc = (day <= 22) ? "Terazi Burcusunuz":"Akrep Burcusunuz";
                System.out.print(sonuc);
                break;
            case 9:
                sonuc = (day <= 22) ? "Başak Burcusunuz":"Terazi Burcusunuz";
                System.out.print(sonuc);;
                break;
            case 8:
                sonuc = (day <= 22) ? "Aslan Burcusunuz":"Başak Burcusunuz";
                System.out.print(sonuc);
                break;
            case 7:
                sonuc = (day <= 22) ? "Yengeç Burcusunuz":"Aslan Burcusunuz";
                System.out.print(sonuc);
                break;
            case 6:
                sonuc = (day <= 22) ? "İkizler Burcusunuz":"Yengeç Burcusunuz";
                System.out.print(sonuc);
                break;
            case 5:
                sonuc = (day <= 21) ? "Boğa Burcusunuz":"İkizler Burcusunuz";
                System.out.print(sonuc);
                break;
            case 4:
                sonuc = (day <= 20) ? "Koç Burcusunuz":"İkizler Burcusunuz";
                System.out.print(sonuc);
                break;
            case 3:
                sonuc = (day <= 20) ? "Balık Burcusunuz":"Koç Burcusunuz";
                System.out.print(sonuc);
                break;
            case 2:
                sonuc = (day <= 19) ? "Kova Burcusunuz":"Balık Burcusunuz";
                System.out.print(sonuc);
                break;
            case 1:
                sonuc = (day <= 21) ? "Oğlak Burcusunuz":"Kova Burcusunuz";
                System.out.print(sonuc);
                break;
            default:
                System.out.print("Ay 12 gün ???");
                break;
        }
    }
}

