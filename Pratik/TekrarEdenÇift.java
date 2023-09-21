import java.util.Arrays;

public class TekrarEdenÇift {
    public static void main(String[] args) {
        int[] list = {3, 12, 5, 8, 3, 15, 8, 20, 16, 9}; // liste atama
        int[] copyList = Arrays.copyOf(list, 10); // listeyi korumak için kopya
        Arrays.sort(copyList); // sayıları sırala
        int sayac = 0; // for döndükçe index sayısı takibi için


        for (int u : copyList) { // dizideki elemanları sırayla verir
            if(u % 2 == 0){ // çift mi değil mi
                if(u == copyList[sayac-1]){ // kendisinden bir önceki elemana eşit mi (+1 yapınca son eleman index hatası veriyor)
                    System.out.print("\nTekrar eden çift sayı :" + u);
                }
            }
            sayac++;
        }
    }
}
