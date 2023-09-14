import java.util.Scanner;
public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayınızı Giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci Sayınızı Giriniz: ");
        int sayi2 = input.nextInt();
        System.out.print("EBOB ise 1 EKOK ise 2: ");
        int secim = input.nextInt();
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

        if(secim == 1){
            System.out.print("EBOB : " + ebob);
        }else if(secim == 2){
            ekok = (sayi1 * sayi2) / ebob;
            System.out.print("EKOK : " + ekok);
        }


        
        input.close();
        }
}

