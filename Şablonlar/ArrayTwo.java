import java.util.Scanner;

public class ArrayTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tarlanızın Satır Sayısı: ");
        int satir = input.nextInt();

        System.out.print("Tarlanızın Sütun Sayısı: ");
        int sutun = input.nextInt();

        int[][] matris = new int [satir][sutun];

        int maks = (matris.length) * (matris[0].length);

        for(int i = matris.length-1 ; 0 <= i ; i--){
            for(int j = matris[0].length-1 ; 0 <= j ; j--){
                matris[i][j] = maks;
                maks--;
            }
        }

        for(int i=0 ; i < matris.length ; i++){ // satırdaki elemansayısı
            for(int j=0 ; j < matris[0].length ; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("Girdiğiniz sanın matrisin neresinde olduğunu söyler\n");
        int konum = 0;
        maks = (matris.length) * (matris[0].length);

        while(true){
            System.out.print("İstediğiniz konum: ");
            konum = input.nextInt();
            if(konum < maks && 0 <= konum){
                int sayi = konum/matris[0].length;
                int kalan = (konum % matris[0].length);
                if(kalan == 0){
                    kalan = matris[0].length;
                    sayi--;
                }
                kalan--;
                System.out.print(sayi + " " + (kalan) + "\n");
            }else{
                break;
            }
        }
        input.close();
    }
}

/*
 class Printer{
    public <T> void printArray(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }
}
public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
 */