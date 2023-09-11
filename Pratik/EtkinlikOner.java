import java.util.Scanner;

public class EtkinlikOner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Giriniz: ");
        int hava = input.nextInt();

        if (hava <= 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (hava <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if (hava < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}

