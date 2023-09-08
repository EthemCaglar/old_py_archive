import java.util.Scanner;
public class UcSayiSırala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayınızı Giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci Sayınızı Giriniz: ");
        int b = input.nextInt();
        System.out.print("Üçüncü Sayınızı Giriniz: ");
        int c = input.nextInt();

        int sonuc = 0;
        sonuc = (a < b) ? sonuc+=4:sonuc;
        sonuc = (b < c) ? sonuc+=2:sonuc;
        sonuc = (a < c) ? sonuc+=1:sonuc;

        switch (sonuc) {
            case 7:
                System.out.print("a<b<c");
                break;
            case 6:
                System.out.print("imkansız");
                break;
            case 5:
                System.out.print("a<c<b");
                break;
            case 4:
                System.out.print("c<a<b");
                break;
            case 3:
                System.out.print("b<a<c");
                break;
            case 2:
                System.out.print("b<c<a");
                break;
            case 1:
                System.out.print("imkansız");
                break;
            case 0:
                System.out.print("c<b<a");
                break;
            default:
                System.out.print("Bir hatayla karşılaşıldı");
                break;
        }
    }
}
