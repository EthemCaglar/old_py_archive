import java.util.Arrays;

public class TekrarSay {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20}; // liste atama
        int[] copyList = Arrays.copyOf(list, 8); // listeyi korumak için kopya
        Arrays.sort(copyList); // sayıları sırala
        int index = 0;
        int repeat = 0;

        // neden while:
        // while fora nazaran index üzerinde direkt hakimiyet veriyor, bu örnekte sıraladıktan sonra
        // tekrar sayısı kadar indexi atlıyoruz bu sayede tekrar eden sayıları tekrar tekrar kontrol etmiyoruz.
        while(index <= 7) { // dış döngü
            for(int n : copyList){ // iç döngü
                if(copyList[index] == n){ // eşitlik karşılaştırma
                    repeat++; // kaç kez tekrar etti
                }
            }
            System.out.println(copyList[index] + " sayısı " + repeat + " kere tekrar edildi.");
            index += repeat; // tekrar kadar ileri atlama
            repeat = 0;
        }
    }
}
