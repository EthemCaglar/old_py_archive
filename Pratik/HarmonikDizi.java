public class HarmonikDizi {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 10, 15, 5}; // dizi oluşturma
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) { // dizideki tüm elemanları çevirme
            sum += ((double) 1 / numbers[i]); // bir bölü belirli eleman sayısı sum'a ekleniyor
            // System.out.println(" " + sum + " " + numbers[i] + " " + (double) 1 / numbers[i]); //test
        }
        double result = numbers.length / sum; // eleman sayısı / elemanların bire bölümünün toplamı
    
        System.out.println("\nHarmonik Ortalama: " + result); // s
    }
}
