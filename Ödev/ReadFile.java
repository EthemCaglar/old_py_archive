package FileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;

public class ReadFile {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("C:\\Users\\sansur\\Belgeler\\patika\\java\\FileRead\\data.txt");
            BufferedReader input = new BufferedReader(file); 
            String line;
            int result = 0;
            while ((line = input.readLine()) != null){
                System.out.println(line);
                result += Integer.parseInt(line);
            }
            input.close();
            System.out.println("\n" +result);
        }catch (IOException e){
            System.out.println("IOE Hata");
        }
    }
}
