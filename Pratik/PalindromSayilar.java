import java.util.Scanner;
public class PalindromSayilar {

    static void Palidrom(int sayi){
        if(sayi / 10 == 0){
            System.out.print("Rakamlar Palidromdur.");
        }else{
            int basamak = BasamakSayisi(sayi); // basamak sayısı belirlemek için fonksiyon
            int kontrol = Kontrol(sayi, basamak); // esas kontrolü yapan fonksiyon
            if (kontrol == 0){
                System.out.print(sayi + " Palidrom Değil.");
            }else if(kontrol == 1){
                System.out.print(sayi + " Palidromdur.");
            }
            
        }
    }
    static int Kontrol(int s, int b){
        for(int i = 1 ; i <= b/2 ; i++){ // basamak sayısının yarısı kadar inceleme yapılıyor
            int soldan = s / (int)Math.pow(10, b-i) % 10;//basamak sayısı - tur bölme işlemi basamakları azaltmak-
            int sagdan = s / (int)Math.pow(10, i-1) % 10;//mod ise son haneyi verir mesela 43134/(5-2) = 43 ve 43%10=3

        // System.out.print(soldan + "-" + sagdan + " / "); // sistem check
            if (soldan != sagdan){
                return 0;
            }
        }
        return 1;
    }
    static int BasamakSayisi(int sayi){
        int sayac = 0;
        while (sayi !=0){
            sayi /= 10;
            sayac++;
        }
        return sayac;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayınızı giriniz: "); // Veri Alma
        int sayi = input.nextInt();

        Palidrom(sayi); // Fonksiyon Çağırma
        input.close();
    }
}