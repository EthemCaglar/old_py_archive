package Boks;

public class Randomizer {
    Fighter f1;
    Fighter f2;

    public Randomizer(Fighter f1, Fighter f2) {
        double coinflip = Math.random() * 100;
        System.out.println("\n" + coinflip + "\n");
        if(coinflip < 50.0){
            this.f1 = f1;
            this.f2 = f2;
        }else{
            this.f1 = f2;
            this.f2 = f1;
        }
    }
}
