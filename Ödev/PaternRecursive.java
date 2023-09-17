import java.util.Scanner;

public class PaternRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // verilerin toplanması
        System.out.print("Sayı Giriniz: ");
        int girdi = input.nextInt();
        int girdiKoru = girdi;
        System.out.print("Çıktısı: " + girdi);
        paternUp(girdi, girdiKoru);
        input.close();
    }

    static void paternUp(int g, int gk){
        if (g > 0){
            g -= 5;
            System.out.print(" " + g);
            paternUp(g,gk);
        }else{
            paternDown(g,gk);
        }
    }

    static void paternDown(int g, int gk){
            g += 5;
            System.out.print(" " + g);
            if(g == gk){
                System.out.print("\n...");
            }else{
                paternDown(g, gk);
            }
    }
}