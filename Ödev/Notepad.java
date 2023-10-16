package Notepad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your text for new line: ");
        String text = scanner.nextLine();

        try{
            FileReader fileReader = new FileReader("C:\\Users\\cagla\\OneDrive\\Belgeler\\patika\\java\\Ödev\\Notepad\\note.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            ArrayList<String> reads = new ArrayList<>();

            String lines;
            while ((lines = bufferedReader.readLine()) != null) {
                reads.add(lines);
                System.out.println(lines);
            }

            FileWriter fileWriter = new FileWriter("C:\\Users\\cagla\\OneDrive\\Belgeler\\patika\\java\\Ödev\\Notepad\\note.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);


            for (String i : reads) {
                printWriter.println(i);
            }
            printWriter.print(text);
            System.out.println(text);

            bufferedReader.close();
            printWriter.close();
        }catch (IOException e){
            System.out.print("!!! Error !!! IOException !!!");
        }
    }
}
