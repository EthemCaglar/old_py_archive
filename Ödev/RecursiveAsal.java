import java.util.Scanner;

public class RecursiveAsal {
    public static void main(String[] args) {
        asallık();
    }

    static int asallık(){
        Scanner input = new Scanner(System.in); // verilerin toplanması
        System.out.print("Sayı Giriniz: ");
        int sayi = input.nextInt();
        int asalMı = 1;
        for(int i = 2 ; i < sayi ; i++){
            if (sayi % i == 0){
                System.out.print(sayi + " Sayısı Asal Değildir.\n");
                asalMı = 0;
                break;
            }
        }
        if (asalMı == 1){
            System.out.print(sayi + " Sayısı Asaldır.\n");
        }
        return asallık();
    }
}
/* 
n = int(input("Sayıyı giriniz: "))
a = range(2, n)
b = 1
for c in a:
    if (n % c == 0):
        print("Sayı asal değil.")
        b = 0
        break
if(b == 1):
    print("Asaldır.")
*/