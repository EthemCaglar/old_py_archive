import java.util.Scanner;
public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayınızı Giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci Sayınızı Giriniz: ");
        int sayi2 = input.nextInt();
        int ebob = 0;
        int ekok = 0;
        int i = sayi1;

        while(i != 0){
            if(sayi1 % i == 0){
                if(sayi2 % i == 0){
                    ebob = i;
                    break;
                }
            }
            i--;
        }
        System.out.print("EBOB : " + ebob);
        ekok = (sayi1 * sayi2) / ebob;
        System.out.print("EKOK : " + ekok);

        input.close();
        }
}
