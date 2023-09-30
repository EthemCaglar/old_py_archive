import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessingtheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        int[] inputData = inputGuess(number);
        int howManyGuesses = inputData[inputData.length-1];
        int[] guesses = Arrays.copyOf(inputData, inputData.length-1);
        System.out.print("You made " + howManyGuesses + " guesses: ");
        for(int i = 0 ; i < guesses.length ; i++){
            if(i == guesses.length-1){
                System.out.print(guesses[i] + " ");
            }else{
                System.out.print(guesses[i] + " - ");
            }
        }
        System.out.print("\nAnd the number is " + number);
    }

    public static int[] inputGuess(int number) {
        Scanner input = new Scanner(System.in);
        int[] guesses = new int[0];
        int guess;
        int control = 0;
        while(control < 5){
            System.out.print("Write your guess: ");
            guess = input.nextInt();
            if ( 0 < guess && guess < 99) {
                if(guess < number){
                    System.out.println("Number is higher |^|");
                    guesses = Arrays.copyOf(guesses, guesses.length+1);
                    guesses[control] = guess;
                }else if(number < guess){
                    System.out.println("Number is lower |v|");
                    guesses = Arrays.copyOf(guesses, guesses.length+1);
                    guesses[control] = guess;
                }else{
                    System.out.println("!!! !! ! CONGRATS ! !! !!!");
                    guesses = Arrays.copyOf(guesses, guesses.length+1);
                    guesses[control] = guess;
                    control++;
                    break;
                }
                control++;
            }else{
                System.out.println("Guess must be between 0-100");
            }
            System.out.println("Remaining Guess (" + (5-control) + ")");
        }
        guesses = Arrays.copyOf(guesses, guesses.length+1);
        guesses[control] = control;
        return guesses;
    }
}
