import java.util.Scanner;
public class Elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // verilerin toplanması
        System.out.print("Elmasınızın Merkezi Kaç Yıldızlı Olsun: ");
        int merkez = input.nextInt();

        if (merkez % 2 != 1){ // Çift olursa elmasa benzemez
            merkez += 1;
        }

        int bosluk = (merkez - 1)/2; // ilk bırakılacak ve en büyük bosluk miktar
        int tur = 0;

        // ÜST KISIM

        while(((tur*2)-1) != merkez){ // merkeze kadar artan yıldız ve bosluklar
            for (int i= 1 ; i<= (bosluk-tur) ; i++) {
                System.out.print(" ");
            }
            for (int i= 1 ; i<= (tur*2)+1 ; i++) {
                System.out.print("*");
            }
            tur += 1;
            System.out.print("\n");
        }
        tur -= 1; // merkezi de çizdiği için alta göre 1 tur fazla dönmüs eksilttik

        // ALT KISIM

        while(tur != 0){ // merkez hariç üstteki whileın tersini yapıyor
            for (int i= (bosluk-(tur-1)) ; 1 <= i ; i--) {
                System.out.print(" ");
            }
            for (int i= (tur*2)-1 ; 1 <= i ; i--) {
                System.out.print("*");
            }
            tur -= 1;
            System.out.print("\n");
        }
        input.close();
    }
}
