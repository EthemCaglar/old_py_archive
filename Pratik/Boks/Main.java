package Boks;
// istediğimiz işlerleri yapmak için fighter ve ringe dokunmadık.
public class Main {
    public static void main(String[] args) {
        Fighter contestant1 = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter contestant2 = new Fighter("Alex" , 10 , 95, 100, 0);
        // ödev daha derinlikli olsun diye kendi sınıfımı atıp yapmak istedim
        Randomizer rollo = new Randomizer(contestant1, contestant2); // Randomizer sınıfı 2 fighter talep eder.
        // rollo adında bir nesne oluşturuyoruz

        Ring r = new Ring(rollo.f1, rollo.f2, 90 , 100);
        // rollo nesnesi için f1 ve f2 randomizer sınıfında çalıştıktan sonra ortaya çıkan %50 ihtimali kullanmamız sağlıyor.
        r.run();
    }
}