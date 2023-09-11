import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        int sene = input.nextInt();
        int kalan = sene % 4;

        switch (kalan) {
            case 0:
                System.out.print(sene + " bir artık yıldır !");
                break;
            case 1:
                System.out.print(sene + " bir artık yıldır değildir !");
                break;
            case 2:
                System.out.print(sene + " bir artık yıldır değildir !");
                break;
            case 3:
                System.out.print(sene + " bir artık yıldır değildir !");
                break;
        }
    input.close();
    }
}

