import java.util.HashMap;
import java.util.Scanner;

public class WordRepeat {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // String text = input.nextLine();
        // you can use upper code if you want to put your own text.
        String textStart = "Now I run would like to run. through Run all the values and print them run like, Now run like would run";
        String text = textStart.replaceAll("\\p{Punct}", ""); // deleting punctuation
        String[] textArray = text.split(" "); // split text in array 
        for (int i = 0; i < textArray.length; i++) {
            textArray[i] = textArray[i].toLowerCase(); // lowercase each word of array
        }

        HashMap<String, Integer> howManyWords = new HashMap<String, Integer>(); // create hashmap

        for(String stringer : textArray){ // travel in array
            if(howManyWords.get(stringer) == null){ // cheching is there any key same as this word
                howManyWords.put(stringer, 1); // add first time
            }else{
                howManyWords.put(stringer, howManyWords.get(stringer)+1); // put word again and +1 to value
            }
        }

        int maxValue = 0;
        String maxValuedKey = "";
        for(String i : howManyWords.keySet()){ // travel in hashmap
            if(howManyWords.get(i) > maxValue){ // are value of this key are greater than maxvalue
                maxValue = howManyWords.get(i); // change maxvalue to greater
                maxValuedKey = i; // change key same as value
            }
        }

        System.out.println(maxValuedKey + " word used " + maxValue + " times"); // print
    }
}
