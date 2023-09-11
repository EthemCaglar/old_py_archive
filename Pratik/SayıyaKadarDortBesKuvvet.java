import java.util.Scanner;
public class SayıyaKadarDortBesKuvvet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        int sayi = input.nextInt();

        for (int j = 0 ; j <= 15 ; j++) { // int veri tipine max 4^15 sığıyor
            if(Math.pow(4, j)>sayi){
                break;
            }else{
                System.out.print("4 ün " + j + ". kuvveti: " + Math.pow(4, j) + "\n");
            }
        }

        for (int k = 0 ; k <= 13 ; k++) { // int veri tipine max 5^13 sığıyor
            if(Math.pow(5, k)>sayi){
                break;
            }else{
                System.out.print("5 in " + k + ". kuvveti: " + Math.pow(5, k) + "\n");
            }
        }
    }
}
