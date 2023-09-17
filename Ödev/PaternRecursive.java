import java.util.Scanner;

public class PaternRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // verilerin toplanması
        System.out.print("Sayı Giriniz: ");
        int girdi = input.nextInt();
        int girdiKoru = girdi;
        System.out.print("Çıktısı: " + girdi);
        paternDown(girdi, girdiKoru); // Azaltmak üzere paterne girer
        input.close();
    }

    static void paternDown(int g, int gk){
        if (g > 0){ // girdi 0ın üstünde olduğu sürece tekrar azalmış haliyle tekrar girer
            g -= 5;
            System.out.print(" " + g);
            paternDown(g,gk);
        }else{
            paternUp(g,gk); // girdi 0 veya altına indiği an yükselme methoduna geçer
        }
    }

    static void paternUp(int g, int gk){
            g += 5;
            System.out.print(" " + g);
            if(g == gk){
                System.out.print("\n..."); // g değeri ilk girdiye eşit olduğunda çıkış
            }else{
                paternUp(g, gk); // g değeri ilk girdiye eşit olana kadar methoda döner
            }
    }
}
