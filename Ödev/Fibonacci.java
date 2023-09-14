import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // tanımlamalar
        System.out.println("Kaç Elemanlı İstersiniz: ");
        int eleman = input.nextInt();
        int ilk = 0;
        int ikinci = 1;

        System.out.print(ilk + " " + ikinci + " ");
        for(int i=1 ; i <= eleman-2 ; i++){
            ikinci = ilk + ikinci; // standart fibonacci islemi
            ilk = ikinci - ilk;; // eski ikinci değerini ilk değere atamak için
            System.out.print(ikinci + " ");
        }
    }
}
